package com.example.samprojectdb.controller;

import com.example.samprojectdb.entity.Child;
import com.example.samprojectdb.repository.ChildRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

//@RequestMapping("/child")
@RequestMapping("/api/v1")
@CrossOrigin(origins="*")

public class ChildController {

    @Autowired
    private ChildRepo childRepo;

    @GetMapping("/children")
    @ResponseBody
    public List<Child> getAllChildren(){
        return childRepo.findAll();
    }

    @PostMapping("/children")
    public Child saveChildDetails(@RequestBody Child child) {
        System.out.println(child.toString());
        return childRepo.save(child);
    }

}
