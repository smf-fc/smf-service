package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.CheckinDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/checkins")
public interface CheckinController extends BaseController<CheckinDto> {

    @GetMapping("/match/{id}")
    List<CheckinDto> findAllCheckinDtoByMatchId(@PathVariable("id") int id);
}
