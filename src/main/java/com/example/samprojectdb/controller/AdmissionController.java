package com.example.samprojectdb.controller;

import com.example.samprojectdb.entity.Admission;
import com.example.samprojectdb.repository.AdmissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
    @Autowired
    private AdmissionRepo admissionRepo;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Admission> getAll()
    {
        List<Admission> list = admissionRepo.findAll();
//        for(Admission a:list)
//        {
//            System.out.println(a);
//        }
        return  list;
    }
}
