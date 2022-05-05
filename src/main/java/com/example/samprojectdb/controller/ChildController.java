package com.example.samprojectdb.controller;

import com.example.samprojectdb.AuthRequest;
import com.example.samprojectdb.JwtService;
import com.example.samprojectdb.entity.Child;
import com.example.samprojectdb.entity.DischargeSummary;
import com.example.samprojectdb.entity.FollowUp;
import com.example.samprojectdb.entity.User;
import com.example.samprojectdb.repository.ChildRepo;
import com.example.samprojectdb.repository.FollowUpRepo;
import com.example.samprojectdb.repository.DischargeSummaryRepo;
import com.example.samprojectdb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

//@RequestMapping("/child")
//@RequestMapping("/api/v1")
@CrossOrigin(origins="*")
public class ChildController {

    @Autowired
    private ChildRepo childRepo;

    @Autowired
    private FollowUpRepo followUpRepo;

    @Autowired
    private DischargeSummaryRepo dischargeSummaryRepo;

    @Autowired
    private User user;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtService jwtService;

    @GetMapping("/children")
    @ResponseBody
    public List<Child> getAllChildren(){
        return childRepo.findAll();
    }

    @PostMapping("/children")
    public Child saveChildDetails(@RequestBody Child child) {
        return childRepo.save(child);
    }

    @PostMapping("/createfollowup")
    public FollowUp saveFollowUp(@RequestBody FollowUp followUp) {
        return followUpRepo.save(followUp);
    }

    @GetMapping("/children/{id}")
    public Child getSingleChild(@PathVariable int id){
        return childRepo.findById(id).get();
    }


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

    @PostMapping("/discharge")
    public DischargeSummary dischargeChild(@RequestBody DischargeSummary dischargeSummary){
         return dischargeSummaryRepo.save(dischargeSummary);
    }

    @GetMapping("/dischargedList")
    @ResponseBody
    public List<DischargeSummary> getAllDischarged(){
        return dischargeSummaryRepo.findAll();
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseEntity<?> login(@RequestBody AuthRequest authRequest){
        System.out.println("Inside");
        User user=userRepo.getUserByUsername(authRequest.getUsername());
        if(user!=null && user.getPassword().equals(authRequest.getPassword())){
            System.out.println("valid creds");
            String token= jwtService.createToken(String.valueOf(user.getUserId()));
            return ResponseEntity.ok(token);
        }
        System.out.println("Inside");
        //System.out.println(user.getUsername());
        //System.out.println(user.getPassword());
        ResponseEntity<String> response=new ResponseEntity<String>("Unauthorized",HttpStatus.UNAUTHORIZED);
        return response;
    }
}