package com.nj.tech;

/*
 * Created by Ninad Jingare on  Date: 20-12-2024
 */
public class Electronics extends Item {

    private int warranty;

    public Electronics() {
    }

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public Electronics(Electronics otherElectronics) {
        super(otherElectronics);
        this.warranty = otherElectronics.warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "warranty=" + warranty +
                '}';
    }
}
