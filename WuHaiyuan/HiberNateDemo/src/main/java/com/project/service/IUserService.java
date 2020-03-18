package com.project.service;

import com.project.entity.UserEntity;

public interface IUserService {


    void add(UserEntity user);

    UserEntity find(int id);

    void  update(int id, String newName);

    void delete(int id);
}
