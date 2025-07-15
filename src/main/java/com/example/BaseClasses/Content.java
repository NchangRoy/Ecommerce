package com.example.BaseClasses;

import java.time.LocalDate;

import com.example.BaseClasses.Enums.ContentType;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contentId;

    @Enumerated(EnumType.STRING)
    private ContentType type;

    private String caption;
    private String url;
    private LocalDate createdAt;
    private String createdBy;
    public Content(Integer contentId, ContentType type, String caption, String url, LocalDate createdAt,
            String createdBy) {
        this.contentId = contentId;
        this.type = type;
        this.caption = caption;
        this.url = url;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }
    public Content(){

    }
    public Integer getContentId() {
        return contentId;
    }
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }
    public ContentType getType() {
        return type;
    }
    public void setType(ContentType type) {
        this.type = type;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    
}
