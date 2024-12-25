package com.ehr.patientmedicalrecordsservice.mapper.manualmapper;

import com.ehr.patientmedicalrecordsservice.dto.FamilyHistoryDto;
import com.ehr.patientmedicalrecordsservice.model.FamilyHistory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FamilyHistoryMapper {

    // Convert FamilyHistory entity to FamilyHistoryDto
    public FamilyHistoryDto toDto(FamilyHistory familyHistory) {
        if (familyHistory == null) {
            return null;
        }
        FamilyHistoryDto dto = new FamilyHistoryDto();
        dto.setId(familyHistory.getId());
        dto.setPatientId(familyHistory.getPatientId());
        dto.setCondition(familyHistory.getCondition());
        dto.setRelationship(familyHistory.getRelationship());
        return dto;
    }

    // Convert FamilyHistoryDto to FamilyHistory entity
    public FamilyHistory toEntity(FamilyHistoryDto familyHistoryDto) {
        if (familyHistoryDto == null) {
            return null;
        }
        FamilyHistory familyHistory = new FamilyHistory();
        familyHistory.setId(familyHistoryDto.getId());
        familyHistory.setPatientId(familyHistoryDto.getPatientId());
        familyHistory.setCondition(familyHistoryDto.getCondition());
        familyHistory.setRelationship(familyHistoryDto.getRelationship());
        return familyHistory;
    }

    // Convert a list of FamilyHistory entities to a list of FamilyHistoryDto
    public List<FamilyHistoryDto> toDtoList(List<FamilyHistory> familyHistoryList) {
        return familyHistoryList.stream().map(this::toDto).collect(Collectors.toList());
    }

    // Convert a list of FamilyHistoryDto to a list of FamilyHistory entities
    public List<FamilyHistory> toEntityList(List<FamilyHistoryDto> familyHistoryDtoList) {
        return familyHistoryDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
