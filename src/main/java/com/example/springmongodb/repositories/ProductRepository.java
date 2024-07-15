package com.example.springmongodb.repositories;

import com.example.springmongodb.models.Penguin;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Penguin, ObjectId> {
}
