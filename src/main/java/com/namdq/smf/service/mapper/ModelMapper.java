package com.namdq.smf.service.mapper;

import com.namdq.smf.service.dto.*;
import com.namdq.smf.service.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ModelMapper {

    static ModelMapper getInstance() {
        return Mappers.getMapper(ModelMapper.class);
    }

    UserDto mapToDto(UserEntity userEntity);

    UserEntity mapToEntity(UserDto userDto);

    PlayerDto mapToDto(PlayerEntity playerEntity);

    PlayerEntity mapToEntity(PlayerDto playerDto);

    PitchDto mapToDto(PitchEntity pitchEntity);

    PitchEntity mapToEntity(PitchDto pitchDto);

    MatchDto mapToDto(MatchEntity matchEntity);

    MatchEntity mapToEntity(MatchDto matchDto);

    CheckinDto mapToDto(CheckinEntity checkinEntity);

    CheckinEntity mapToEntity(CheckinDto checkinDto);
}
