package test;

import com.project.dto.TeacherDto;
import com.project.entity.many.TeacherEntity;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;


public class HQLtest {
    Session s = null;
    Transaction tr = null;

    @Before
    public void open() {
        s = NateSession.getSession();
        tr = s.getTransaction();
        tr.begin();
    }

    /**
     * hql基本查询
     */
    @Test
    public void hql1() {
        String hql = "select u from TeacherEntity u";
        Query query = s.createQuery(hql);
        List<Object> list = query.list();
        System.out.println();
    }

    /**
     * hql条件查询
     */
    @Test
    public void hql2(){
        String hql = "from TeacherEntity where name = ?";
        List<TeacherEntity> list = s.createQuery(hql).setParameter(0,"小白").list();
        for (TeacherEntity t: list) {
            System.out.println(t.getClassName());
        }
    }

    /**
     * hql 部分属性查询第一种
     */
    @Test
    public void  hql3(){
        String hql ="select name,className from TeacherEntity";
        List<Object[]> list = s.createQuery(hql).list();
        System.out.println();
    }

    /**
     * hql 部分属性查询第二种
     */
    @Test
    public void  hql4(){
        String hql ="select new com.project.dto.TeacherDto(name,className) from TeacherEntity";
        List<TeacherDto> list = s.createQuery(hql).list();
        System.out.println();
    }

    /**
     * hql 部分属性查询第3种
     */
    @Test
    public void  hql5(){
        String hql ="select new Map(name,className) from TeacherEntity";
        List<Map> list = s.createQuery(hql).list();
        System.out.println();
    }


    /**
     * hql 模糊查询
     */
    @Test
    public void hql6(){
        String hql =" from TeacherEntity where name like ?";
        List<Object> list = s.createQuery(hql).setParameter(0,"%白%").list();
        System.out.println();
    }
    @After
    public void end() {
        tr.commit();
        s.close();
    }
}
