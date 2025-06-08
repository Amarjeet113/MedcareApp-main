package com.example.MedcareApp.Controller;

import com.example.MedcareApp.Interafce.MedicalTestRepository;
import com.example.MedcareApp.testModel.MedicalTest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medical-tests")
@RequiredArgsConstructor
public class MedicalTestController {

    private final MedicalTestRepository repository;

    @PostMapping
    public ResponseEntity<MedicalTest> saveTest(@RequestBody MedicalTest test) {
        return ResponseEntity.ok(repository.save(test));
    }

    @GetMapping
    public List<MedicalTest> getAll() {
        return repository.findAll();
    }
}
