package com.example.MedcareApp.Interafce;

import com.example.MedcareApp.Entity.test.UrineTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrineTestRepository extends MongoRepository<UrineTest, String> {
}
