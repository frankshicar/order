package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;
    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;

        if(delivery.name.equals("Shopee") && amount > 199){
            shipFeed = 0;
        }else{
            shipFeed = delivery.price;
        }
    }
    public int total(){
        return (amount+shipFeed);
    }

}
