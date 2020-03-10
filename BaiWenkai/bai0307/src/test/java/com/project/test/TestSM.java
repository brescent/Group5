package com.project.test;

import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSM {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        IStudentService service = (IStudentService) context.getBean("ss");

        List<StudentEntity> stuList = service.findAll();

        //        service.delStu(9);

        for (StudentEntity stu:stuList) {
            System.out.println(stu.getName());
        }

    }
}
