package com.namdq.smf.service.repository;

import com.namdq.smf.service.entity.CheckinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckinRepository extends JpaRepository<CheckinEntity, Long> {
}
