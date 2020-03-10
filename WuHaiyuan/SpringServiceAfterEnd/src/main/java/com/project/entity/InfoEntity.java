package com.project.entity;

import java.sql.Date;

/**
 * 用户信息实体
 */
public class InfoEntity {

    private int id;

    private String job;

    private Integer money;

    private Date changeDate;

    private Integer userId;

    public InfoEntity() {
    }

    public InfoEntity(String job, Integer money, Date changeDate, Integer userId) {
        this.job = job;
        this.money = money;
        this.changeDate = changeDate;
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }
}
