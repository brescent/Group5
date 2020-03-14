package com.project.entity;

public class OrderEntity {

    private int id;

    private int price;

    private int stockId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public OrderEntity(int price, int stockId) {
        this.price = price;
        this.stockId = stockId;
    }

    public OrderEntity() {
    }
}
