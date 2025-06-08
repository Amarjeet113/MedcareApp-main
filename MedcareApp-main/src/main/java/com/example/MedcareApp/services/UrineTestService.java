package com.example.MedcareApp.services;

import java.util.List;
import java.util.Optional;

import com.example.MedcareApp.Entity.test.UrineTest;
import com.example.MedcareApp.Interafce.UrineTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrineTestService {

    @Autowired
    private UrineTestRepository repository;

    public List<UrineTest> findAll() {
        return repository.findAll();
    }

    public Optional<UrineTest> findById(String id) {
        return repository.findById(id);
    }

    public UrineTest save(UrineTest urineTest) {
        return repository.save(urineTest);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
