package com.jooplayconsole.powtv.model.entity;

// PostDto.java
public class PostDto {
    private String title;
    private String description;
    private String videoId;
    private int likes;
    private int dislikes;
    private int comments;

    // 생성자
    public PostDto(String title, String description, String videoId, int likes, int dislikes, int comments) {
        this.title = title;
        this.description = description;
        this.videoId = videoId;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = comments;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }
}
