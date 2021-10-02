package com.mds.commonservices.app;

import com.mds.commonservices.entities.Patient;
import com.mds.commonservices.entities.Prescription;
import com.mds.commonservices.entities.PrescriptionFill;
import com.mds.commonservices.mockData.Data;
import com.mds.commonservices.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class Application {
	public static void main(String[] args) {
/*		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();*/

		//session.save(Data.getDummyPatient());

/*		Patient p = session.get(Patient.class, 6);
		session.delete(p);*/

/*		Patient p = session.get(Patient.class, 5);
		List<Prescription> presList = Data.getDummyPrescriptionList(p, Data.getDummyPrescriptionFillList());
		presList.forEach(session::save);*/

/*		Prescription pres = session.get(Prescription.class, 8);
		List<PrescriptionFill> presFillList = Data.getDummyPrescriptionFillListWithPrescription(pres);
		presFillList.forEach(session::save);*/
/*		Patient p = session.get(Patient.class, 7);
		System.out.println(p.toString());*/
/*		tx.commit();
		session.close();*/
	}
}