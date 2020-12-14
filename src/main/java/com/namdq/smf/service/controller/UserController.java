package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public interface UserController extends BaseController<UserDto> {
}
