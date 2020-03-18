package com.project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="t_user")
public class UserEntity {

    @Id
//设置列属性
    @Column(length = 32)
//自定义策略  定义uuid
    @GenericGenerator(name="roleuuid",strategy = "uuid")
//getid一个自定义的策略
    @GeneratedValue(generator = "roleuuid")
    private String id;
    @Column(length = 48)
    private String name;
    @Column(length = 48)
    private String pwd;

    private int age;


    @OneToMany(mappedBy = "role")
    private Set<UserRoleEntity> set;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd, int age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public Set<UserRoleEntity> getSet() {
        return set;
    }

    public void setSet(Set<UserRoleEntity> set) {
        this.set = set;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
