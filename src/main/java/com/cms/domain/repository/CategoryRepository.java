package com.cms.domain.repository;

import com.cms.domain.model.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}


