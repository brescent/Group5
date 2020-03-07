package com.project.mapper;

import com.project.bean.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("select *from t_user")
    @ResultMap("userMap")
    public List<UserBean> finAll();
    @Insert("insert into t_user(username,pwd,age) values(#{name},#{pwd},#{age})")
    public void  add(UserBean bean);
    @Delete("delete from t_user where id=#{id}")
    public  void del(int id);
    @Update("update t_user set username=#{name} ,pwd =#{pwd}, age=#{age} where id=#{id}")
    public  void  updata(UserBean bean);
}
