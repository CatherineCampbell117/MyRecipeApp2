package com.example.myrecipeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesHolder> {
    private final List<Recipe> recipes;
    private Context context;
    private int itemResource;

    public RecipesAdapter(Context context, int itemResource, List<Recipe> recipes) {

        this.recipes = recipes;
        this.context = context;
        this.itemResource = itemResource;
    }
    @Override
    public RecipesHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(this.itemResource, parent, false);
        return new RecipesHolder(this.context, view);
    }

    @Override
    public void onBindViewHolder(RecipesHolder holder, int position) {

        // Use position to access the correct place object
        Recipe r = this.recipes.get(position);

        // Bind the place object to the holder
        holder.bindRecipe(r);
    }

    @Override
    public int getItemCount() {
        return this.recipes.size();
    }

}