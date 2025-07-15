package com.example.BaseClasses;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;
    @ManyToAny
    private Client client;
    public Cart(Integer cartId, Client client) {
        this.cartId = cartId;
        this.client = client;
    }
    public Cart(){
        
    }
    public Integer getCartId() {
        return cartId;
    }
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    @Override
    public String toString() {
        return "Cart [cartId=" + cartId + ", client=" + client + "]";
    }
    
    
    
}
