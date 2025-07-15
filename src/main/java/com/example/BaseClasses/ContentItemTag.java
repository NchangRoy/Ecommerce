package com.example.BaseClasses;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ContentItemTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taggingId;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Content content;
    public ContentItemTag( Item item, Content content) {
        
        this.item = item;
        this.content = content;
    }
    public ContentItemTag(){

    }
    public Integer getTaggindId() {
        return taggingId;
    }
    public void setTaggindId(Integer taggindId) {
        this.taggingId = taggindId;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public Content getContent() {
        return content;
    }
    public void setContent(Content content) {
        this.content = content;
    }
    @Override
    public String toString() {
        return "ContentItemTag [taggindId=" + taggingId + ", item=" + item + ", content=" + content + "]";
    }


    
    
}
