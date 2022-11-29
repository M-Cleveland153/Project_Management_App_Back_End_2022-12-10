package com.finalproject.finalproject.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finalproject.finalproject.model.UserRequestDto;
import com.finalproject.finalproject.model.UserResponseDto;
import com.finalproject.finalproject.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{@Override
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UserResponseDto> getUsersByCompany(Long companyId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserResponseDto getUserByUserId(long userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UserResponseDto updateUser(long userId) {
        // TODO Auto-generated method stub
        return null;
    }

}
