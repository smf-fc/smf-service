package com.namdq.smf.service.controller.impl;

import com.namdq.smf.service.controller.UserController;
import com.namdq.smf.service.dto.UserDto;
import com.namdq.smf.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Page<UserDto> get(int page, int size) {
        return this.userService.get(PageRequest.of(page, size));
    }

    @Override
    public UserDto create(UserDto userDto) {
        return this.userService.create(userDto);
    }

    @Override
    public UserDto get(long userId) {
        return this.userService.get(userId);
    }

    @Override
    public UserDto update(long userId, UserDto userDto) {
        return this.userService.update(userId, userDto);
    }

    @Override
    public void delete(long userId) {
        this.userService.delete(userId);
    }
}
