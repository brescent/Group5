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

    @Column(name = "f_pwd")
    private String pwd;

    @OneToMany(mappedBy = "user")
    private List<UserRoleEntity> userRoleList;



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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public List<UserRoleEntity> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRoleEntity> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
