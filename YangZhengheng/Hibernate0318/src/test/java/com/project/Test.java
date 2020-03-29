package com.project;


import com.project.entity.UserEntity;
import com.project.entity.UserRoleEntity;
import com.project.util.HibernateSession;
import com.project.uto.UserUto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;

import java.util.List;
import java.util.Map;

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
    @org.junit.Test
    public void hql(){
        String hql="from UserEntity";
        List<UserEntity> list=session.createQuery(hql).list();
        for (UserEntity t:list){
            System.out.println(t.getUserName());
        }
    }

    @org.junit.Test
    public void hql2(){
        String hql="from UserEntity where userName like ?";
        List<UserEntity> list =session.createQuery(hql).setParameter(0,"%小%").list();
        for (UserEntity t:list){
            System.out.println(t.getUserName());
        }
    }

    @org.junit.Test
    public void hql4(){
        String hql="select id ,userName from  UserEntity where userName=? ";
        List<Object[]> list=
                session.createQuery(hql)
                        .setParameter(0,"小明")
                        .list();
        for(Object[] objs:list){
            System.out.println(objs[0].toString()+"/"+objs[1].toString());
        }
    }
    @org.junit.Test
    public void hql5(){
        String hql="select new com.project.uto.UserUto(id,userName) " +
                "from UserEntity where  userName=? ";
        List<UserUto> list=
                session.createQuery(hql)
                        .setParameter(0,"小明")
                        .list();
        for (UserUto dto:list){
            System.out.println("ID:"+dto.getId()+"姓名:"+dto.getUserName());
        }
    }

    @org.junit.Test
    public void hql6(){
        String hql="select new map(id,userName) " +
                "from UserEntity where userName=?";
        List<Map> list=
                session.createQuery(hql)
                        .setParameter(0,"小明")
                        .list();
        for(Map map:list){
            System.out.println(map.get("0")+"/"+map.get("1"));
        }
    }
    @After
    public  void close(){
        tr.commit();
        session.close();
    }


}
