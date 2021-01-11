package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.contanst.MatchStatus;
import com.namdq.smf.service.dto.MatchDto;
import com.namdq.smf.service.entity.MatchEntity;
import com.namdq.smf.service.mapper.ModelMapper;
import com.namdq.smf.service.repository.MatchRepository;
import com.namdq.smf.service.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    @Autowired
    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public MatchDto create(MatchDto matchDto) {
        MatchEntity matchEntity = ModelMapper.getInstance().mapToEntity(matchDto);
        matchEntity.setStatus(MatchStatus.OPEN_CHECK_IN);
        matchEntity = this.matchRepository.save(matchEntity);
        return ModelMapper.getInstance().mapToDto(matchEntity);
    }

    @Override
    public MatchDto get(long id) {
        Optional<MatchEntity> matchEntity = this.matchRepository.findById(id);
        if (!matchEntity.isPresent()) {
            throw new EntityNotFoundException("Match not found.");
        }
        return ModelMapper.getInstance().mapToDto(matchEntity.get());
    }

    @Override
    public Page<MatchDto> get(Pageable pageable) {
        Page<MatchEntity> matchEntities = this.matchRepository.findAll(pageable);
        return matchEntities.map(ModelMapper.getInstance()::mapToDto);
    }

    @Override
    public MatchDto update(long id, MatchDto matchDto) {
        if (!this.matchRepository.existsById(id)) {
            throw new EntityNotFoundException("Match not found.");
        }
        MatchEntity matchEntity = ModelMapper.getInstance().mapToEntity(matchDto);
        matchEntity.setId(id);
        matchEntity = this.matchRepository.save(matchEntity);
        return ModelMapper.getInstance().mapToDto(matchEntity);
    }

    @Override
    public void delete(long id) {
        this.matchRepository.deleteById(id);
    }
}
