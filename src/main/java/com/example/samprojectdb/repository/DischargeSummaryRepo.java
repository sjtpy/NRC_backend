package com.example.samprojectdb.repository;
import com.example.samprojectdb.entity.DischargeSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.io.Serializable;
import java.util.List;

public interface DischargeSummaryRepo extends JpaRepository<DischargeSummary, Serializable> {


//    //public List<DischargeSummary> findDischargeSummaryByAww_AwwId(int aww_id);
//    @Query("SELECT admissionId FROM admission WHERE child.samId = :samId");
//    int findAdmissioinIdbySamId(int samId);
//
//    @Query("INSERT INTO discharge_summary VALUES (2001-08-21T22:30:03.000+00:00,40.1,good,normal"));
//    void insertIntoDischargeTable();
}
