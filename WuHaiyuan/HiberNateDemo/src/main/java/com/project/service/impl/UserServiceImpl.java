package com.project.service.impl;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserServiceImpl implements IUserService {
    @Override
    public void add(UserEntity user) {
        //获取hibernate连接
        Session session = NateSession.getSession();
        //获取hibernate事务管理器
        Transaction transaction =  session.getTransaction();
        //开启事务
        transaction.begin();
        //执行方法
        session.save(user);
        //提交事务
        transaction.commit();
        //关闭连接
        session.close();

    }

    @Override
    public UserEntity find(int id) {
        Session session = NateSession.getSession();

        UserEntity userEntity = session.get(UserEntity.class,id);

        return userEntity;
    }

    @Override
    public void update(int id,String newName) {
        Session session = NateSession.getSession();
        UserEntity userEntity = session.get(UserEntity.class,id);
        userEntity.setUserName(newName);
        Transaction transaction =  session.getTransaction();
        transaction.begin();
        session.update(userEntity);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(int id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        Session session = NateSession.getSession();
        Transaction transaction =  session.getTransaction();
        transaction.begin();
        session.delete(userEntity);
        transaction.commit();
        session.close();
    }
}
