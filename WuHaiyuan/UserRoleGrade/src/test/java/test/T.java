package test;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class T {

    private IUserService service;
    @Before
    public void  load(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        service = (IUserService) context.getBean("userService");
    }
    @Test
    public void t1(){
        UserEntity userEntity = service.login("小白","123");
        System.out.println();
    }
}
