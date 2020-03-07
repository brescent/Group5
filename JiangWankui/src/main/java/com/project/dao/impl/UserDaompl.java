package com.project.dao.impl;

import com.project.bean.UserBean;
import com.project.dao.UserDao;
import com.project.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserDaompl implements UserDao {
    @Resource
    private UserMapper mapper;
    @Override
    public List<UserBean> finAll() {
        return mapper.finAll();
    }

    @Override
    public void add(UserBean bean) {
    mapper.add(bean);
    }

    @Override
    public void del(int id) {
        mapper.del(id);
    }

    @Override
    public void updata(UserBean bean) {
  mapper.updata(bean);
    }
}
