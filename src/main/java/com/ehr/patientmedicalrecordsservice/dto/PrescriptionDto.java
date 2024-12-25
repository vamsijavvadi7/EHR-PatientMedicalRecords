package com.ehr.patientmedicalrecordsservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class PrescriptionDto {
    private Long id;
    @NotNull(message = "Patient ID is required.")
    private Long patientId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public PrescriptionDto(){

    }
    public @NotNull(message = "Patient ID is required.") Long getPatientId() {
        return patientId;
    }

    public void setPatientId(@NotNull(message = "Patient ID is required.") Long patientId) {
        this.patientId = patientId;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    private String medicationName;
    private String dosage;
    private String frequency;
    private String instructions;
}
