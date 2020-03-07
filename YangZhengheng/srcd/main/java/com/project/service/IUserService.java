package com.project.service;

import com.project.entity.UserEntity;

import java.util.List;

public  interface IUserService {
    public List<UserEntity> findAllUser();

    public void deleteUser(int id);


    public void updateUser(int id, String pwd);


    public void addUser(UserEntity user);
}
