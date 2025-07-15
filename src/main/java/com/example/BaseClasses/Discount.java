package com.example.BaseClasses;

import java.time.LocalDate;

import com.example.BaseClasses.Enums.DiscountType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer discountId;
    private String code;
    private DiscountType type;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer maxUsers;
    private Integer usedCount;
    public Discount(String code, DiscountType type, LocalDate startDate, LocalDate endDate, Integer maxUsers,
            Integer usedCount) {
        this.code = code;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxUsers = maxUsers;
        this.usedCount = usedCount;
    }
    public Discount(){

    }
    public Integer getDiscountId() {
        return discountId;
    }
    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public DiscountType getType() {
        return type;
    }
    public void setType(DiscountType type) {
        this.type = type;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public Integer getMaxUsers() {
        return maxUsers;
    }
    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }
    public Integer getUsedCount() {
        return usedCount;
    }
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }
    

    
    

}
