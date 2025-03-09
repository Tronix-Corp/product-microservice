package com.mayank.product.repository;

import com.mayank.product.dto.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findByTitle(String title);
}
