package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.PlayerDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/players")
public interface PlayerController extends BaseController<PlayerDto> {
}
