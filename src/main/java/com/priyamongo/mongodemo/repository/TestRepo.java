package com.priyamongo.mongodemo.repository;

import com.priyamongo.mongodemo.model.TestModel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestRepo extends MongoRepository<TestModel, String> {
    
}
