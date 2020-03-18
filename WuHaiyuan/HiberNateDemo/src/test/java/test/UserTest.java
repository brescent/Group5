package test;

import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.project.service.impl.UserServiceImpl;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserTest {
    private IUserService service = new UserServiceImpl();

@Test
    public  void testSession(){
        System.out.println(NateSession.getSession());
    }
    @Test
    public void TsetUser(){
//        UserEntity userEntity = new UserEntity();
//        userEntity.setId(1);
//        userEntity.setUserName("小七");
//        userEntity.setPassword("123456");
//        userEntity.setAge(16);
        //service.add(userEntity);
       // System.out.println(service.find(1));
        //service.update(1,"小乔");
       // service.delete(1);

        Session session = NateSession.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setName("小白");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
        String date = dateFormat.format(new Date());
        roleEntity.setAddDate(date);

        session.save(roleEntity);
        transaction.commit();
        session.close();
    }
}
