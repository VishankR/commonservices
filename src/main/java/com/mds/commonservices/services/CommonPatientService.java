package com.mds.commonservices.services;

import com.mds.commonservices.entities.Patient;
import com.mds.commonservices.repositories.CustomPatientRepo;
import com.mds.commonservices.repositories.JpaPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonPatientService {
    @Autowired
    CustomPatientRepo customPatRepo;
    @Autowired
    JpaPatientRepo jpaPatientRepo;
    public List<Patient> getPatients(){
        return customPatRepo.findPatientByFirstNameAndLastName("Vishank", "Rajput");
    }
    public List<Patient> deletePatient(){
    	jpaPatientRepo.deleteById(7);
    	return getPatients();
    }
}
