package com.namdq.smf.service.repository;

import com.namdq.smf.service.entity.PitchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PitchRepository extends JpaRepository<PitchEntity, Long> {
}
