package com.namdq.smf.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuditDto {

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;
}
