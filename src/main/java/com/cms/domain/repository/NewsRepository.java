package com.cms.domain.repository;


import com.cms.domain.model.News;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NewsRepository extends ReactiveMongoRepository<News,String> {
}