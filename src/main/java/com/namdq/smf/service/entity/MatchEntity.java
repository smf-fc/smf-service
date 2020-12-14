package com.namdq.smf.service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "Match")
@Table(name = "matches")
public class MatchEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate date;

    private LocalTime time;

    @ManyToOne
    private PitchEntity pitch;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "match")
    private List<CheckinEntity> checkins;
}
