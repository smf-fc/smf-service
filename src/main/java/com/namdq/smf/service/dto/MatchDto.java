package com.namdq.smf.service.dto;


import com.namdq.smf.service.entity.AuditEntity;
import com.namdq.smf.service.entity.CheckinEntity;
import com.namdq.smf.service.entity.PitchEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class MatchDto extends AuditEntity {

    private long id;

    private LocalDate date;

    private LocalTime time;

    private PitchEntity pitch;

    private List<CheckinEntity> checkins;
}
