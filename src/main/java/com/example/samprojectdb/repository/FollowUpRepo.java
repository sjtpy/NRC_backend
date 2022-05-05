package com.example.samprojectdb.repository;
import com.example.samprojectdb.entity.FollowUp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface FollowUpRepo extends JpaRepository<FollowUp, Serializable> {

}
