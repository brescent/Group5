package com.project.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private String loginName;

    private String password;

    private String userType;

    @OneToMany(mappedBy = "user")
    private Set<RoleEntity> roleSet;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    public Set<RoleEntity> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<RoleEntity> roleSet) {
        this.roleSet = roleSet;
    }

    public UserEntity() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
