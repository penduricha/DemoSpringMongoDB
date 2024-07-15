package com.example.springmongodb.repositories;

import com.example.springmongodb.models.Penguin;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PenguinRepository extends MongoRepository<Penguin, ObjectId> {
//    boolean existsByPenguinId(int penguin_id);
//    void deleteByPenguinId(int penguin_id);
//    Optional<Penguin> findByPenguin_id(int penguin_id);
}
/*
db.Penguin.insertOne({
  penguin_id: 343,
  species: 'Heo',
  island: 'Nam Cuc',
  bill_length_mm: 39.1,
  bill_depth_mm: 18.7,
  flipper_length_mm: 181,
  body_mass_g: 3750,
  sex: 'MALE'
})
 */