package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.MatchDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/matches")
public interface MatchController extends BaseController<MatchDto> {
}
