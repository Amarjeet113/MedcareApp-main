package com.example.MedcareApp.Interafce;


import com.example.MedcareApp.testModel.MedicalTest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalTestRepository extends MongoRepository<MedicalTest, String> {
}
