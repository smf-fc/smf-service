package com.namdq.smf.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDto extends AuditDto {

    private long id;

    private String username;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private boolean active;
}
