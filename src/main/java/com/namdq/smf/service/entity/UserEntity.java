package com.namdq.smf.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "user")
@Table(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean active;
}
