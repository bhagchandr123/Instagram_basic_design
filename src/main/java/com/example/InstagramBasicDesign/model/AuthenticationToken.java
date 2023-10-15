package com.example.InstagramBasicDesign.model;

import com.example.InstagramBasicDesign.model.User;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class AuthenticationToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private LocalDate tokenCreationDate;
    @OneToOne
    private User user;

    public AuthenticationToken() {
    }

    public AuthenticationToken(Long id, String token, LocalDate tokenCreationDate, User user) {
        this.id = id;
        this.token = token;
        this.tokenCreationDate = tokenCreationDate;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDate getTokenCreationDate() {
        return tokenCreationDate;
    }

    public void setTokenCreationDate(LocalDate tokenCreationDate) {
        this.tokenCreationDate = tokenCreationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
