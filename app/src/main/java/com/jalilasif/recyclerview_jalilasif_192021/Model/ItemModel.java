package com.jalilasif.recyclerview_jalilasif_192021.Model;

public class ItemModel {

    private String title;
    private String description;
    private int image;

    public ItemModel(int image, String title, String description) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

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

}
