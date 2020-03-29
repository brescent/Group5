package com.project.dao;

import com.project.entity.PowerEntity;
import com.project.entity.RoleEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PowerDao extends CrudRepository<PowerEntity,String> {


    @Query("from PowerEntity ")
public List<PowerEntity> getAllPower();




}
