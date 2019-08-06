package com.company;

public class Sale {

    String name;
    float price;

    public Sale(String name, float price) {
    this.name = name;
    this.price = price;
    }

    public String SalesName() {
        return name;
    }

    public float SalesPrice() {
        return price;
    }

    public void SetSalesName(String name) {
        this.name = name;
    }

    public void SetSalesPrice(float price) {
        this.price = price;
    }

}
