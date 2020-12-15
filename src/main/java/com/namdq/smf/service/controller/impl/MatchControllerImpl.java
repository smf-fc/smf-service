package com.namdq.smf.service.controller.impl;

import com.namdq.smf.service.controller.MatchController;
import com.namdq.smf.service.dto.MatchDto;
import com.namdq.smf.service.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchControllerImpl implements MatchController {

    private final MatchService matchService;

    @Autowired
    public MatchControllerImpl(MatchService matchService) {
        this.matchService = matchService;
    }

    @Override
    public Page<MatchDto> get(int page, int size) {
        return this.matchService.get(PageRequest.of(page, size));
    }

    @Override
    public MatchDto create(MatchDto matchDto) {
        return this.matchService.create(matchDto);
    }

    @Override
    public MatchDto get(long id) {
        return this.matchService.get(id);
    }

    @Override
    public MatchDto update(long id, MatchDto matchDto) {
        return this.matchService.update(id, matchDto);
    }

    @Override
    public void delete(long id) {
        this.matchService.delete(id);
    }
}
