//package com.example.samprojectdb.utils;
//import com.example.samprojectdb.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController @RequestMapping("/demo")
//public class Main {
//    //populating the tables
//    @Autowired
//    private static CareSpecialistRepo careSpecialistRepo;
//    @Autowired
//    private static AwcRepo awcRepo;
//    @Autowired
//    private static AwwRepo awwRepo;
//    @Autowired
//    private static ChildRepo childRepo;
//    @Autowired
//    private static DischargeSummaryRepo dischargeSummaryRepo;
//    @Autowired
//    private static FollowUpRepo followUpRepo;
//    @Autowired
//    private static NrcRepo nrcRepo;
//
//    @RequestMapping("/main")
//    public static void main(String[] args) {
//        System.out.println(childRepo.findAll().toString());
//    }
////    public static void main(String[] args) {
////        populateCS();
////        populateNRC();
////        populateAWC();
////        populateAWW();
////        populateChild();
////        populateDischargeSummary();
////        populateFollowUp();
////    }
//
//    private static void populateAWC() {
//    }
//
////    public static void populateCS()
////    {
////        CareSpecialist careSpecialist1=new CareSpecialist("Dr. Strange","cs1","password");
////        CareSpecialist careSpecialist2=new CareSpecialist("Dr. ABC","cs2","password");
////        CareSpecialist careSpecialist3=new CareSpecialist("Dr. XYZ","cs3","password");
////        careSpecialistRepo.save(careSpecialist1);
////        careSpecialistRepo.save(careSpecialist2);
////        careSpecialistRepo.save(careSpecialist3);
////    }
//
//    public static void populateNRC()
//    {
//
//    }
//}
