package com.namdq.smf.service.dto;

import com.namdq.smf.service.entity.AuditEntity;
import com.namdq.smf.service.entity.CheckinEntity;
import com.namdq.smf.service.entity.UserEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class PlayerDto extends AuditEntity {

    private long id;

    private String name;

    private String number;

    private UserEntity user;

    private List<CheckinEntity> checkins;
}
