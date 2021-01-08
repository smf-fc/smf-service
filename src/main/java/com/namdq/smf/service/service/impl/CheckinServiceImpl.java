package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.CheckinDto;
import com.namdq.smf.service.entity.CheckinEntity;
import com.namdq.smf.service.mapper.ModelMapper;
import com.namdq.smf.service.repository.CheckinRepository;
import com.namdq.smf.service.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CheckinServiceImpl implements CheckinService {

    private final CheckinRepository checkinRepository;

    @Autowired
    public CheckinServiceImpl(CheckinRepository checkinRepository) {
        this.checkinRepository = checkinRepository;
    }

    @Override
    public CheckinDto create(CheckinDto checkinDto) {
        CheckinEntity checkinEntity = ModelMapper.getInstance().mapToEntity(checkinDto);
        Optional<CheckinEntity> entityOptional = findFirstByMatchIdAndPlayerId(checkinEntity);
        if (entityOptional.isPresent()) {
            checkinEntity.setId(entityOptional.get().getId());
        }
        checkinEntity = this.checkinRepository.save(checkinEntity);
        return ModelMapper.getInstance().mapToDto(checkinEntity);
    }

    @Override
    public CheckinDto get(long id) {
        Optional<CheckinEntity> checkinEntity = this.checkinRepository.findById(id);
        if (!checkinEntity.isPresent()) {
            throw new EntityNotFoundException("Checkin not found.");
        }
        return ModelMapper.getInstance().mapToDto(checkinEntity.get());
    }

    @Override
    public Page<CheckinDto> get(Pageable pageable) {
        Page<CheckinEntity> checkinEntities = this.checkinRepository.findAll(pageable);
        return checkinEntities.map(ModelMapper.getInstance()::mapToDto);
    }

    @Override
    public CheckinDto update(long id, CheckinDto checkinDto) {
        if (!this.checkinRepository.existsById(id)) {
            throw new EntityNotFoundException("Checkin not found.");
        }
        CheckinEntity checkinEntity = ModelMapper.getInstance().mapToEntity(checkinDto);

        Optional<CheckinEntity> entityOptional = findFirstByMatchIdAndPlayerId(checkinEntity);
        entityOptional.ifPresent(entity -> {
            if (id != entity.getId()) {
                throw new EntityExistsException("Checkin exists.");
            }
        });

        checkinEntity.setId(id);
        checkinEntity = this.checkinRepository.save(checkinEntity);
        return ModelMapper.getInstance().mapToDto(checkinEntity);
    }

    @Override
    public void delete(long id) {
        this.checkinRepository.deleteById(id);
    }

    @Override
    public List<CheckinDto> findAllCheckinDtoByMatchId(int id) {
        List<CheckinEntity> checkinEntities = this.checkinRepository.findAllByMatchId(id);
        return checkinEntities.stream().map(ModelMapper.getInstance()::mapToDto).collect(Collectors.toList());
    }

    private Optional<CheckinEntity> findFirstByMatchIdAndPlayerId(CheckinEntity checkinEntity) {
        long matchId = checkinEntity.getMatch().getId();
        long playerId = checkinEntity.getPlayer().getId();
        return this.checkinRepository.findFirstByMatchIdAndPlayerId(matchId, playerId);
    }
}
