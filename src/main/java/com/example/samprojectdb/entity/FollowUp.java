package com.example.samprojectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class FollowUp {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int followUpId;
    @Column(nullable = false)
    private double height;
    @Column(nullable = false)
    private double weight;
    @Column(nullable = false)
    private double muac;
    @Column(nullable = false)
    private String growthStatus;
    private String symptoms;
    @Column(nullable = false)
    private LocalDate createdAt;
    @Column(nullable = false)
    private LocalDate followupDate;
    @Column(nullable = false)
    private char isAttempted;
    @Column(nullable = false)
    private LocalDate attemptedDate;
    @ManyToOne @JoinColumn(nullable=false)
    @JsonIgnore
    private DischargeSummary dischargeSummary;

    public int getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(int followUpId) {
        this.followUpId = followUpId;
    }

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

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getFollowupDate() {
        return followupDate;
    }

    public void setFollowupDate(LocalDate followupDate) {
        this.followupDate = followupDate;
    }

    public char isAttempted() {
        return isAttempted;
    }

    public void setAttempted(char attempted) {
        isAttempted = attempted;
    }

    public LocalDate getAttemptedDate() {
        return attemptedDate;
    }

    public void setAttemptedDate(LocalDate attemptedDate) {
        this.attemptedDate = attemptedDate;
    }

    public DischargeSummary getDischargeSummary() {
        return dischargeSummary;
    }

    public void setDischargeSummary(DischargeSummary dischargeSummary) {
        this.dischargeSummary = dischargeSummary;
    }
}
