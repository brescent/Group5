package com.project.entity;

import java.sql.Date;

public class UserInfoEntity {


    private int id;
    private String job;
    private int salary;
    private Date changeTime=new Date(System.currentTimeMillis());



    public UserInfoEntity() {
    }

    public UserInfoEntity(String job, int salary) {
        this.job = job;
        this.salary = salary;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }
}
