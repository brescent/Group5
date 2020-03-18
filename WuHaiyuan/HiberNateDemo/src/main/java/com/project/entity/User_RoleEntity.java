package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.Set;

@Entity
@Table(name = "t_user_role")
public class User_RoleEntity {
    @Id
    @Column(name = "pk_id",length = 32)
    @GenericGenerator(name = "uruuid",strategy = "uuid")
    @GeneratedValue(generator = "uruuid")
    private String id;
    @ManyToOne
    @JoinColumn(name = "fk_userId")
    private UserEntity user;
    @ManyToOne
    @JoinColumn(name = "fk_roleId")
    private RoleEntity role;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }






}
