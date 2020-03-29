package com.project.test;



import com.project.entity.UserEntity;
import com.project.util.HibernateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.junit.After;
import org.junit.Before;

import java.util.List;
import java.util.Map;

public class Test {

    Session session=null;
    Transaction transaction=null;

    @Before
    public void open(){
        session= HibernateSession.createSession();
        transaction=session.getTransaction();
        transaction.begin();
    }


    @After
    public void close(){

        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void login(){
        String hql="FROM UserEntity  WHERE loginName=? AND pwd=?";
       UserEntity user= (UserEntity) session.createQuery(hql).setParameter(0,"001").setParameter(1,"123").uniqueResult();
        System.out.println(user.getId());
    }

    @org.junit.Test
    public void updateRole(){

        String hql="UPDATE  RoleEntity SET user=null WHERE user.userName=?";
        session.createQuery(hql).setParameter(0,"will").executeUpdate();

    }

    @org.junit.Test
    public void updatePower(){

        String hql="UPDATE PowerEntity set role=NULL WHERE role.id=" +
                "(SELECT id from RoleEntity WHERE user.userName=?)";
        session.createQuery(hql).setParameter(0,"will").executeUpdate();
    }

    @org.junit.Test
    public void view(){
        String sql="SELECT u.f_userName as userName ,p.f_powerName as powerName ,p.f_powerUrl as powerUrl from t_user u,t_power p,t_role r WHERE\n" +
                "u.id=r.fk_userId AND r.id= p.fk_roleId AND u.f_userName=?";
        List<Map> list=
        session.createNativeQuery(sql).setParameter(1,"will")
        .unwrap(NativeQueryImpl.class)
                .setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP)
                .list();
        for (Map map:list){
            System.out.println(map.get("userName")+"/"+map.get("powerName")+"/"+map.get("powerUrl"));
        }
    }
}
