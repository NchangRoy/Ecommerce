package com.example.BaseClasses;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    private  String name;
    private  String description;
    @ManyToOne
    private Category category;
    public Item( String name, String description, Category category) {
        
        this.name = name;
        this.description = description;
        this.category = category;
    }
    public Item(){

    }
    public Integer getItemId() {
        return itemId;
    }
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Item [itemId=" + itemId + ", name=" + name + ", description=" + description + ", category=" + category
                + "]";
    }

    
    
    

    
    
}
