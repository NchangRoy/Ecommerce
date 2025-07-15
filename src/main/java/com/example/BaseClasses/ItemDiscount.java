package com.example.BaseClasses;

import java.time.LocalDate;

import com.example.BaseClasses.Enums.DiscountType;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
@Entity
public class ItemDiscount extends Discount {
    @ManyToOne
    private Item item;

    public ItemDiscount(String code, DiscountType type, LocalDate startDate, LocalDate endDate, Integer maxUsers,
            Integer usedCount, Item item) {
        super(code, type, startDate, endDate, maxUsers, usedCount);
        this.item = item;
    }
    public ItemDiscount(){

    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    

    

}
