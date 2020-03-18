package com.project;

import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.entity.UserRoleEntity;
import com.project.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;

import java.util.List;

public class  Test {

    Session session=null;
    Transaction tr=null;
    @Before
    public void create(){
        session= HibernateSession.createSession();
        tr=session.getTransaction();
        tr.begin();
    }

    @org.junit.Test
    public void getUser(){
        UserEntity user=session.get(UserEntity.class,2);
        for (UserRoleEntity re:user.getRoleUserList()){
            System.out.println(re.getRoleEntity().getRoleName());
        }

    }


    @After
    public  void close(){
        tr.commit();
        session.close();
    }


}
