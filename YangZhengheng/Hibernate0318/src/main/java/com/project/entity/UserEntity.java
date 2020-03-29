package com.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name = "t_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_userName")
    private String userName;

    @OneToMany(mappedBy = "userEntity")
    private List<UserRoleEntity> roleUserList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public List<UserRoleEntity> getRoleUserList() {
        return roleUserList;
    }

    public void setRoleUserList(List<UserRoleEntity> roleUserList) {
        this.roleUserList = roleUserList;
    }
}
