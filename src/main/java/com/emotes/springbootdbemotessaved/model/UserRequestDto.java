package com.emotes.springbootdbemotessaved.model;

public class UserRequestDto {

    private String username;

    private String emotion;

    public UserRequestDto() {
    }

    public UserRequestDto(String username, String emotion) {
        this.username = username;
        this.emotion = emotion;
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
