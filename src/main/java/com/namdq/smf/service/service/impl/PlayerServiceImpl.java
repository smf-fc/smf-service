package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.PlayerDto;
import com.namdq.smf.service.service.PlayerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Override
    public PlayerDto create(PlayerDto playerDto) {
        return null;
    }

    @Override
    public PlayerDto get(long id) {
        return null;
    }

    @Override
    public Page<PlayerDto> get(Pageable pageable) {
        return null;
    }

    @Override
    public PlayerDto update(long id, PlayerDto playerDto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
