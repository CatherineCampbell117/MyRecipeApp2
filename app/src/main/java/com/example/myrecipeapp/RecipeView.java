package com.example.myrecipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecipeView extends AppCompatActivity {
    private RecyclerView recipesListView;
    private ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_view);


        loadRecipes();
        recipesListView = (RecyclerView)findViewById(R.id.recipes_list);
        // if the recyclerview doesn't change size, we can set this true and
        recipesListView.setHasFixedSize(true);

        // get the data

        System.out.println(recipes);
        // Initialize the Places adapter, which binds the data to the entry view
        RecipesAdapter adapter =
                new RecipesAdapter(this, R.layout.recipe_list_items, recipes);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recipesListView.setLayoutManager(layoutManager);

        recipesListView.setAdapter(adapter);
        // You can change animation of items and decorations
        // by using ItemAnimator and ItemDecorators and binding them
        // by calling to appropriate method attractionsListView.setItem...


    }

    private void loadRecipes() {
        recipes = new ArrayList<Recipe>();

        Recipe lasagne = new Recipe(
                "Lasagne");
        lasagne.setImagesource("lasagne.jpg");

        Recipe caramel_brownies = new Recipe(
                "Caramel Brownies");
        caramel_brownies.setImagesource("caramel_brownie.jpg");

        Recipe thai_beef_rice = new Recipe(
                "Thai Beef Rice");
        thai_beef_rice.setImagesource("thai_beef_rice.jpeg");

        recipes.add(lasagne);
        recipes.add(caramel_brownies);
        recipes.add(thai_beef_rice);
        // to get more entries, simple copy and paste the previous
        // three lines a few times underneath here. This will give you
        // a longer list to scroll through. You can also add some more
        // places on your own.
    }

}