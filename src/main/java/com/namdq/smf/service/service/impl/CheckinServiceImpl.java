package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.CheckinDto;
import com.namdq.smf.service.service.CheckinService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CheckinServiceImpl implements CheckinService {

    @Override
    public CheckinDto create(CheckinDto checkinDto) {
        return null;
    }

    @Override
    public CheckinDto get(long id) {
        return null;
    }

    @Override
    public Page<CheckinDto> get(Pageable pageable) {
        return null;
    }

    @Override
    public CheckinDto update(long id, CheckinDto checkinDto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
