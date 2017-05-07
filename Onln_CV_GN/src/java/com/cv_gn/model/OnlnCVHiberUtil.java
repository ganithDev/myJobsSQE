/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.model;

import org.hibernate.HibernateException;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Ganith Perera
 */
public class OnlnCVHiberUtil {

    //private static final SessionFactory sessionFactory;
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            //sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    //Replace the deprecated methods with new ones
     private static SessionFactory configureSessionFactory() throws HibernateException {
        Configuration configuration = new Configuration();
        configuration.configure();
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
            configuration.getProperties()).build();     
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
    }
    
    public static SessionFactory getSessionFactory() {
        
        return configureSessionFactory();
    }
}
