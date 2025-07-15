package com.example.BaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemVariant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemVariantId;
    private Item item;
    private String size;
    private String color;
    private Integer Stock;
    public ItemVariant( Item item, String size, String color, Integer stock) {
        
        this.item = item;
        this.size = size;
        this.color = color;
        Stock = stock;
    }
    public ItemVariant(){

    }
    public Integer getItemVariantId() {
        return itemVariantId;
    }
    public void setItemVariantId(Integer itemVariantId) {
        this.itemVariantId = itemVariantId;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getStock() {
        return Stock;
    }
    public void setStock(Integer stock) {
        Stock = stock;
    }
    @Override
    public String toString() {
        return "ItemVariant [itemVariantId=" + itemVariantId + ", item=" + item + ", size=" + size + ", color=" + color
                + ", Stock=" + Stock + "]";
    }




   
    
    
    
}

