package com.namdq.smf.service.controller.impl;

import com.namdq.smf.service.controller.PlayerController;
import com.namdq.smf.service.dto.PlayerDto;
import com.namdq.smf.service.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerControllerImpl implements PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerControllerImpl(PlayerService playerService) {
        this.playerService = playerService;
    }

    @Override
    public Page<PlayerDto> get(int page, int size) {
        return this.playerService.get(PageRequest.of(page, size));
    }

    @Override
    public PlayerDto create(PlayerDto playerDto) {
        return this.playerService.create(playerDto);
    }

    @Override
    public PlayerDto get(long id) {
        return this.playerService.get(id);
    }

    @Override
    public PlayerDto update(long id, PlayerDto playerDto) {
        return this.playerService.update(id, playerDto);
    }

    @Override
    public void delete(long id) {
        this.playerService.delete(id);
    }
}
