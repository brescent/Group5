package com.project.service;

import com.project.entity.UserEntity;

import java.util.List;

public  interface IUserService {
    /**
     * 查询用户
     * @param name
     * @return
     */
    public  UserEntity findUser(String name);


    public void addUser(UserEntity user);
}
