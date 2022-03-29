package com.example.samprojectdb.controller;

import com.example.samprojectdb.repository.AwcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/awc")
public class AwcController {
    @Autowired
    private AwcRepo awcRepo;
}
