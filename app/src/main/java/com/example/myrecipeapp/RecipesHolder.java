package com.example.myrecipeapp;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class RecipesHolder extends RecyclerView.ViewHolder
        implements View.OnClickListener  {

        private final TextView recipeName;
        private final ImageView recipeImage;

        private Recipe recipe;
        private Context context;

    public void bindRecipe(Recipe recipe) {
        // Bind the data to the ViewHolder
        this.recipe = recipe;
        this.recipeName.setText(recipe.getName());
        this.recipeImage.setImageResource(recipe.getResId(recipe.getImagesource(),R.drawable.class));
    }

    @Override
    public void onClick(View v) {
        if (this.recipe != null) {
            Toast.makeText(this.context,
                    "Clicked on " + this.recipe.getName(),
                    Toast.LENGTH_LONG ).show();
        }
    }
    public RecipesHolder(Context context, View itemView) {
        super(itemView);

        this.context = context;

//        this.locationIcon =
//                (ImageView) itemView.findViewById(R.id.entry_location_icon);
        this.recipeName =
                (TextView) itemView.findViewById(R.id.entry_location_name);
        this.recipeImage = (ImageView) itemView.findViewById(R.id.entry_location_icon);

        // Set the "onClick" listener of the holder
        // here we use (this) because this class has a onClick function thanks
        // to implementing the PlacesHolder class with the
        // View.OnClickListener interface
        itemView.setOnClickListener(this);
    }
}

