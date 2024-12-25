package com.ehr.patientmedicalrecordsservice.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@Table(name = "family_history")
public class FamilyHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "patient_id", nullable = false)
    private Long patientId;

    @Column(name = "`condition`", nullable = false)
    private String condition;

    @Column(name = "relationship", nullable = false)
    private String relationship;
}
