package com.nj.tech;

/*
 * Created by Ninad Jingare on  Date: 20-12-2024
 */
public class Item implements Comparable<Item> {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(){

    }

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item otherItem){
        this.id = otherItem.id;
        this.name = otherItem.name;
        this.price = otherItem.price;
        this.quantity = otherItem.quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Item item) {
        if(this.getPrice()<item.getPrice()){
            return -1;
        }else if(this.getPrice()>item.getPrice()){
            return 1;
        }else{
            return 0;
        }
    }
}
