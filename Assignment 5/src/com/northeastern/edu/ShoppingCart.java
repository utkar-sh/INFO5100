package com.northeastern.edu;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int total = 0;
        for(Item item: items){
            total += item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int payment = calculateTotal();
        paymentStrategy.pay(payment);
    }
}
