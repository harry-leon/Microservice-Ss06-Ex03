package com.example.doctorservice.service;

import com.example.doctorservice.dto.DoctorDTO;
import com.example.doctorservice.entity.Doctor;

import java.util.List;

public interface DoctorService {
    List<DoctorDTO> getAllDoctors();
    Doctor createDoctor(Doctor doctor);
}
