package com.namdq.smf.service.dto;

import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean active;
}
