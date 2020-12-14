package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.MatchDto;
import com.namdq.smf.service.service.MatchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {

    @Override
    public MatchDto create(MatchDto matchDto) {
        return null;
    }

    @Override
    public MatchDto get(long id) {
        return null;
    }

    @Override
    public Page<MatchDto> get(Pageable pageable) {
        return null;
    }

    @Override
    public MatchDto update(long id, MatchDto matchDto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
