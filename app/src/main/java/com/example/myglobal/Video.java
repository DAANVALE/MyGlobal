package com.example.myglobal;

import androidx.recyclerview.widget.RecyclerView;

public class Video {

    private int Id;
    private String Title;
    private String Category;
    private String Description;
    private int Thumbnail;

    public Video() {
    }

    public Video(String title, String category, String description, int thumbnail) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public int getId(){ return Id; }

    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setId(int id){ Id = id; }

    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
