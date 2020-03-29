package com.project.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @GenericGenerator(name="uuuid",strategy = "uuid")
    @GeneratedValue(generator = "uuuid")
    @Column(length = 32)
    private String uid;

    @Column(length = 48)
    private String realName;
    @Column(length = 48)
    private String userName;
    @Column(length = 48)
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<UserRoleEntity> userRoleSet;

    public UserEntity() {
    }

    public UserEntity(String realName, String userName, String password, Set<UserRoleEntity> userRoleSet) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
        this.userRoleSet = userRoleSet;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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
