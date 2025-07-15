package com.example.BaseClasses;

import java.time.LocalDateTime;

import com.example.BaseClasses.Enums.DeliveryStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deliveryId;
    @OneToOne
    private Order order;
    private String address;
    private String city;
    private String country;
    private String trackingNumber;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    
        public Delivery(Order order, String address, String city, String country, String trackingNumber,
            LocalDateTime shippedAt, LocalDateTime deliveredAt, DeliveryStatus status) {
        this.order = order;
        this.address = address;
        this.city = city;
        this.country = country;
        this.trackingNumber = trackingNumber;
        this.shippedAt = shippedAt;
        this.deliveredAt = deliveredAt;
        this.status = status;
    }


        public Delivery(){

    }


        public Integer getDeliveryId() {
            return deliveryId;
        }


        public void setDeliveryId(Integer deliveryId) {
            this.deliveryId = deliveryId;
        }


        public Order getOrder() {
            return order;
        }


        public void setOrder(Order order) {
            this.order = order;
        }


        public String getAddress() {
            return address;
        }


        public void setAddress(String address) {
            this.address = address;
        }


        public String getCity() {
            return city;
        }


        public void setCity(String city) {
            this.city = city;
        }


        public String getCountry() {
            return country;
        }


        public void setCountry(String country) {
            this.country = country;
        }


        public String getTrackingNumber() {
            return trackingNumber;
        }


        public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }


        public LocalDateTime getShippedAt() {
            return shippedAt;
        }


        public void setShippedAt(LocalDateTime shippedAt) {
            this.shippedAt = shippedAt;
        }


        public LocalDateTime getDeliveredAt() {
            return deliveredAt;
        }


        public void setDeliveredAt(LocalDateTime deliveredAt) {
            this.deliveredAt = deliveredAt;
        }public Delivery(Order order, String address, String city, String country, String trackingNumber,
            LocalDateTime shippedAt, LocalDateTime deliveredAt) {
        this.order = order;
        this.address = address;
        this.city = city;
        this.country = country;
        this.trackingNumber = trackingNumber;
        this.shippedAt = shippedAt;
        this.deliveredAt = deliveredAt;
    }



        public DeliveryStatus getStatus() {
            return status;
        }


        public void setStatus(DeliveryStatus status) {
            this.status = status;
        }


        @Override
        public String toString() {
            return "Delivery [deliveryId=" + deliveryId + ", order=" + order + ", address=" + address + ", city=" + city
                    + ", country=" + country + ", trackingNumber=" + trackingNumber + ", shippedAt=" + shippedAt
                    + ", deliveredAt=" + deliveredAt + ", status=" + status + "]";
        }


        




    
}
