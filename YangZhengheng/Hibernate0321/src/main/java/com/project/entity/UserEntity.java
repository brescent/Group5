package com.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="t_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
    @Column(name = "f_loginName")
        private String loginName;
    @Column(name = "f_userName")
        private String userName;
        @OneToMany(mappedBy = "user")
        private List<RoleEntity> roleList;

        @Column(name = "f_pwd")
        private String pwd;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<RoleEntity> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleEntity> roleList) {
        this.roleList = roleList;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
