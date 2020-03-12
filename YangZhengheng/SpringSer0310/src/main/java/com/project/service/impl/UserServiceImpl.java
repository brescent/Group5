package com.project.service.impl;

import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;
import com.project.mapper.IUserMapper;
import com.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements IUserService {
    /***/
    @Autowired
    private IUserMapper mapper;
    @Override
    public UserEntity findUser(int id) {
        return mapper.findUser(id);
    }

    @Override
    public void addUser(UserEntity user) {
        mapper.addUser(user);
    }

    @Override
    public void addUserInfo(UserInfoEntity userInfoEntity) {
        mapper.addUserInfo(userInfoEntity);
    }

    @Override
    public int newId() {
        return mapper.newId();
    }

    @Override
    public List<UserEntity> findLL() {

        return  mapper.findAll();
    }
}
