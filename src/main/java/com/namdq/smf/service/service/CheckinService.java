package com.namdq.smf.service.service;

import com.namdq.smf.service.dto.CheckinDto;

import java.util.List;

public interface CheckinService extends BaseService<CheckinDto> {

    List<CheckinDto> findAllCheckinDtoByMatchId(int id);
}
