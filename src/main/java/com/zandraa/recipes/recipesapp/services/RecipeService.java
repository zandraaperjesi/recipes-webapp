package com.zandraa.recipes.recipesapp.services;

import com.zandraa.recipes.recipesapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
