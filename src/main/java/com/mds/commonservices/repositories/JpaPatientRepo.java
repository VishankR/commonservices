package com.mds.commonservices.repositories;


import com.mds.commonservices.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPatientRepo extends JpaRepository<Patient, Integer> {

}
