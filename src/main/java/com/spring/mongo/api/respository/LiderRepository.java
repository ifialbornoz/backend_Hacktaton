package com.spring.mongo.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Lideres;

public interface LiderRepository extends MongoRepository<Lideres, Integer>{

}
