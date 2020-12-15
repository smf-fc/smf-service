package com.namdq.smf.service.controller.impl;

import com.namdq.smf.service.controller.PitchController;
import com.namdq.smf.service.dto.PitchDto;
import com.namdq.smf.service.service.PitchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PitchControllerImpl implements PitchController {

    private final PitchService pitchService;

    @Autowired
    public PitchControllerImpl(PitchService pitchService) {
        this.pitchService = pitchService;
    }

    @Override
    public Page<PitchDto> get(int page, int size) {
        return this.pitchService.get(PageRequest.of(page, size));
    }

    @Override
    public PitchDto create(PitchDto pitchDto) {
        return this.pitchService.create(pitchDto);
    }

    @Override
    public PitchDto get(long id) {
        return this.pitchService.get(id);
    }

    @Override
    public PitchDto update(long id, PitchDto pitchDto) {
        return this.pitchService.update(id, pitchDto);
    }

    @Override
    public void delete(long id) {
        this.pitchService.delete(id);
    }
}
