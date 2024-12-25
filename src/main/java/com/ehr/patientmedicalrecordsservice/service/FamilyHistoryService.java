package com.ehr.patientmedicalrecordsservice.service;

// FamilyHistoryService.java


import com.ehr.patientmedicalrecordsservice.dao.FamilyHistoryRepository;
import com.ehr.patientmedicalrecordsservice.dto.FamilyHistoryDto;
import com.ehr.patientmedicalrecordsservice.mapper.manualmapper.FamilyHistoryMapper;
import com.ehr.patientmedicalrecordsservice.model.FamilyHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FamilyHistoryService {

    @Autowired
    private FamilyHistoryRepository familyHistoryRepository;

    @Autowired
    private FamilyHistoryMapper familyHistoryMapper;

    // Get all family history records for a specific patient
    public List<FamilyHistoryDto> getFamilyHistoryByPatientId(Long patientId) {
        List<FamilyHistory> familyHistoryList = familyHistoryRepository.findByPatientId(patientId);
        return familyHistoryMapper.toDtoList(familyHistoryList);
    }

    // Add a new family history record
    public FamilyHistoryDto addFamilyHistory(FamilyHistoryDto familyHistoryDto) {
        FamilyHistory familyHistory = familyHistoryMapper.toEntity(familyHistoryDto);
        familyHistoryRepository.save(familyHistory);
        return familyHistoryMapper.toDto(familyHistory);
    }
}
