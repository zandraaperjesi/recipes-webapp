package com.zandraa.recipes.recipesapp.repositories;

import com.zandraa.recipes.recipesapp.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
