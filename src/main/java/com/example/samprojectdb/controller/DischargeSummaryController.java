package com.example.samprojectdb.controller;

import com.example.samprojectdb.entity.DischargeSummary;
import com.example.samprojectdb.entity.FollowUp;
import com.example.samprojectdb.repository.DischargeSummaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/discharge_summary")
public class DischargeSummaryController {
    @Autowired
    private DischargeSummaryRepo dischargeSummaryRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<DischargeSummary> getAll()
    {
        return dischargeSummaryRepo.findAll();
    }
    @RequestMapping("/findByAwwId/{aww_id}")
    public List<DischargeSummary> getAllDischargeSummaries(@PathVariable("aww_id") int awwId)
    {
        return dischargeSummaryRepo.findDischargeSummaryByAww_AwwId(awwId);
    }
}
