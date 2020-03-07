package com.project.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 用户实体
 */
public class UserEntity implements Serializable {

    private int id;

    private String name;

    private String pwd;

    private Date birthday;

    public UserEntity() {
    }

    public UserEntity(String name, String pwd, Date birthday) {
        this.name = name;
        this.pwd = pwd;
        this.birthday = birthday;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
