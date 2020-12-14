package com.namdq.smf.service.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PitchDto extends AuditDto {

    private long id;

    private String name;

    private String address;

    private String phoneNumber;
}
