package com.ehr.patientmedicalrecordsservice.dao;


import com.ehr.patientmedicalrecordsservice.model.FamilyHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamilyHistoryRepository extends JpaRepository<FamilyHistory, Long> {
    List<FamilyHistory> findByPatientId(Long patientId);
}