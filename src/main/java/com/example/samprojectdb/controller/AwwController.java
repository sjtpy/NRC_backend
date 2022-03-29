package com.example.samprojectdb.controller;

import com.example.samprojectdb.entity.DischargeSummary;
import com.example.samprojectdb.entity.FollowUp;
import com.example.samprojectdb.repository.AwwRepo;
import com.example.samprojectdb.repository.DischargeSummaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aww")
public class AwwController {
    @Autowired
    private AwwRepo awwRepo;


//    @GetMapping("/{aww_id}/getAllFollowups")
//    public List<FollowUp> getAllFollowups(int aww_id)
//    {
//
//    }
}
