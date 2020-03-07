package test;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private IUserService service;
    @Test
    public void testUser(){
//        service.findAll();
        service.addUser(new UserEntity("小黑","4", Date.valueOf("2022-01-01")));
    }
}
