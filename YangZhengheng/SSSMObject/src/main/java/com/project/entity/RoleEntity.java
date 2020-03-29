package com.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "f_roleName")
    private String roleName;

    @Column(name = "f_roleInfo")
    private String roleInfo;

    @OneToMany(mappedBy = "role")
    private List<UserRoleEntity> userRoleList;


    @OneToMany(mappedBy = "role")
    private List<RolePowerEntity> rolePowerList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(String roleInfo) {
        this.roleInfo = roleInfo;
    }

    public List<UserRoleEntity> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRoleEntity> userRoleList) {
        this.userRoleList = userRoleList;
    }

    public List<RolePowerEntity> getRolePowerList() {
        return rolePowerList;
    }

    public void setRolePowerList(List<RolePowerEntity> rolePowerList) {
        this.rolePowerList = rolePowerList;
    }
}
