package com.project.dao;


import com.project.entity.PowerEntity;
import com.project.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public interface UserDao  extends CrudRepository<UserEntity,String> {


    @Query("from UserEntity  where userName=?1 and password=?2")
    public UserEntity login(String userName,String password);


    @Query("from user where uid=?1")
    public UserEntity getUserPower(String uid);








}
