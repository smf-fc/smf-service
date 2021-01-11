package com.namdq.smf.service.dto;


import com.namdq.smf.service.contanst.MatchStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
public class MatchDto extends AuditDto {

    private long id;

    private String name;

    private LocalDateTime dateTime;

    private PitchDto pitch;

    private MatchStatus status;
}
