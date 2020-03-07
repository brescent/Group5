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
    @Resource
    private IUserMapper mapper;

    @Override
    public List<UserEntity> findAllUser() {

        return mapper.findAllUser();
    }

    @Override
    public void deleteUser(int id) {
        mapper.deleteUser(id);
    }

    @Override
    public void updateUser(int id, String pwd) {
            mapper.updateUser(id, pwd);
    }

    @Override
    public void addUser(UserEntity user) {
            mapper.addUser(user);
    }
}

