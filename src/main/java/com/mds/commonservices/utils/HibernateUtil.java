package com.mds.commonservices.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mds.commonservices.entities.Patient;

public class HibernateUtil {
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			//Configuration config = new Configuration();
			//Because now we have mapped the class in hibernate.cfg.xml
			//config.addAnnotatedClass(Patient.class);
			//we are using no-arg onstructor because we have used hibernate.properties in the same path in which no-arg constructor searches
			//return config.buildSessionFactory(new StandardServiceRegistryBuilder().build());
			//we are picking all the properties from hibernate.cfg.xml
			//return config.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build());
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new RuntimeException("Hibernate Exception while creating sessionfactory");
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while creating sessionfactory");
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
