package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

@Entity
@Table(name="user_role")
public class UserRoleEntity {

    @Id
//设置列属性
    @Column(length = 32)
//自定义策略  定义uuid
    @GenericGenerator(name="ruuid",strategy = "uuid")
//getid一个自定义的策略
    @GeneratedValue(generator = "ruuid")
    private String id;

@ManyToOne
    @JoinColumn(name="fk_rid")
    private RoleEntity role;
    @ManyToOne
    @JoinColumn(name="fk_uid")
    private UserEntity user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
