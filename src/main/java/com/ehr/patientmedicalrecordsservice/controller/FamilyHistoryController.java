package com.ehr.patientmedicalrecordsservice.controller;

import com.ehr.patientmedicalrecordsservice.dto.FamilyHistoryDto;
import com.ehr.patientmedicalrecordsservice.service.FamilyHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/familyHistory")
public class FamilyHistoryController {
    @Autowired
    private FamilyHistoryService familyHistoryService;

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<FamilyHistoryDto>> getFamilyHistorysByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(familyHistoryService.getFamilyHistoryByPatientId(patientId));
    }

    @PostMapping
    public ResponseEntity<FamilyHistoryDto> addFamilyHistory(@RequestBody FamilyHistoryDto familyHistoryDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(familyHistoryService.addFamilyHistory(familyHistoryDto));
    }
}

