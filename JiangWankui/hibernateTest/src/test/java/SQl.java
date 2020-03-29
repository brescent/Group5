import com.project.bean.TeacherEntity;
import com.project.util.HSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SQl {
    private Session session=null;
    private Transaction transaction=null;
    @Before
    public  void  before(){
        session= HSession.createSession();
        transaction=session.getTransaction();
        transaction.begin();
    }

    @Test
    public  void  sql1(){
        String sql="select * from  t_teacher as t";
        NativeQuery query = session.createNativeQuery(sql);
        query.addEntity(TeacherEntity.class);
        List<TeacherEntity> list =query.list();
        for(TeacherEntity u:list){
            System.out.println(u);

        }
    }

    @Test
    public  void  sql2(){
        String sql="select classname ,id,`name`  from  t_teacher as t";
        NativeQuery query = session.createNativeQuery(sql);
        List<Object[]> list =query.list();
        for(Object[] u:list){
            System.out.println(u[0]);

        }
    }


    @After
    public  void  after(){
        transaction.commit();
        session.close();
    }
}
