package com.project.entity;

import javax.persistence.*;

/**
 * 用户-角色 实体
 */
@Entity
@Table(name = "t_user_role")
public class UserRoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pk_id")
    private int id;

    /**
     * 用户实体
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_userId")
    private UserEntity user;

    /**
     * 角色实体
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_roleId")
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
