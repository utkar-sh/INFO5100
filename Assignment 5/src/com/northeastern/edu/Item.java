package com.northeastern.edu;

public class Item extends ShoppingCart{
    String id;
    int price;

    public Item(String id, int price){
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
