package com.project.entity;

public class UserInfoEntity {
    private int id;
    private int userId;
    private String job;
    private int money;

    public UserInfoEntity() {
    }

    public UserInfoEntity(int userId, String job, int money) {
        this.userId = userId;
        this.job = job;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
