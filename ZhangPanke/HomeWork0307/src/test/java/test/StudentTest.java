package test;

import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentTest {
    @Autowired
    private IStudentService service;

    @Test
    public void testStu(){
//        System.out.println(service.findAll());
        service.addStudent(new StudentEntity("bibio","2345555"));
    }
}
