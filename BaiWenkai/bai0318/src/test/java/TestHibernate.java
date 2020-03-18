import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.entity.UserRoleEntity;
import com.project.util.DBUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.management.relation.Role;

public class TestHibernate {
    Session session = null;
    Transaction tr = null;

    @Before
    public void before(){
        session = DBUtil.getSession();
        tr = session.getTransaction();
        tr.begin();
    }

    @After
    public void after(){
        tr.commit();
        session.close();
    }

    @Test
    public void saveU(){
        UserEntity user = new UserEntity();
        user.setName("李四");
        session.save(user);
    }

    @Test
    public void saveR(){
        RoleEntity role1 = new RoleEntity();
        role1.setName("战士");
        session.save(role1);
        RoleEntity role2 = new RoleEntity();
        role2.setName("法师");
        session.save(role2);
        RoleEntity role3 = new RoleEntity();
        role3.setName("牧师");
        session.save(role3);
        RoleEntity role4 = new RoleEntity();
        role4.setName("德鲁伊");
        session.save(role4);
    }

    @Test
    public void saveUR(){
        UserRoleEntity ur1 = new UserRoleEntity();
        UserEntity user = session.get(UserEntity.class,"4028e58470ecd9e60170ecd9edd10000");
        RoleEntity role1 = session.get(RoleEntity.class,"4028e58470ece25d0170ece2601b0000");
        ur1.setUser(user);
        ur1.setRole(role1);

        UserRoleEntity ur2 = new UserRoleEntity();
        RoleEntity role2 = session.get(RoleEntity.class,"4028e58470ece25d0170ece2602a0001");
        ur2.setUser(user);
        ur2.setRole(role2);

        session.save(ur1);
        session.save(ur2);

    }

    @Test
    public void findRoleByUser(){
        UserEntity user = session.get(UserEntity.class,"4028e58470ecdf240170ecdf28160000");
        System.out.println(user.getName());
        for (UserRoleEntity ur:user.getCastSet()) {
            System.out.println(ur.getRole().getName());
        }
    }
}
