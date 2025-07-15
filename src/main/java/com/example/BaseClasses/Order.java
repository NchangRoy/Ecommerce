package com.example.BaseClasses;

import java.time.LocalDateTime;


import com.example.BaseClasses.Enums.OrderStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Cart cart;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private Double totalAmount;

    private Discount discount;
    private LocalDateTime createdAt;
    public Order(Cart cart, OrderStatus status, Double totalAmount, LocalDateTime createdAt) {
        this.cart = cart;
        this.status = status;
        this.totalAmount = totalAmount;
        this.createdAt = createdAt;
    }
    public Order(){

    }

    
    public Integer getOrderId() {
        return orderId;
    }
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Discount getDiscount() {
        return discount;
    }
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", cart=" + cart + ", status=" + status + ", totalAmount=" + totalAmount
                + ", discount=" + discount + ", createdAt=" + createdAt + "]";
    }

    

    


    


    
}
