package com.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity

@Table(name="t_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "f_roleName")
    private String roleName;

    @OneToMany(mappedBy = "roleEntity")
    private List<UserRoleEntity> userRoleList;

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

    public List<UserRoleEntity> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRoleEntity> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
