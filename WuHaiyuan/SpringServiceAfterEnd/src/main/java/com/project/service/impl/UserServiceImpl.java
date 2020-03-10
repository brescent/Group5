package com.project.service.impl;

import com.project.entity.UserEntity;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper userMapper;

    @Override
    public UserEntity findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        userMapper.addUser(user);
        return user;
    }

    @Override
    public List<UserEntity> findAll() {
        return userMapper.findAll();
    }
}
