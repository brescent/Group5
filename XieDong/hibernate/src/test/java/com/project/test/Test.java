package com.project.test;

        import com.project.entity.UserEntity;
        import com.project.util.HibernateSession;
        import org.hibernate.Session;
        import org.hibernate.Transaction;
        import org.junit.runner.RunWith;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



public class Test {
    @org.junit.Test
    public void test(){
        UserEntity user =new UserEntity("战是干","678",23);
        user.setId(1);
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();
        //执行添加
        s.save(user);
        ts.commit();
        s.close();

    }
    @org.junit.Test
    public void update(){
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();

        //先得到要修改的对象
        UserEntity user= s.get(UserEntity.class,1);
        user.setAge(20);
        s.update(user);
ts.commit();
s.close();


    }
    @org.junit.Test
    public void getUser(){
        Session s=HibernateSession.createSession();
       UserEntity user= s.get(UserEntity.class,1);
        System.out.println(user.getName());

        s.close();
    }
    @org.junit.Test
    public void delete(){
        Session s=HibernateSession.createSession();
        //获取事务控制
        Transaction ts=s.getTransaction();
        //开启事务控制
        ts.begin();
        UserEntity user=new UserEntity();
        user.setId(1);
        s.delete(user);

        ts.commit();
        s.close();
    }
}
