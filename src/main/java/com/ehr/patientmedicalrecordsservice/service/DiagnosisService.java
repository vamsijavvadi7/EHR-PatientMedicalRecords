package com.ehr.patientmedicalrecordsservice.service;
// DiagnosisService.java

import com.ehr.patientmedicalrecordsservice.dao.DiagnosisRepository;
import com.ehr.patientmedicalrecordsservice.dto.DiagnosisDto;
import com.ehr.patientmedicalrecordsservice.mapper.manualmapper.DiagnosisMapper;
import com.ehr.patientmedicalrecordsservice.model.Diagnosis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosisService {

    @Autowired
    private DiagnosisRepository diagnosisRepository;

    @Autowired
    private DiagnosisMapper diagnosisMapper;

    public List<DiagnosisDto> getDiagnosisByPatientId(Long patientId) {
        List<Diagnosis> diagnoses = diagnosisRepository.findByPatientId(patientId);
        return diagnosisMapper.toDtoList(diagnoses);
    }

    public DiagnosisDto addDiagnosis(DiagnosisDto diagnosisDto) {
        Diagnosis diagnosis = diagnosisMapper.toEntity(diagnosisDto);
        diagnosisRepository.save(diagnosis);
        return diagnosisMapper.toDto(diagnosis);
    }
}
