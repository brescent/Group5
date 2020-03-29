package com.project.service;

import com.project.entity.LimitEntity;
import com.project.entity.UserEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IUserService {
    UserEntity login(String userName,String password);

    public List<LimitEntity> getLimitByUserId(int id);
}
