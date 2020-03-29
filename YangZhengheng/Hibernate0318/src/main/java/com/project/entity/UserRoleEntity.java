package com.project.entity;

import sun.nio.cs.US_ASCII;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity

@Table(name="t_userRole")
public class UserRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="pk_roleId")
    private RoleEntity roleEntity;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "pk_userId")
    private UserEntity userEntity;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
