package com.project.test;

import com.project.entity.UserEntity;
import com.project.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;


public class MyTest {
    @Test
     public void test(){
        System.out.println(HibernateSession.createSession());
     }

     @Test
     public void addTest(){
         UserEntity user=new UserEntity();
         user.setId(1);
         user.setName("Will");
         user.setPwd("123");
         user.setAge(18);
       Session session=HibernateSession.createSession();
       //开启事务
        Transaction tr= session.getTransaction();
        tr.begin();
        session.save(user);
        tr.commit();
        session.close();
     }

     @Test
     public void getTest(){
        Session session=HibernateSession.createSession();
        UserEntity user=session.get(UserEntity.class,1);
         System.out.println("user = " + user.getName());
         session.close();

     }
     @Test
     public void updateTest(){
        Session session=HibernateSession.createSession();
         Transaction tr=session.getTransaction();
        tr.begin();
        UserEntity user= session.get(UserEntity.class,1);
        user.setPwd("666002");
        session.update(user);
        tr.commit();
        session.close();
     }
     @Test
     public void delTest(){
        Session session=HibernateSession.createSession();
        Transaction tr=session.getTransaction();
        tr.begin();
        UserEntity user=new UserEntity();
        user.setId(1);
        session.delete(user);
        tr.commit();
        session.close();
     }
}
