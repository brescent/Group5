package com.project.dao;

import com.project.entity.RoleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public interface RoleDao  extends CrudRepository<RoleEntity,String> {






}
