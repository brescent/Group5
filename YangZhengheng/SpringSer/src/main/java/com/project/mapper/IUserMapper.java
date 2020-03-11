package com.project.mapper;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserMapper {
    @Select("select * from t_user where f_name like #{name}")
    @ResultMap("userRM")
    public UserEntity findAllUser(@Param("name") String name);

    @Insert("INSERT INTO t_user (f_name,f_pwd,f_phone) VALUES(#{name},#{pwd},#{pwd});")
    public void addUser(UserEntity user);
    /***/
    @Select("SELECT LAST_INSERT_ID();")
    @ResultType(Integer.class)
    public int lastId();
}
