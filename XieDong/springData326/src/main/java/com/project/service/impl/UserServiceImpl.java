package com.project.service.impl;


import com.project.dao.*;
import com.project.entity.*;
import com.project.service.IUservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "userService")
public class UserServiceImpl implements IUservice {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRoleDao userRoleDao;
    @Autowired
    private RoleDao roleDao;
    @Autowired
    private PowerDao powerDao;
    @Autowired
    private RolePowerDao rolePowerDao;


    public UserEntity login(String userName,String password){

      return   userDao.login(userName,password);
    }

    @Override
    public UserEntity addUser(UserEntity  user) {
        return  userDao.save(user);
    }

    @Override
    public PowerEntity addPower(PowerEntity power) {

      return    powerDao.save(power);
    }

    @Override
    public RoleEntity addRole(RoleEntity role) {

      return   roleDao.save(role);
    }

    @Override
    public UserRoleEntity addUserRole(UserRoleEntity userRole) {

     return    userRoleDao.save(userRole);
    }

    @Override
    public RolePowerEntity addRolePower(RolePowerEntity rolePower) {
   return    rolePowerDao.save(rolePower);
    }

    @Override
    public List<PowerEntity> getAllPower() {

        return powerDao.getAllPower();
    }

    @Override
    public UserEntity getUserById(String id) {


        Optional<UserEntity> optional= userDao.findById(id);

        return optional.get();
    }

    @Override
    public Object[] getUserPower(String uid) {

        return userDao.getUserPower(uid).getUserRoleSet().toArray();

    }


}
