package com.boot.dao;

import com.boot.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao  {

    public List<UserEntity> findAll();

    public UserEntity login(String name,String pwd);

    public void register(UserEntity user);
}
