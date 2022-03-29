package com.example.samprojectdb.controller;
//import org.springframework.stereotype.Controller;
import com.example.samprojectdb.repository.FollowUpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/followup")
public class FollowUpController {
    @Autowired
    private FollowUpRepo followUpRepo;


}
