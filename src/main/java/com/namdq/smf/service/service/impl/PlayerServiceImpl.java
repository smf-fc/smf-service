package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.PlayerDto;
import com.namdq.smf.service.entity.PlayerEntity;
import com.namdq.smf.service.mapper.ModelMapper;
import com.namdq.smf.service.repository.PlayerRepository;
import com.namdq.smf.service.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public PlayerDto create(PlayerDto playerDto) {
        PlayerEntity playerEntity = ModelMapper.getInstance().mapToEntity(playerDto);
        playerEntity = this.playerRepository.save(playerEntity);
        return ModelMapper.getInstance().mapToDto(playerEntity);
    }

    @Override
    public PlayerDto get(long id) {
        Optional<PlayerEntity> playerEntity = this.playerRepository.findById(id);
        if (!playerEntity.isPresent()) {
            throw new EntityNotFoundException("Player not found.");
        }
        return ModelMapper.getInstance().mapToDto(playerEntity.get());
    }

    @Override
    public Page<PlayerDto> get(Pageable pageable) {
        Page<PlayerEntity> playerEntities = this.playerRepository.findAll(pageable);
        return playerEntities.map(ModelMapper.getInstance()::mapToDto);
    }

    @Override
    public PlayerDto update(long id, PlayerDto playerDto) {
        if (!this.playerRepository.existsById(id)) {
            throw new EntityNotFoundException("Player not found.");
        }
        PlayerEntity playerEntity = ModelMapper.getInstance().mapToEntity(playerDto);
        playerEntity.setId(id);
        playerEntity = this.playerRepository.save(playerEntity);
        return ModelMapper.getInstance().mapToDto(playerEntity);
    }

    @Override
    public void delete(long id) {
        this.playerRepository.deleteById(id);
    }
}
