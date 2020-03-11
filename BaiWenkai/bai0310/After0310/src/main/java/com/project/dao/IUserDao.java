package com.project.dao;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {

    @Insert("insert into t_user(f_name,f_pwd,f_age)values(#{name},#{pwd},#{age})")
    void addUser(UserEntity user);

    @Select("select * from t_user where pk_id = #{id}")
    @ResultMap("userRM")
    UserEntity findById(int id);
}
