package com.example;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEnginnerService {

   // public static List<SoftwareEngineer> getSoftwareEnginners;


    private final SoftwareRepository softwareRepository;

    public SoftwareEnginnerService(SoftwareRepository softwareRepository) {

        this.softwareRepository = softwareRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEnginners(){
        return softwareRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getAllSoftwareEnginnersById(Integer id) {
        return softwareRepository.findById(id).orElseThrow(() -> new IllegalStateException(id +"not found"));

    }
}
