package com.namdq.smf.service.service.impl;

import com.namdq.smf.service.dto.UserDto;
import com.namdq.smf.service.entity.UserEntity;
import com.namdq.smf.service.mapper.UserMapper;
import com.namdq.smf.service.repository.UserRepository;
import com.namdq.smf.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto create(UserDto userDto) {
        UserEntity userEntity = UserMapper.INSTANCE.userDtoToUserEntity(userDto);
        userEntity = this.userRepository.save(userEntity);
        return UserMapper.INSTANCE.userEntityToUserDto(userEntity);
    }

    @Override
    public UserDto get(long id) {
        Optional<UserEntity> userEntity = this.userRepository.findById(id);
        if (!userEntity.isPresent()) {
            throw new EntityNotFoundException("User not found.");
        }
        return UserMapper.INSTANCE.userEntityToUserDto(userEntity.get());
    }

    @Override
    public Page<UserDto> get(Pageable pageable) {
        Page<UserEntity> userEntities = this.userRepository.findAll(pageable);
        return userEntities.map(UserMapper.INSTANCE::userEntityToUserDto);
    }

    @Override
    public UserDto update(long id, UserDto userDto) {
        if (!this.userRepository.existsById(id)) {
            throw new EntityNotFoundException("User not found.");
        }
        UserEntity userEntity = UserMapper.INSTANCE.userDtoToUserEntity(userDto);
        userEntity.setId(id);
        userEntity = this.userRepository.save(userEntity);
        return UserMapper.INSTANCE.userEntityToUserDto(userEntity);
    }

    @Override
    public void delete(long id) {
        this.userRepository.deleteById(id);
    }
}
