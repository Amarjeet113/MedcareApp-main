package com.example.MedcareApp.Interafce;

import com.example.MedcareApp.Entity.DailyUpdate;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DailyUpdateRepository extends MongoRepository<DailyUpdate, String> {
    List<DailyUpdate> findByPatientId(String patientId);
}
