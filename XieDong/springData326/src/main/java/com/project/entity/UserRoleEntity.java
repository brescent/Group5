package com.project.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="user_role")
public class UserRoleEntity {

    @Id
    @GenericGenerator(name="uuuid",strategy = "uuid")
    @GeneratedValue(generator = "uuuid")
    @Column(length = 32)
    private String urid;


    @ManyToOne
    @JoinColumn(name = "fk_uid")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name="fk_rid")
    private RoleEntity role;

    public UserRoleEntity() {
    }

    public UserRoleEntity(UserEntity user, RoleEntity role) {
        this.user = user;
        this.role = role;
    }

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
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
