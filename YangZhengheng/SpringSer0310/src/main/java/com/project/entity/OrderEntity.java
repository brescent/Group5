package com.project.entity;

public class OrderEntity {
    private int id;
    private int shopId;
    private int soldNum;

    public OrderEntity() {
    }

    public OrderEntity(int shopId, int soldNum) {
        this.shopId = shopId;
        this.soldNum = soldNum;
    }

    public int getShopid() {
        return shopId;
    }

    public void setShopid(int shopid) {
        this.shopId = shopid;
    }

    public int getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(int soldNum) {
        this.soldNum = soldNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
