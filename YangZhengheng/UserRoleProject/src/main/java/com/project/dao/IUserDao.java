package com.project.dao;

import com.project.entity.PowerEntity;
import com.project.entity.RoleEntity;
import com.project.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public  interface IUserDao extends CrudRepository<UserEntity,String> {

    @Query("from UserEntity  where  userName=:userName and pwd =:pwd")
    public UserEntity login(@Param("userName") String userName, @Param("pwd") String pwd);

    @Query(value = "SELECT DISTINCT  p.id,p.f_powerName,p.f_powerUrl FROM t_user u, t_userrole ur, t_role r, t_power p,t_rolepower rp \n" +
            "WHERE u.id=ur.fk_UserId AND r.id=ur.fk_roleId AND r.id=rp.fk_roleId AND p.id=rp.fk_powerId\n" +
            "AND u.id=:userId",nativeQuery = true)
    public List<Object[]> getRoleByUserId(@Param("userId") int userId);




}
