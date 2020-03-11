package com.project.entity;

import java.io.Serializable;

public class UserEntity implements Serializable {

    private Integer id;

    private String name;

    private String pwd;

    private int age;

    private  InfoEntity userInfo;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd, int age)  {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public InfoEntity getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(InfoEntity userInfo) {
        this.userInfo = userInfo;
    }

    public void setId(Integer id) {
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
