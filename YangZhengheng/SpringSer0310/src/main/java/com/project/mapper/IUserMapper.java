package com.project.mapper;

import com.project.entity.UserEntity;
import com.project.entity.UserInfoEntity;
import org.apache.ibatis.annotations.*;

public interface IUserMapper {
    @Select("select * from t_user where pk_id = #{id}")
    @ResultMap("userRM")
    public UserEntity findUser(@Param("id") int id);

    /***/
    public void addUser(UserEntity user);

    @Insert("insert into t_userInfo(fk_userId,f_job,f_money) values(#{userId},#{job},#{money})")
    public void addUserInfo(UserInfoEntity userInfoEntity);


    @Select("SELECT LAST_INSERT_ID();")
    @ResultType(Integer.class)
    public int newId();
}
