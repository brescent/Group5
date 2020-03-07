import com.project.bean.UserBean;
import com.project.dao.UserDao;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class T {

    @Resource
    private UserDao userDao;
    @Test
    public  void  testadd(){
         userDao.add(new UserBean("cc","456",25));
    }
    @Test
    public  void testdel(){
        userDao.del(1);
    }
    @Test
    public  void testfinAll(){
        System.out.println( userDao.finAll());
    }
    @Test
    public  void testupdata(){
        userDao.updata(new UserBean("kk","789",30));
    }
}
