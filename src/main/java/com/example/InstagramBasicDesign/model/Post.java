package com.example.InstagramBasicDesign.model;

import com.example.InstagramBasicDesign.model.User;
import jakarta.persistence.*;

import java.security.Timestamp;
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String postData;
    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(Long id, Timestamp createdDate, Timestamp updatedDate, String postData, User user) {
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.postData = postData;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getPostData() {
        return postData;
    }

    public void setPostData(String postData) {
        this.postData = postData;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
