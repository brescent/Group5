package test;

import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.entity.User_RoleEntity;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ManyToManyTest {

    Session s = null;
    Transaction tr = null;

    @Before
    public void open() {
        s = NateSession.getSession();
        tr = s.getTransaction();
        tr.begin();
    }

    @Test
    public void TsetAdd() {
//        UserEntity u = new UserEntity();
//        u.setId(3);
//        u.setAge(16);
//        u.setPassword("321");
//        u.setUserName("小白");
//        s.save(u);
//        RoleEntity r =new RoleEntity();
//        r.setRoleId("4028ab3770ecf29b0170ecf29dc90000");
//        r.setName("辅助");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
//        String date = dateFormat.format(new Date());
//        r.setAddDate(date);
//        s.save(r);
//        User_RoleEntity ur= new User_RoleEntity();
//        ur.setUser(u);
//        ur.setRole(r);
//        s.save(ur);
        UserEntity u = s.get(UserEntity.class, 3);
        for(User_RoleEntity ur:u.getUrSet()){
            System.out.println(ur.getRole().getName());
        }

//        RoleEntity r = s.get(RoleEntity.class,"4028ab3770ecf20c0170ecf20e760000");
//        for(User_RoleEntity ur:r.getUrSet()){
//            System.out.println(ur.getUser().getUserName());
//        }
    }

    @After
    public void end() {
        tr.commit();
        s.close();
    }
}
