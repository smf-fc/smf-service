package com.namdq.smf.service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "Player")
@Table(name = "players")
public class PlayerEntity extends AuditEntity {

    @Id
    private long id;

    private String name;

    private String number;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "player")
    private List<CheckinEntity> checkins;
}
