package com.project.entity;

public class UserEntity {
    private int id;
    private String name;
    private String pwd;
    private String phone;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd, String phone) {
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
