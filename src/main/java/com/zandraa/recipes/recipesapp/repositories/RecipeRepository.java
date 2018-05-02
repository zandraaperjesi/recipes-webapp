package com.zandraa.recipes.recipesapp.repositories;

import com.zandraa.recipes.recipesapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
