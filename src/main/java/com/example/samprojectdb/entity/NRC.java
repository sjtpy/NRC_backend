package com.example.samprojectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NRC {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nrcId;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String pincode;

    @OneToMany(mappedBy = "nrc")
    private List<Admission> admissions;
    //GPS location
//    @OneToMany(mappedBy = "nrc")
//    @JsonIgnore
//    private List<Child> children=new ArrayList<>();
//    @OneToMany(mappedBy = "nrc")
//    private List<DischargeSummary> dischargeSummaries=new ArrayList<>();
    @OneToOne(mappedBy = "nrc")  @JoinColumn(nullable=false)
    @JsonIgnore
    private CareSpecialist cs;

    public int getNrcId() {
        return nrcId;
    }

    public void setNrcId(int nrcId) {
        this.nrcId = nrcId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public CareSpecialist getCs() {
        return cs;
    }

    public void setCs(CareSpecialist cs) {
        this.cs = cs;
    }
}
