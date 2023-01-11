package com.cms.domain.service;

import com.cms.domain.model.Category;
import com.cms.domain.repository.CategoryRepository;
import com.cms.domain.vo.CategoryRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Mono<Category> update(String id,CategoryRequest category){
        return this.categoryRepository.findById(id).flatMap(categoryDatabase -> {
            categoryDatabase.setName(category.getName());
            return this.categoryRepository.save(categoryDatabase);
        });
    }

    public Mono<Category> create(CategoryRequest request){
        Category category = new Category();
        category.setName(request.getName());
        return this.categoryRepository.save(category);
    }

    public void delete(String id){
        this.categoryRepository.deleteById(id);
    }

    public Flux<Category> findAll(){
        return this.categoryRepository.findAll();
    }

    public Mono<Category> findOne(String id){
        return this.categoryRepository.findById(id);
    }

}