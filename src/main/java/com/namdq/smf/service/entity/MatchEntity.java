package com.namdq.smf.service.entity;

import com.namdq.smf.service.contanst.MatchStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "Match")
@Table(name = "matches")
public class MatchEntity extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pitch_id")
    private PitchEntity pitch;

    @Enumerated(EnumType.STRING)
    private MatchStatus status;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "match")
    private List<CheckinEntity> checkins;
}
