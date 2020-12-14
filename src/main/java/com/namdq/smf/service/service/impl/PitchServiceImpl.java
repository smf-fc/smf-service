package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.PitchDto;
import com.namdq.smf.service.service.PitchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PitchServiceImpl implements PitchService {

    @Override
    public PitchDto create(PitchDto pitchDto) {
        return null;
    }

    @Override
    public PitchDto get(long id) {
        return null;
    }

    @Override
    public Page<PitchDto> get(Pageable pageable) {
        return null;
    }

    @Override
    public PitchDto update(long id, PitchDto pitchDto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
