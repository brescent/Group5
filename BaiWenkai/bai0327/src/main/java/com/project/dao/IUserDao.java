package com.project.dao;

import com.project.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    UserEntity login(String userName,String password);
}
