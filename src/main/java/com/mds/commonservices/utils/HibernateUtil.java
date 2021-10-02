package com.mds.commonservices.utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.service.ServiceRegistry;

import java.util.HashMap;
import java.util.Map;

public class HibernateUtil {/*
	
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {*//*
		try {
			//Creation of SessionFactory
*//**//*			1. When using cfg.xml
			StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();*//**//*

*//**//*			//2. When specifying all properties in "application.properties"
			StandardServiceRegistry  registry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources = new MetadataSources(registry);
			Metadata metadata = sources.getMetadataBuilder().build();
			return metadata.getSessionFactoryBuilder().build();*//**//*
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new RuntimeException("Hibernate Exception while creating sessionfactory");
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception while creating sessionfactory");
		}*//*
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}*/
}
