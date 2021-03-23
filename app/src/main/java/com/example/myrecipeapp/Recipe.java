package com.example.myrecipeapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.lang.reflect.Field;

public class Recipe {
    private String name;

    private String imagesource;

    public void setImagesource(String imagesource) {
        this.imagesource = imagesource;
    }

    public String getImagesource() {
        return imagesource;
    }

    public String getName() { return this.name; }

    public void setName(String n) { this.name = n; }

    public Recipe(String n) {
        setName(n);
    }

    public Recipe(Recipe r) {
        setName(r.name);
    }

    public int getResId(String resName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(resName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }
}

