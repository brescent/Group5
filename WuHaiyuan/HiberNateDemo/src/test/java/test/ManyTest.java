package test;

import com.project.entity.many.JobEntity;
import com.project.entity.many.PlayerEneity;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ManyTest {
    Session s = null;
    Transaction tr = null;

    @Before
    public void open() {
        s = NateSession.getSession();
        tr = s.getTransaction();
        tr.begin();
    }

@Test
public void manyTest(){
    JobEntity j1 = new JobEntity();
    j1.setJobName("打野");

    JobEntity j2 = new JobEntity();
    j2.setJobName("上单");
    JobEntity j3 = new JobEntity();
    j3.setJobName("adc");
    s.save(j1);
    s.save(j2);
    s.save(j3);
    List<JobEntity> list = new ArrayList<>();
    list.add(j1);
    list.add(j2);
    list.add(j3);
    PlayerEneity p =new PlayerEneity();
    p.setName("小田");
    p.setJobList(list);

    s.save(p);

}

    @After
    public void end() {
        tr.commit();
        s.close();
    }
}
