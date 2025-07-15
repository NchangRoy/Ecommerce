package com.example.BaseClasses;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sectionId;
    private String name;
   

    public Section(Integer sectionId, String name) {
        this.sectionId = sectionId;
        this.name = name;

    }

    public Section(){

    }
    public Integer getSectionId() {
        return sectionId;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Section [sectionId=" + sectionId + ", name=" + name + "]";
    }


    
}
