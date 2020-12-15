package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.CheckinDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/checkins")
public interface CheckinController extends BaseController<CheckinDto> {
}
