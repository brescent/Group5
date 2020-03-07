package com.project.service.impl;

import com.project.entity.UserEntity;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper mapper;

    @Override
    public void addUser(UserEntity user) {
        mapper.addUser(user);
    }

    @Override
    public void delUser(int id) {
        mapper.delUser(id);
    }

    @Override
    public void updUserName(int id, String newName) {
        mapper.updUserName(id, newName);
    }

    @Override
    public List<UserEntity> findAll() {
        return mapper.findAll();
    }
}
