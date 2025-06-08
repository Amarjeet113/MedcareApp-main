package com.example.MedcareApp.testModel;

import java.util.Arrays;

public enum MedicalTestType {

    CBC("Complete Blood Count (CBC)", 500),
    BLOOD_CHEMISTRY("Blood Chemistry Test", 800),
    LIPID_PROFILE("Lipid Profile", 600),
    BLOOD_CULTURE("Blood Culture", 1000),
    COAGULATION_TEST("Coagulation Test", 700),
    URINALYSIS("Urinalysis", 300),
    URINE_CULTURE("Urine Culture", 450),
    XRAY("X-ray", 1200),
    ULTRASOUND("Ultrasound", 1500),
    CT_SCAN("CT Scan", 4000),
    MRI("MRI", 5000),
    MAMMOGRAPHY("Mammography", 3500),
    PET_SCAN("PET Scan", 6000),
    TISSUE_BIOPSY("Tissue Biopsy", 2000),
    CYTOLOGY("Cytology", 1500),
    GENETIC_TEST("Genetic Test", 8000),
    CULTURE_SENSITIVITY("Culture and Sensitivity", 700),
    RAPID_ANTIGEN("Rapid Antigen Test", 400),
    PCR_TEST("PCR Test", 3500),
    ECG("Electrocardiogram (ECG)", 900),
    ECHOCARDIOGRAM("Echocardiogram", 1200),
    STRESS_TEST("Stress Test", 1000),
    ALLERGY_TEST("Allergy Test", 2500),
    THYROID_FUNCTION("Thyroid Function Test", 800),
    BONE_DENSITY("Bone Density Test", 2000),
    PULMONARY_FUNCTION("Pulmonary Function Test", 1800),
    LUMBAR_PUNCTURE("Lumbar Puncture", 3000);

    private final String displayName;
    private final int price;

    MedicalTestType(String displayName, int price) {
        this.displayName = displayName;
        this.price = price;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getPrice() {
        return price;
    }

    public static MedicalTestType fromDisplayName(String name) {
        return Arrays.stream(MedicalTestType.values())
                .filter(t -> t.displayName.equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown test name: " + name));
    }
}
