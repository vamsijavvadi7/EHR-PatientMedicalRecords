package com.ehr.patientmedicalrecordsservice.mapper.manualmapper;

import com.ehr.patientmedicalrecordsservice.dto.PrescriptionDto;
import com.ehr.patientmedicalrecordsservice.model.Prescription;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PrescriptionMapper {

    // Convert Prescription entity to PrescriptionDto
    public PrescriptionDto toDto(Prescription prescription) {
        if (prescription == null) {
            return null;
        }
        PrescriptionDto dto = new PrescriptionDto();
        dto.setId(prescription.getId());
        dto.setPatientId(prescription.getPatientId());
        dto.setMedicationName(prescription.getMedicationName());
        dto.setDosage(prescription.getDosage());
        dto.setFrequency(prescription.getFrequency());
        dto.setInstructions(prescription.getInstructions());
        return dto;
    }

    // Convert PrescriptionDto to Prescription entity
    public Prescription toEntity(PrescriptionDto prescriptionDto) {
        if (prescriptionDto == null) {
            return null;
        }
        Prescription prescription = new Prescription();
        prescription.setId(prescriptionDto.getId());
        prescription.setPatientId(prescriptionDto.getPatientId());
        prescription.setMedicationName(prescriptionDto.getMedicationName());
        prescription.setDosage(prescriptionDto.getDosage());
        prescription.setFrequency(prescriptionDto.getFrequency());
        prescription.setInstructions(prescriptionDto.getInstructions());
        return prescription;
    }

    // Convert a list of Prescription entities to a list of PrescriptionDto
    public List<PrescriptionDto> toDtoList(List<Prescription> prescriptions) {
        return prescriptions.stream().map(this::toDto).collect(Collectors.toList());
    }

    // Convert a list of PrescriptionDto to a list of Prescription entities
    public List<Prescription> toEntityList(List<PrescriptionDto> prescriptionDtoList) {
        return prescriptionDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
