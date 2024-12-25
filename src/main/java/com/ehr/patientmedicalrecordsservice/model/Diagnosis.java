package com.ehr.patientmedicalrecordsservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "diagnoses")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_id", nullable = false)
    private Long patientId;

    @Column(name = "`condition`", nullable = false)
    private String condition;

    @Column(name = "symptoms")
    private String symptoms;

    @Lob
    @Column(name = "diagnostic_notes",columnDefinition = "TEXT")
    private String diagnosticNotes;

}


