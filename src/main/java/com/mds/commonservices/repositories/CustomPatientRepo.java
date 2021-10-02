package com.mds.commonservices.repositories;

import java.util.List;

public interface CustomPatientRepo {
    public List findPatientByFirstNameAndLastName(String firstName, String lastName);
}
