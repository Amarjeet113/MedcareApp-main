package com.example.MedcareApp.testModel;


import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "medical_tests")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
class MedicalTest {
    @Id
    private var id: String? = null

    private var patientName: String? = null
    private var age = 0
    private var gender: String? = null
    private var referredBy: String? = null

    private var testType: MedicalTestType? = null
    private var labTechnician: String? = null
    private var remarks: String? = null

    val price: Int
        get() = testType!!.price // dynamically get price from enum
}
