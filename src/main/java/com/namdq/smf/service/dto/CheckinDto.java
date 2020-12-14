package com.namdq.smf.service.dto;

import com.namdq.smf.service.entity.MatchEntity;
import com.namdq.smf.service.entity.PlayerEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CheckinDto extends AuditDto {

    private long id;

    private PlayerEntity player;

    private MatchEntity match;

    private boolean wasJoin;
}
