package com.example.samprojectdb.repository;

import com.example.samprojectdb.entity.Admission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRepo extends JpaRepository<Admission,Integer> {

}
