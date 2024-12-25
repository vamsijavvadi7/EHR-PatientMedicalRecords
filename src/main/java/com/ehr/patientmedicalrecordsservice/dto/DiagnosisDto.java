package com.ehr.patientmedicalrecordsservice.dto;


import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
public class DiagnosisDto {
    private Long id;
    @NotNull(message = "Patient ID is required.")
    private Long patientId;
    private String condition;
    private String symptoms;
    private String diagnosticNotes;
}
