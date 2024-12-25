package com.ehr.patientmedicalrecordsservice.controller;

import com.ehr.patientmedicalrecordsservice.dto.PrescriptionDto;
import com.ehr.patientmedicalrecordsservice.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
    @Autowired
    private PrescriptionService prescriptionService;

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<PrescriptionDto>> getPrescriptionsByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(prescriptionService.getPrescriptionByPatientId(patientId));
    }

    @PostMapping
    public ResponseEntity<PrescriptionDto> addPrescription(@RequestBody PrescriptionDto prescriptionDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(prescriptionService.addPrescription(prescriptionDto));
    }
}

