package com.project.service;

import com.project.entity.*;

import java.util.List;

public interface IUservice  {


    public UserEntity login(String userName,String password);

    public UserEntity addUser(UserEntity user);
    public PowerEntity addPower(PowerEntity power);

    public RoleEntity addRole(RoleEntity role);
    public UserRoleEntity addUserRole(UserRoleEntity userRole);
    public RolePowerEntity addRolePower(RolePowerEntity rolePower);



    public List<PowerEntity> getAllPower();
    public UserEntity getUserById(String id);

    public Object[] getUserPower(String uid);
}
