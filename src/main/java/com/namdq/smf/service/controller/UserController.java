package com.namdq.smf.service.controller;

import com.namdq.smf.service.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public interface UserController {

    @GetMapping
    Page<UserDto> get(@RequestParam int page, @RequestParam int size);

    @PostMapping()
    UserDto create(@RequestBody UserDto userDto);

    @GetMapping("/{userId}")
    UserDto get(@PathVariable long userId);

    @PutMapping("/{userId}")
    UserDto update(@PathVariable long userId, @RequestBody UserDto userDto);

    @DeleteMapping("/{userId}")
    void delete(@PathVariable long userId);
}
