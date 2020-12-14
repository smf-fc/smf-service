package com.namdq.smf.service.dto;

import com.namdq.smf.service.entity.AuditEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PitchDto extends AuditEntity {

    private long id;

    private String name;

    private String address;

    private String phoneNumber;
}
