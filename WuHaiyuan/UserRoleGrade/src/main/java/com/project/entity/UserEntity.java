package com.project.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 用户实体
 */
@Entity
@Table(name = "t_user")
public class UserEntity implements Serializable {

    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_id")
    private int id;

    /**
     * 用户名
     */
    @Column(name = "f_name", length = 16)
    private String userName;

    /**
     * 密码
     */
    @Column(name = "f_pwd", length = 16)
    private String password;

    /**
     * 用户拥有角色
     */
    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<UserRoleEntity> userRoleList;
    /**
     * 用户的权限
     */
    @Transient
    private List<GradeEntity> geades;

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

    public List<UserRoleEntity> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRoleEntity> userRoleList) {
        this.userRoleList = userRoleList;
    }

    public List<GradeEntity> getGeades() {
        return geades;
    }

    public void setGeades(List<GradeEntity> geades) {
        this.geades = geades;
    }
}
