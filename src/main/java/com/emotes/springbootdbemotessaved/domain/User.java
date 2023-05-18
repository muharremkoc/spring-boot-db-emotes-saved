package com.emotes.springbootdbemotessaved.domain;

import jakarta.persistence.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users")
@SuperBuilder
public class User extends UserAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    @Column(columnDefinition = "TEXT")
    private String emotion;

    public User() {
    }

    public User(int id, String username, String emotion) {
        this.id = id;
        this.username = username;
        this.emotion = emotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }
}
