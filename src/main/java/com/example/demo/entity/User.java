package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming auto-generation of id
    private long id;

    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AboutToDo> aboutToDolist =new ArrayList<>();

    public User() {
    }

    public User(Long id, String username, String password, List<AboutToDo> aboutToDolist) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.aboutToDolist = aboutToDolist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<AboutToDo> getAboutToDolist() {
        return aboutToDolist;
    }

    public void setAboutToDolist(List<AboutToDo> aboutToDolist) {
        this.aboutToDolist = aboutToDolist;
    }
}
