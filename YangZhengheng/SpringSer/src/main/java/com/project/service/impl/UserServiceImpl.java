package com.project.service.impl;

import com.project.entity.UserEntity;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    /***/
    @Resource
    private IUserMapper mapper;

    @Override
    public UserEntity findUser(String name) {
        return mapper.findAllUser(name);
    }

    @Override
    public void addUser(UserEntity userEntity) {
          mapper.addUser(userEntity);
    }

    @Override
    public int newId() {
        return mapper.lastId();
    }
}

