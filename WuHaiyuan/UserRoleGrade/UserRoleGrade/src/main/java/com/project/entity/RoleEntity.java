package com.project.entity;

import javax.persistence.*;
import java.util.List;

/**
 * 角色实体
 */
@Entity
@Table(name = "t_role")
public class RoleEntity {

    /**
     * 角色ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_id")
    private int id;

    /**
     * 角色名
     */
    @Column(name = "f_name", length = 16)
    private String roleName;

    /**
     * 角色所对应的用户集合
     */
    @OneToMany(mappedBy = "role",fetch = FetchType.EAGER)
    private List<RoleGradeEntity> userRoleList;

    /**
     * 角色对应权限集合
     */
    @OneToMany(mappedBy = "role",fetch = FetchType.EAGER)
    private List<RoleGradeEntity> roleGradeList;

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

    public List<RoleGradeEntity> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<RoleGradeEntity> userRoleList) {
        this.userRoleList = userRoleList;
    }

    public List<RoleGradeEntity> getRoleGradeList() {
        return roleGradeList;
    }

    public void setRoleGradeList(List<RoleGradeEntity> roleGradeList) {
        this.roleGradeList = roleGradeList;
    }
}
