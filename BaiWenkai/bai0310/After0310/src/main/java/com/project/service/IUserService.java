package com.project.service;

import com.project.entity.InfoEntity;
import com.project.entity.UserEntity;

import java.util.List;

public interface IUserService {

    void addUSer(UserEntity user);

    UserEntity findById(int id);
}
