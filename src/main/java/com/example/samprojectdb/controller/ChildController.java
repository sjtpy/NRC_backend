package com.example.samprojectdb.controller;

import com.example.samprojectdb.entity.Child;
import com.example.samprojectdb.repository.ChildRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        return childRepo.save(child);
    }

    @GetMapping("/children/{id}")
    public Child getSingleChild(@PathVariable int id){
        return childRepo.findById(id).get();
    }

    //if the child id is present, the row will be updated
    //else, new row will be created

    //make same funcitons for name,rchid too
    //@PostMapping(value="/rest/account/json", consumes={"application/json"})
    @PutMapping("/children")
    //@RequestMapping( method = RequestMethod.PUT, headers = "Accept=application/json")
    public Child updateChildDetails(@RequestBody Child child){
        return childRepo.save(child);
    }

    @DeleteMapping("/children/{id}")
    public ResponseEntity<HttpStatus> deleteChildById(@PathVariable int id){
        childRepo.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

}
