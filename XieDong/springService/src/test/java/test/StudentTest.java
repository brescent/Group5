package test;

import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class StudentTest {

    @Resource
    private IStudentService service;


    @Test
    public void test() {

        List<StudentEntity> list=service.findAll();
        System.out.println(list);
        for (StudentEntity s:list) {
            System.out.println(s.getName()+"  "+s.getTel());
        }


    }


//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context=
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        IStudentService studentService= (IStudentService) context.getBean("studentService");
//        List<StudentEntity> list= studentService.findAll();
//        for (StudentEntity u:list
//        ) {
//            System.out.println(u.getName());
//        }
//    }
}
