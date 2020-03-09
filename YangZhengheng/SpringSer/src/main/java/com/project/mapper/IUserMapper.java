package com.project.mapper;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserMapper {
    @Select("select * from t_user")
    @ResultMap("userRM")
    public UserEntity findAllUser();

    @Insert("INSERT INTO t_user(f_name,f_pwd,f_phone) VALUES(#{name},#{pwd},#{pwd});")
    public void addUser(UserEntity user);
}
