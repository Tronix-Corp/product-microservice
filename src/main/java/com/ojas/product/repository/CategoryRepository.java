package com.ojas.product.repository;

import com.ojas.product.dto.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<Category> findByTitle(String title);
}
