package com.project.service;

import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;


public interface IUserService {
    public UserEntity findUser(int id);


    public void addUser(UserEntity user);


    public void addUserInfo(UserInfoEntity userInfoEntity);


    public int newId();
}
