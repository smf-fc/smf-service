package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.PitchDto;
import com.namdq.smf.service.entity.PitchEntity;
import com.namdq.smf.service.mapper.ModelMapper;
import com.namdq.smf.service.repository.PitchRepository;
import com.namdq.smf.service.service.PitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class PitchServiceImpl implements PitchService {

    private final PitchRepository pitchRepository;

    @Autowired
    public PitchServiceImpl(PitchRepository pitchRepository) {
        this.pitchRepository = pitchRepository;
    }

    @Override
    public PitchDto create(PitchDto pitchDto) {
        PitchEntity pitchEntity = ModelMapper.getInstance().mapToEntity(pitchDto);
        pitchEntity = this.pitchRepository.save(pitchEntity);
        return ModelMapper.getInstance().mapToDto(pitchEntity);
    }

    @Override
    public PitchDto get(long id) {
        Optional<PitchEntity> pitchEntity = this.pitchRepository.findById(id);
        if (!pitchEntity.isPresent()) {
            throw new EntityNotFoundException("Pitch not found.");
        }
        return ModelMapper.getInstance().mapToDto(pitchEntity.get());
    }

    @Override
    public Page<PitchDto> get(Pageable pageable) {
        Page<PitchEntity> pitchEntities = this.pitchRepository.findAll(pageable);
        return pitchEntities.map(ModelMapper.getInstance()::mapToDto);
    }

    @Override
    public PitchDto update(long id, PitchDto pitchDto) {
        if (!this.pitchRepository.existsById(id)) {
            throw new EntityNotFoundException("Pitch not found.");
        }
        PitchEntity pitchEntity = ModelMapper.getInstance().mapToEntity(pitchDto);
        pitchEntity.setId(id);
        pitchEntity = this.pitchRepository.save(pitchEntity);
        return ModelMapper.getInstance().mapToDto(pitchEntity);
    }

    @Override
    public void delete(long id) {
        this.pitchRepository.deleteById(id);
    }
}
