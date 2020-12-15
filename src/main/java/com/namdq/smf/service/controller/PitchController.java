package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.PitchDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pitches")
public interface PitchController extends BaseController<PitchDto> {
}
