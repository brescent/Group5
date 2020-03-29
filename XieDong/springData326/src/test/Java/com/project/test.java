package com.project;

import com.project.entity.*;
import com.project.service.IUservice;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class test {


    private static ApplicationContext ctx ;

    static {

        // 通过静态代码块的方式,让程序加载spring的配置文件

        ctx = new ClassPathXmlApplicationContext("classpath:applicationSpringData.xml");

    }






        /** 测试spring容器是否实例化了数据源 。如果实例化了，说明Spring容器整合没问题 */

    @Test
    public void testDataSouce() throws SQLException {

        DataSource dataSouce = (DataSource) ctx.getBean("dataSource");

        System.out.println("数据源："+ dataSouce);

        System.out.println("连接："+ dataSouce.getConnection());

    }


    private IUservice userService;

    @Before
    public  void test(){
        ClassPathXmlApplicationContext app=
                new ClassPathXmlApplicationContext("applicationSpringData.xml");
        userService= (IUservice) app.getBean("userService");


    }
    @Test
    public void test1(){

  UserEntity  user= userService.login("tom","111");

        System.out.println(user.getRealName());
    }

 @Test
    public void test2(){



     RoleEntity role= userService.addRole(new RoleEntity("超级管理员",null));
     PowerEntity powerEntity= userService.addPower(new PowerEntity("用户管理","userMannege","管理所有用户",null));
     userService.addUserRole(new UserRoleEntity(userService.getUserById("40288187712051d701712051ddd90000"),role));
     userService.addRolePower(new RolePowerEntity(role,powerEntity));


    }
    @Test
    public void test3(){
    List<String> list= userService.getUserPower("40288187712051d701712051ddd90000");


    for(String str:list){

        System.out.println(str);
    }
    }
}
