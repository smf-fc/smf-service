package com.namdq.smf.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckinDto extends AuditDto {

    private long id;

    private PlayerDto player;

    private MatchDto match;

    private boolean wasJoin;
}
