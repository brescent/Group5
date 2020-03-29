package com.project.dao;

import com.project.entity.LimitEntity;
import com.project.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao extends CrudRepository<UserEntity,String> {
    @Query("from UserEntity where userName = :userName and password = :password")
    UserEntity login(@Param("userName") String userName, @Param("password") String password);

    @Query(value = "select distinct l.l_id,l.l_name,l.l_url,l.l_info from sys_user u,sys_role r,sys_limit l,m_user_role ur,m_role_limit rl where u.u_id=ur.fk_uid AND r.r_id=ur.fk_rid AND r.r_id=rl.fk_rid AND l.l_id=rl.fk_lid and u.u_id=:uid",nativeQuery = true)
    public List<Object[]> getLimitByUserId(@Param("uid") int id);
}
