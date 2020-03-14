package test;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.project.service.impl.UserServiceImpl;
import com.project.util.NateSession;
import org.junit.Test;

public class UserTest {
    private IUserService service = new UserServiceImpl();

@Test
    public  void testSession(){
        System.out.println(NateSession.getSession());
    }
    @Test
    public void TsetUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setUserName("小七");
        userEntity.setPassword("123456");
        userEntity.setAge(16);
        //service.add(userEntity);
       // System.out.println(service.find(1));
        //service.update(1,"小乔");
       // service.delete(1);
    }
}
