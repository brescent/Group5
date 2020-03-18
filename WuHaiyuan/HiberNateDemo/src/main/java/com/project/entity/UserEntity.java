package com.project.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_user")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userName;

    private String password;

    private int age;
    @OneToMany(mappedBy = "user")
    private Set<User_RoleEntity> urSet;

    public Set<User_RoleEntity> getUrSet() {
        return urSet;
    }

    public void setUrSet(Set<User_RoleEntity> urSet) {
        this.urSet = urSet;
    }

    public UserEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
