package com.ehr.patientmedicalrecordsservice.mapper;

// FamilyHistoryMapper.java


import com.ehr.patientmedicalrecordsservice.dto.FamilyHistoryDto;
import com.ehr.patientmedicalrecordsservice.model.FamilyHistory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") // This tells Spring to automatically discover and inject this mapper
public interface FamilyHistoryMapper {

    FamilyHistoryDto toDto(FamilyHistory familyHistory);

    FamilyHistory toEntity(FamilyHistoryDto familyHistoryDto);
}
