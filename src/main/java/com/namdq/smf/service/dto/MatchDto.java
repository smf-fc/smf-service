package com.namdq.smf.service.dto;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class MatchDto extends AuditDto {

    private long id;

    private LocalDateTime dateTime;

    private PitchDto pitch;
}
