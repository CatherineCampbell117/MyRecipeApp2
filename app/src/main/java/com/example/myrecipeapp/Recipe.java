package com.example.myrecipeapp;

import android.graphics.drawable.Drawable;

public class Recipe {
    private String name;

    public String getName() { return this.name; }

    public void setName(String n) { this.name = n; }

    public Recipe(String n) {
        setName(n);
    }

    public Recipe(Recipe r) {
        setName(r.name);
    }
}

