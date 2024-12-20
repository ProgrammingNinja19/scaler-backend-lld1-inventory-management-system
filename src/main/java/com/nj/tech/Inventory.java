package com.nj.tech;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * Created by Ninad Jingare on  Date: 20-12-2024
 */
public class Inventory<T extends Item> {
    private HashMap<String,T> items;
    private LinkedList<T> recentlyViewdItems;

    public Inventory() {
        this.items = new HashMap<>();
        this.recentlyViewdItems = new LinkedList<>();
    }

    public Inventory(HashMap<String, T> items,LinkedList<T> recentlyViewdItems) {
        this.items = items;
        this.recentlyViewdItems = recentlyViewdItems;
    }

    public HashMap<String, T> getItems() {
        return items;
    }

    public void setItems(HashMap<String, T> items) {
        this.items = items;
    }

    public void addItem(T item){
        if(items.containsKey(item.getId())){
            System.out.println("Item "+item+"already exists");
            return;
        }
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

    public void addRecentlyViewItems(T item){
            if(recentlyViewdItems.size()==10){
                recentlyViewdItems.remove(recentlyViewdItems.get(0));
            }
            recentlyViewdItems.add(item);

    }
}
