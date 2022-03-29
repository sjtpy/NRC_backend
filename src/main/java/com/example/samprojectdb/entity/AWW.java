package com.example.samprojectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AWW {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int awwId;
    @Column(nullable = false)
    private String name;
    @ManyToOne @JoinColumn(nullable=false)
    private AWC awc;
//    @OneToMany(mappedBy = "aww")
//    @JsonIgnore
//    private List<Child> children=new ArrayList<>();
    @OneToOne
    private User user;
    @OneToMany(mappedBy = "aww")
    @JsonIgnore
    private List<DischargeSummary> dischargeSummaries=new ArrayList<>();

    public AWW()
    {

    }

//    public AWW(int awwId, String name, String username, String password) {
//        super();
//        this.awwId = awwId;
//        this.name = name;
//        this.username = username;
//        this.password = password;
//    }


    public int getAwwId() {
        return awwId;
    }

    public void setAwwId(int awwId) {
        this.awwId = awwId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AWC getAwc() {
        return awc;
    }

    public void setAwc(AWC awc) {
        this.awc = awc;
    }

    public List<DischargeSummary> getDischargeSummaries() {
        return dischargeSummaries;
    }

    public void setDischargeSummaries(List<DischargeSummary> dischargeSummaries) {
        this.dischargeSummaries = dischargeSummaries;
    }
}
