package com.ehr.patientmedicalrecordsservice.mapper.manualmapper;

import com.ehr.patientmedicalrecordsservice.dto.DiagnosisDto;
import com.ehr.patientmedicalrecordsservice.model.Diagnosis;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DiagnosisMapper {

    // Convert Diagnosis entity to DiagnosisDto
    public DiagnosisDto toDto(Diagnosis diagnosis) {
        if (diagnosis == null) {
            return null;
        }
        DiagnosisDto dto = new DiagnosisDto();
        dto.setId(diagnosis.getId());
        dto.setPatientId(diagnosis.getPatientId());
        dto.setCondition(diagnosis.getCondition());
        dto.setSymptoms(diagnosis.getSymptoms());
        dto.setDiagnosticNotes(diagnosis.getDiagnosticNotes());
        return dto;
    }

    // Convert DiagnosisDto to Diagnosis entity
    public Diagnosis toEntity(DiagnosisDto diagnosisDto) {
        if (diagnosisDto == null) {
            return null;
        }
        Diagnosis diagnosis = new Diagnosis();
        diagnosis.setId(diagnosisDto.getId());
        diagnosis.setPatientId(diagnosisDto.getPatientId());
        diagnosis.setCondition(diagnosisDto.getCondition());
        diagnosis.setSymptoms(diagnosisDto.getSymptoms());
        diagnosis.setDiagnosticNotes(diagnosisDto.getDiagnosticNotes());
        return diagnosis;
    }

    // Convert a list of Diagnosis entities to a list of DiagnosisDto
    public List<DiagnosisDto> toDtoList(List<Diagnosis> diagnoses) {
        return diagnoses.stream().map(this::toDto).collect(Collectors.toList());
    }

    // Convert a list of DiagnosisDto to a list of Diagnosis entities
    public List<Diagnosis> toEntityList(List<DiagnosisDto> diagnosisDtos) {
        return diagnosisDtos.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
