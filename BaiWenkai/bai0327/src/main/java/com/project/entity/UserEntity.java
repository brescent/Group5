package com.project.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * 用户实体类
 */
@Entity
@Table(name = "sys_user")
public class UserEntity {
    @Id
    @Column(name = "u_id",length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "u_name",length = 80)
    private String userName;
    @Column(name = "u_password",length = 80)
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<UserRoleEntity> userRoleSet;

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

    public Set<UserRoleEntity> getUserRoleSet() {
        return userRoleSet;
    }

    public void setUserRoleSet(Set<UserRoleEntity> userRoleSet) {
        this.userRoleSet = userRoleSet;
    }
}
