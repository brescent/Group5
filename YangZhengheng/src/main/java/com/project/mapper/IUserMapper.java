package com.project.mapper;

import com.project.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserMapper {
    @Select("select * from t_user")
    @ResultMap("userRM")
    public List<UserEntity> findAllUser();

    @Delete("DELETE FROM t_user WHERE pk_id=#{id}")
    public void deleteUser(@Param("id") int id);

    @Update("UPDATE t_user SET f_pwd=#{pwd} WHERE pk_id=#{id};")
    public void updateUser(@Param("id") int id, @Param("pwd") String pwd);

    @Insert("INSERT INTO t_user(f_name,f_pwd,f_phone) VALUES(#{name},#{pwd},#{pwd});")
    public void addUser(UserEntity user);
}
