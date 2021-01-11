package com.namdq.smf.service.controller.impl;

import com.namdq.smf.service.controller.CheckinController;
import com.namdq.smf.service.dto.CheckinDto;
import com.namdq.smf.service.service.CheckinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CheckinControllerImpl implements CheckinController {

    private final CheckinService checkinService;

    @Autowired
    public CheckinControllerImpl(CheckinService checkinService) {
        this.checkinService = checkinService;
    }

    @Override
    public Page<CheckinDto> get(int page, int size) {
        return this.checkinService.get(PageRequest.of(page, size));
    }

    @Override
    public CheckinDto create(@Valid CheckinDto checkinDto) {
        return this.checkinService.create(checkinDto);
    }

    @Override
    public CheckinDto get(long id) {
        return this.checkinService.get(id);
    }

    @Override
    public CheckinDto update(long id, @Valid CheckinDto checkinDto) {
        return this.checkinService.update(id, checkinDto);
    }

    @Override
    public void delete(long id) {
        this.checkinService.delete(id);
    }

    @Override
    public List<CheckinDto> findAllCheckinDtoByMatchId(int matchId) {
        return this.checkinService.findAllCheckinDtoByMatchId(matchId);
    }
}
