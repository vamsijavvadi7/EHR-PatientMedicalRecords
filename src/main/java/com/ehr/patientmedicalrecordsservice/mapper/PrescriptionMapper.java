package com.ehr.patientmedicalrecordsservice.mapper;

//PrescriptionMapper.java
import com.ehr.patientmedicalrecordsservice.dto.DiagnosisDto;
import com.ehr.patientmedicalrecordsservice.dto.PrescriptionDto;
import com.ehr.patientmedicalrecordsservice.model.Diagnosis;
import com.ehr.patientmedicalrecordsservice.model.Prescription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") // This tells Spring to automatically discover and inject this mapper
public interface PrescriptionMapper {


    PrescriptionDto toDto(Prescription prescription);

    Prescription toEntity(PrescriptionDto prescriptionDto);
}
