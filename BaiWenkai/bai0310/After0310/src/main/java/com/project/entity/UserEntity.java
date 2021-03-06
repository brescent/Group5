package com.project.entity;

import java.util.List;

public class UserEntity {
    private int id;
    private String name;
    private String pwd;
    private String age;
    List<InfoEntity> infoList;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd, String age) {
        this.name = name;
        this.pwd = pwd;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<InfoEntity> getInfoList() {
        return infoList;
    }

    public void setInfoList(List<InfoEntity> infoList) {
        this.infoList = infoList;
    }
}
