package com.example.samprojectdb.controller;

import com.example.samprojectdb.repository.NrcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nrc")
public class NrcController {
    @Autowired
    private NrcRepo nrcRepo;
}
