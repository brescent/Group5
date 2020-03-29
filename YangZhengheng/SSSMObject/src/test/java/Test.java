import com.project.entity.PowerEntity;
import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.service.IUserService;
import com.project.util.BasicDao;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {

    IUserService service=null;

    @Before
    public  void test(){
        ClassPathXmlApplicationContext app=
                new ClassPathXmlApplicationContext("application.xml");
        service= (IUserService) app.getBean("IUserService");

    }
    @org.junit.Test
    public void login(){
        UserEntity user=service.login("will","123");
        System.out.println(user.getUserName());
    }
    @org.junit.Test
    public void list() {
        List<PowerEntity> powerList=new ArrayList<>();
        PowerEntity powerEntity=null;
        List<Object[]> powerEntityList = service.getRoleByUserId(1);
        for (Object[] obj:powerEntityList){
            int id= (int) obj[0];
            String powerName= (String) obj[1];
            String url= (String) obj[2];
             powerEntity=new PowerEntity();
            powerEntity.setId(id);
            powerEntity.setPowerName(powerName);
            powerEntity.setPowerUrl(url);
            powerList.add(powerEntity);
            System.out.println(powerEntity.getPowerUrl()+powerEntity.getPowerName());
        }
    }

}
