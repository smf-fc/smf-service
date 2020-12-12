package com.namdq.smf.service.dto;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class AuditDto {

    private LocalDateTime createdDate;

    private LocalDateTime lastModifiedDate;
}
