package com.nj.tech;

import java.util.Collection;
import java.util.HashMap;

/*
 * Created by Ninad Jingare on  Date: 20-12-2024
 */
public class Inventory<T extends Item> {
    private HashMap<String,T> items;

    public Inventory() {
        this.items = new HashMap<>();
    }

    public Inventory(HashMap<String, T> items) {
        this.items = items;
    }

    public HashMap<String, T> getItems() {
        return items;
    }

    public void setItems(HashMap<String, T> items) {
        this.items = items;
    }

    public void addItem(T item){
        this.items.put(item.getId(),item);
    }

    public void removeItem(String id){
        this.items.remove(id);
    }

    public T getItem(String id){
        return this.items.get(id);
    }

    public Collection<T> getAllItems(){
        return this.items.values();
    }
}
