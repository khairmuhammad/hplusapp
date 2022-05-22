package com.test.hplus.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @javax.persistence.Id
    private int Id;
    private String name;
    private String imagePath;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
