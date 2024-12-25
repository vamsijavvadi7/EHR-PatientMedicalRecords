package com.ehr.patientmedicalrecordsservice.service;

// PrescriptionService.java


import com.ehr.patientmedicalrecordsservice.dao.PrescriptionRepository;
import com.ehr.patientmedicalrecordsservice.dto.PrescriptionDto;
import com.ehr.patientmedicalrecordsservice.mapper.manualmapper.PrescriptionMapper;
import com.ehr.patientmedicalrecordsservice.model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Autowired
    private PrescriptionMapper prescriptionMapper;

    // Get all prescriptions for a specific patient
    public List<PrescriptionDto> getPrescriptionByPatientId(Long patientId) {
        List<Prescription> prescriptions = prescriptionRepository.findByPatientId(patientId);
        return prescriptionMapper.toDtoList(prescriptions);
    }

    // Add a new prescription
    public PrescriptionDto addPrescription(PrescriptionDto prescriptionDto) {
        Prescription prescription = prescriptionMapper.toEntity(prescriptionDto);
        prescriptionRepository.save(prescription);
        return prescriptionMapper.toDto(prescription);
    }
}
