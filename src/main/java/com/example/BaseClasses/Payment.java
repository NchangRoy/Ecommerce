package com.example.BaseClasses;

import java.time.LocalDateTime;


import com.example.BaseClasses.Enums.PaymentMethod;
import com.example.BaseClasses.Enums.PaymentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;
    @ManyToOne
    private Order order;
    @Enumerated(EnumType.STRING)
    private PaymentMethod method;
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
    private String transactionId;
    private Double amount;
    private LocalDateTime date;
    public Payment(Order order, PaymentMethod method, PaymentStatus status, String transactionId, Double amount,
            LocalDateTime date) {
        this.order = order;
        this.method = method;
        this.status = status;
        this.transactionId = transactionId;
        this.amount = amount;
        this.date = date;
    }
    public Payment(){

    }
    public Integer getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public PaymentMethod getMethod() {
        return method;
    }
    public void setMethod(PaymentMethod method) {
        this.method = method;
    }
    public PaymentStatus getStatus() {
        return status;
    }
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId + ", order=" + order + ", method=" + method + ", status=" + status
                + ", transactionId=" + transactionId + ", Amount=" + amount + ", date=" + date + "]";
    }
    
    
    
    

}
