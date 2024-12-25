package com.ehr.patientmedicalrecordsservice.controller;

import com.ehr.patientmedicalrecordsservice.dto.DiagnosisDto;
import com.ehr.patientmedicalrecordsservice.service.DiagnosisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnosis")
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class DiagnosisController {
    @Autowired
    private DiagnosisService diagnosisService;

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<DiagnosisDto>> getDiagnosissByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(diagnosisService.getDiagnosisByPatientId(patientId));
    }

    @PostMapping
    public ResponseEntity<DiagnosisDto> addDiagnosis(@RequestBody DiagnosisDto diagnosisDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(diagnosisService.addDiagnosis(diagnosisDto));
    }
}