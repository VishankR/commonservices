package com.mds.commonservices.repositories;

import com.mds.commonservices.entities.Patient;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Repository
/*@NamedQueries(value = {
        @NamedQuery(name = "GET_PATIENT_BY_FIRST_NAME", query = "select * from Patient where first_name=:firstName and last_name=:lastName")
})*/
public class CustomPatientRepoImpl implements CustomPatientRepo{
/*    @Autowired
    private SessionFactory sessionFactory;*/
@PersistenceContext
private EntityManager entityManager;
    @Override
    public List<Patient> findPatientByFirstNameAndLastName(String firstName, String lastName) {
        //Session session  = sessionFactory.getCurrentSession();
        //Query query = session.createQuery("from Patient where first_name=:firstName and last_name=:lastName");
        Query query = entityManager.createQuery("select p from Patient as p where p.first_name=:firstName and p.last_name=:lastName");
        query.setParameter("firstName", firstName);
        query.setParameter("lastName", lastName);
        List<Object> generalizedPatientList = query.getResultList();
        return (List<Patient>) generalizedPatientList.stream()
                .filter(temp -> temp instanceof Patient)
                .map(temp -> (Patient)temp).collect(Collectors.toList());
    }
}
