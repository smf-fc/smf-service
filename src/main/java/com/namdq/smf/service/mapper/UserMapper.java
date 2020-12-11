package com.namdq.smf.service.mapper;

import com.namdq.smf.service.dto.UserDto;
import com.namdq.smf.service.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto mapUserDto(UserEntity userEntity);

    UserEntity mapUserEntity(UserDto userDto);
}
