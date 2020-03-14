import com.project.hibernate.entity.UserEntity;
import com.project.hibernate.util.HiberSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class TestHibernate {

    public static void main(String[] args){
        System.out.println(HiberSession.getSession());
    }

    @Test
    public void addUser(){
        UserEntity user = new UserEntity();
        user.setUserId(1);
        user.setUserName("张三");
        user.setPassword("zxc");
        user.setAge(18);
        //获取session
        Session session = HiberSession.getSession();
        //获取事务
        Transaction trans = session.getTransaction();
        //
        trans.begin();
        //调用方法
        session.save(user);
        //提交事务
        trans.commit();
        //关闭连接
        session.close();
    }

    @Test
    public void getUser(){
        Session session = HiberSession.getSession();
        UserEntity user = session.get(UserEntity.class,1);
        System.out.println(user.getUserName()+","+user.getPassword());
        session.close();
    }

    @Test
    public void updateUser(){
        Session session = HiberSession.getSession();
        Transaction trans = session.getTransaction();
        trans.begin();
        UserEntity user = session.get(UserEntity.class,1);
        user.setAge(40);
        session.update(user);
        trans.commit();
        session.close();
    }

    @Test
    public void deleteUser(){
        Session session = HiberSession.getSession();
        Transaction trans = session.getTransaction();
        trans.begin();
        UserEntity user = new UserEntity();
        user.setUserId(1);
        session.delete(user);
        trans.commit();
        session.close();
    }
}
