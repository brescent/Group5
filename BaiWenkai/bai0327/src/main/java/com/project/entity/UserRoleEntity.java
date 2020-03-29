package com.project.entity;

import javax.persistence.*;

/**
 * 用户角色中间实体类
 */
@Entity
@Table(name = "m_user_role")
public class UserRoleEntity {
    @Id
    @Column(name = "ur_id",length = 32)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "fk_uid")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "fk_rid")
    private RoleEntity role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
