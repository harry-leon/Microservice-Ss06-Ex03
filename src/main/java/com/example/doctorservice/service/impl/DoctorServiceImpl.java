package com.example.doctorservice.service.impl;

import com.example.doctorservice.dto.DoctorDTO;
import com.example.doctorservice.entity.Doctor;
import com.example.doctorservice.repository.DoctorRepository;
import com.example.doctorservice.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public List<DoctorDTO> getAllDoctors() {
        return doctorRepository.findAll().stream()
                .map(doctor -> new DoctorDTO(doctor.getId(), doctor.getName(), doctor.getSpecialization()))
                .collect(Collectors.toList());
    }

    @Override
    public Doctor createDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
