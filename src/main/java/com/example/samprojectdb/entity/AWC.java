package com.example.samprojectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AWC {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int awcId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String pincode;
    @Column(nullable = false)
    private double latitude;
    @Column(nullable = false)
    private double longitude;
    @OneToMany(mappedBy = "awc")
    @JsonIgnore
    private List<AWW> awws=new ArrayList<>();
    public AWC()
    {

    }

    public AWC(int awcId, String name, String address, String pincode, double latitude, double longitude) {
        super();
        this.awcId = awcId;
        this.name = name;
        this.address = address;
        this.pincode = pincode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getAwcId() {
        return awcId;
    }

    public void setAwcId(int awcId) {
        this.awcId = awcId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<AWW> getAwws() {
        return awws;
    }

    public void setAwws(List<AWW> awws) {
        this.awws = awws;
    }
}
