package com.example.doctorservice.config;

import com.example.doctorservice.entity.Doctor;
import com.example.doctorservice.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final DoctorRepository doctorRepository;

    @Autowired
    public DataInitializer(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void run(String... args) {
        if (doctorRepository.count() == 0) {
            doctorRepository.saveAll(List.of(
                    new Doctor("Nguyễn Văn A", "Nội khoa", 10, "nguyenvana@hospital.com", true),
                    new Doctor("Trần Thị B", "Ngoại khoa", 8, "tranthib@hospital.com", true),
                    new Doctor("Lê Văn C", "Nhi khoa", 5, "levanc@hospital.com", false)
            ));
        }
    }
}
