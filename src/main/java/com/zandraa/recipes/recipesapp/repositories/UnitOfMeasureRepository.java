package com.zandraa.recipes.recipesapp.repositories;

import com.zandraa.recipes.recipesapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
}
