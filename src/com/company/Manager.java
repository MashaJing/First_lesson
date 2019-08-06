package com.company;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Manager extends Users implements CSV {
    ArrayList<Sale> sales;

    public void Manager (String name, int number, short id) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.sales = new ArrayList<>();
    }

    public void SetSale (ArrayList sales) {
    this.sales = sales;
    }

    public ArrayList<String> GetSale () {
        ArrayList<String> temp = new ArrayList<>();
        for (Sale i : sales) {
            temp.add(i.SalesName + " Price: " + i.SalesPrice);
        }
        return temp;
    }
    public Manager(@JsonProperty(value = "name")String name, @JsonProperty(value = "number") int number,
                     @JsonProperty(value = "id") short id, @JsonProperty(value = "sales") ArrayList sales) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.sales = sales;
    }

    public void AddSale(Sale sale) {
        sales.add(sale);
    }
    public void RemoveSale (Sale sale)
    {
        sales.remove(sale);
    }

}
