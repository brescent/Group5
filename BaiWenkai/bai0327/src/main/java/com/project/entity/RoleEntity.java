package com.project.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * 角色实体类
 */
@Entity
@Table(name = "sys_role")
public class RoleEntity {
    @Id
    @Column(name = "r_id", length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "r_name", length = 80)
    private String roleName;
    @Column(name = "u_password", length = 80)
    @OneToMany(mappedBy = "role")
    private Set<RoleLimitEntity> roleLimitSet;
    @OneToMany(mappedBy = "role")
    private Set<UserRoleEntity> userRoleSet;

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

    public Set<RoleLimitEntity> getRoleLimitSet() {
        return roleLimitSet;
    }

    public void setRoleLimitSet(Set<RoleLimitEntity> roleLimitSet) {
        this.roleLimitSet = roleLimitSet;
    }

    public Set<UserRoleEntity> getUserRoleSet() {
        return userRoleSet;
    }

    public void setUserRoleSet(Set<UserRoleEntity> userRoleSet) {
        this.userRoleSet = userRoleSet;
    }
}
