import com.project.util.HSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class Hibernate {
    private Session session=null;
    private Transaction transaction=null;
    @Before
    public  void  before(){
        session= HSession.createSession();
        transaction=session.getTransaction();
        transaction.begin();
    }

    @Test
    public  void  hqll6(){
        String sql="select  new map(s.stuName,s.classname,t.name) from  StuEntity  s left join " +
                " s.teacher  t where t.name=?";
      List<Map> list= session.createQuery(sql).setParameter(0,"陈老师").list();
        for(Map u:list){
            System.out.println(u.get("0")+" "+u.get("1"));

        }
    }




    @After
    public  void  after(){
        transaction.commit();
  session.close();
    }
}
