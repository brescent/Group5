package test;

import com.project.entity.many.StudentEntity;
import com.project.entity.many.TeacherEntity;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ORMTest {
    Session s = null;
    Transaction tr = null;

    @Before
    public void open() {
        s = NateSession.getSession();
        tr = s.getTransaction();
        tr.begin();
    }

    @Test
    public void testStu() {
        TeacherEntity teacherEntity = new TeacherEntity();
       teacherEntity.setId("4028888770ebb4940170ebb496580000");
        StudentEntity s1 = new StudentEntity();
        s1.setName("小萌");
        s1.setTeacher(teacherEntity);
        StudentEntity s2 = new StudentEntity();
        s2.setName("小七");
        s2.setTeacher(teacherEntity);
        StudentEntity s3 = new StudentEntity();
        s3.setName("小倩");
        s3.setTeacher(teacherEntity);
        s.save(s1);
        s.save(s2);
        s.save(s3);

    }
    @Test
    public void cascAddTest(){
        TeacherEntity teacherEntity = new TeacherEntity();
        teacherEntity.setClassName("k5754");
        teacherEntity.setName("小黑");
        StudentEntity s1 = new StudentEntity();
        s1.setName("小青");
        s1.setTeacher(teacherEntity);
        StudentEntity s2 = new StudentEntity();
        s2.setName("小倩");
        s2.setTeacher(teacherEntity);
        StudentEntity s3 = new StudentEntity();
        s3.setName("小龙");
        s3.setTeacher(teacherEntity);
        s.save(s1);
        s.save(s2);
        s.save(s3);
    }


    @After
    public void end() {
        tr.commit();
        s.close();
    }
}
