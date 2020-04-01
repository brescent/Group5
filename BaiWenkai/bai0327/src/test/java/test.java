import com.alibaba.fastjson.JSON;
import com.project.controller.UserController;
import com.project.entity.LimitEntity;
import com.project.entity.UserEntity;
import com.project.service.impl.UserServiceImpl;
import org.apache.http.HttpRequest;
import org.hibernate.Session;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.util.JsonExpectationsHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

    @Autowired
    UserController c;

    @Test
    public void testJ(){
        List<UserEntity> list = new ArrayList<UserEntity>();
        UserEntity user1 = new UserEntity();
        user1.setId(1);
        user1.setUserName("11");
        user1.setPassword("111");
        UserEntity user2 = new UserEntity();
        user1.setId(2);
        user1.setUserName("22");
        user1.setPassword("222");
        list.add(user1);
        list.add(user2);
        List<UserEntity> list2 = Arrays.asList(user1,user2);
        System.out.println(JSON.parseArray(String.valueOf(list)));
    }

    @Test
    public void testAdd(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServiceImpl ser = (UserServiceImpl) context.getBean("userService");
        List<LimitEntity>list = ser.getLimitByUserId(1);
        System.out.println(list.size());
        for (LimitEntity l:list) {
            System.out.println(l.getLimitName());
        }
    }
}
