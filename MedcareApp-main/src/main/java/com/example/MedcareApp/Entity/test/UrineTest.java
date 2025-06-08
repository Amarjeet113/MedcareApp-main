package com.example.MedcareApp.Entity.test;
import com.example.MedcareApp.Entity.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "urinetests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UrineTest {
    @Id
    private String id;
    private Patient patient;
    private String glucose;
    private String protein;
    private String ketones;
    private String ph;
    private String blood;
    private String note;
}
