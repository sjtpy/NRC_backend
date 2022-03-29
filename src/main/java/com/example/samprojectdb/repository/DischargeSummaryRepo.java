package com.example.samprojectdb.repository;
import com.example.samprojectdb.entity.DischargeSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface DischargeSummaryRepo extends JpaRepository<DischargeSummary, Serializable> {

    //public List<DischargeSummary> findByAww_id(int aww_id);

    public List<DischargeSummary> findDischargeSummaryByAww_AwwId(int aww_id);

}
