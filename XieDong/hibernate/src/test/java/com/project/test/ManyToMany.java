package com.project.test;

import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.entity.UserRoleEntity;
import com.project.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManyToMany {

    private Session  session=null;
     private Transaction ts=null;
    @Before
    public void before(){
        session= HibernateSession.createSession();
        ts= session.getTransaction();
        ts.begin();
    }



@Test
    public void add(){

        UserEntity  user=new UserEntity("战是干","123",23);
        RoleEntity  role=new RoleEntity();
        role.setRoleName("超级管理员");

        UserRoleEntity ur=new UserRoleEntity();

        ur.setRole(role);
        ur.setUser(user);
        session.save(user);
        session.save(role);
        session.save(ur);



    }

    @Test
    public void getRole(){

        UserEntity user=session.get(UserEntity.class,"4028818770ed185a0170ed185dca0000");


        for (UserRoleEntity role:user.getSet()){

            System.out.println(role.getRole().getRoleName());

        }



    }


    @After
    public void after(){

        ts.commit();
        session.close();
    }



}
