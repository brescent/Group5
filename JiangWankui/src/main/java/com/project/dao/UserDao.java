package com.project.dao;

import com.project.bean.UserBean;

import java.util.List;

public interface UserDao {
    public List<UserBean> finAll();
    public void  add(UserBean bean);
    public  void del(int id);
    public  void  updata(UserBean bean);
}
