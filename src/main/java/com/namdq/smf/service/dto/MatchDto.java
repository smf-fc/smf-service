package com.namdq.smf.service.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.LocalTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class MatchDto extends AuditDto {

    private long id;

    private LocalDate date;

    private LocalTime time;

    private PitchDto pitch;
}
