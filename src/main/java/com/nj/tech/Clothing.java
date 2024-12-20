package com.nj.tech;

/*
 * Created by Ninad Jingare on  Date: 20-12-2024
 */
public class Clothing extends Item {

    private String size;

    public Clothing() {
    }

    public Clothing(String id, String name, double price, int quantity, String size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public Clothing(Clothing otherClothing) {
        super(otherClothing);
        this.size = otherClothing.size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                '}';
    }
}
