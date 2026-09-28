package com.example.doctorservice.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    private Integer experienceYears;

    private String email;

    private Boolean status;

    public Doctor() {
    }

    public Doctor(Long id, String name, String specialization, Integer experienceYears, String email, Boolean status) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.email = email;
        this.status = status;
    }

    public Doctor(String name, String specialization, Integer experienceYears, String email, Boolean status) {
        this.name = name;
        this.specialization = specialization;
        this.experienceYears = experienceYears;
        this.email = email;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Integer getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(Integer experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
