package com.mds.commonservices.repositories;

import java.util.List;

import com.mds.commonservices.entities.Patient;

public interface CustomPatientRepo {
    public List<Patient> findPatientByFirstNameAndLastName(String firstName, String lastName);
}
