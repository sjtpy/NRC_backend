package com.example.samprojectdb.entity;
import com.example.samprojectdb.entity.Admission;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Child {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int samId;
    @Column(nullable = false,unique = true)
    private int uhid;
    @Column(nullable = false,unique = true)
    private int rchId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private Date dob;
    @Column(nullable = false)
    private char gender;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String contactNumber;
    @Column(nullable = false)
    private String relationshipDetails;
    @Column(nullable = false)
    private String caste;
    @Column(nullable = false)
    private String religion;
    @Column(nullable = false)
    private String bpl;
    @Column(nullable = false)
    private double height;
    @Column(nullable = false)
    private double weight;
    private double muac;
    @Column(nullable = false)
    private String growthStatus;
    private String otherSymptoms;
    @OneToMany(mappedBy = "child")
    private List<Admission> admissionList;
    public Child()
    {

    }


    public int getSamId() {
        return samId;
    }

    public void setSamId(int samId) {
        this.samId = samId;
    }

    public int getUhid() {
        return uhid;
    }

    public void setUhid(int uhid) {
        this.uhid = uhid;
    }

    public int getRchId() {
        return rchId;
    }

    public void setRchId(int rchId) {
        this.rchId = rchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRelationshipDetails() {
        return relationshipDetails;
    }

    public void setRelationshipDetails(String relationshipDetails) {
        this.relationshipDetails = relationshipDetails;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBpl() {
        return bpl;
    }

    public void setBpl(String bpl) { this.bpl = bpl; }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMuac() {
        return muac;
    }

    public void setMuac(double muac) {
        this.muac = muac;
    }

    public String getGrowthStatus() {
        return growthStatus;
    }

    public void setGrowthStatus(String growthStatus) {
        this.growthStatus = growthStatus;
    }

    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
    }

    @Override
    public String toString() {
        return "Child{" +
                "samId=" + samId +
                ", uhid=" + uhid +
                ", rchId=" + rchId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", relationshipDetails='" + relationshipDetails + '\'' +
                ", caste='" + caste + '\'' +
                ", religion='" + religion + '\'' +
                ", bpl=" + bpl +
                ", height=" + height +
                ", weight=" + weight +
                ", muac=" + muac +
                ", growthStatus='" + growthStatus + '\'' +
                ", otherSymptoms='" + otherSymptoms + '\'' +
                ", admissionList=" + admissionList +
                '}';
    }
}
