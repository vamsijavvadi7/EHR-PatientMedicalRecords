package com.ehr.patientmedicalrecordsservice.mapper;

//DiagnosisMapper.java

import com.ehr.patientmedicalrecordsservice.dto.DiagnosisDto;
import com.ehr.patientmedicalrecordsservice.model.Diagnosis;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") // This tells Spring to automatically discover and inject this mapper
public interface DiagnosisMapper {

    DiagnosisDto toDto(Diagnosis diagnosis);

    Diagnosis toEntity(DiagnosisDto diagnosisDto);
}
