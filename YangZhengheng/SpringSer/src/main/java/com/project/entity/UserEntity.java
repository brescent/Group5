package com.project.entity;

public class UserEntity {
    private int id;
    private String name;
    private String pwd;
    private String phone;
    private int age;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd, String phone, int age) {
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
