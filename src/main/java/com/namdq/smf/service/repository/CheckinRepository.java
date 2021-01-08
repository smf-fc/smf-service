package com.namdq.smf.service.repository;

import com.namdq.smf.service.entity.CheckinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CheckinRepository extends JpaRepository<CheckinEntity, Long> {

    List<CheckinEntity> findAllByMatchId(long id);

    Optional<CheckinEntity> findFirstByMatchIdAndPlayerId(long matchId, long playerId);

    List<CheckinEntity> findAllByMatchIdAndPlayerId(long matchId, long playerId);
}
