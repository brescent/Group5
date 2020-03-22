package test;

import com.project.entity.GradeEntity;
import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import com.project.util.NateSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class User_Role_Grade_Test {

    Session s = null;
    Transaction tr = null;

    @Before
    public void open() {
        s = NateSession.getSession();
        tr = s.getTransaction();
        tr.begin();
    }

    @Test
    public void Find() {

        String sql = "select u.userName, g.gradeName ,g.gradeResouce  from t_user u,t_role r,t_grade g where " +
                " u.id = r.fk_userId and r.roleId = g.fk_roleId " +
                " and u.userName = ? and r.roleType = '1' and g.gradeType = '1'";

//       List<Object> list = s.createNativeQuery(sql)
//                .setParameter(1,"小白").list();

        List<Map> list=
                s.createNativeQuery(sql)
                        .setParameter(1,"小白")
                        .unwrap(NativeQueryImpl.class)  //拆包
                        .setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP)
                        .list();

        System.out.println();
    }

    @Test
    public void updRole(){
        String hql = "update RoleEntity set roleType='0' where roleId=? and user.id=?";
        int i= s.createQuery(hql)
                .setParameter(0,2)
                .setParameter(1,1)
                .executeUpdate();
        System.out.println(i);
    }

    @Test
    public void updGrade(){
        String hql = "update GradeEntity set gradeType='0' where gradeId = ? and role.id = ? ";
        int i= s.createQuery(hql)
                .setParameter(0,1)
                .setParameter(1,1)
                .executeUpdate();
        System.out.println(i);
    }
    @After
    public void end() {
        tr.commit();
        s.close();
    }
}
