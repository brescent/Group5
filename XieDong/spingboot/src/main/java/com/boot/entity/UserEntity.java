package com.boot.entity;


import javax.persistence.*;

@Entity
@Table(name="test_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 48)
    private String name;

    @Column(length = 48)
    private String pwd;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
