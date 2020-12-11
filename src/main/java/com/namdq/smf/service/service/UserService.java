package com.namdq.smf.service.service;

import com.namdq.smf.service.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto create(UserDto userDto);

    UserDto get(long id);

    Page<UserDto> get(Pageable pageable);

    UserDto update(long id, UserDto userDto);

    void delete(long id);
}
