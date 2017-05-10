/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.model;

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ganith Perera
 */
public class PersonStatusIT {
    
    public PersonStatusIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdpersonStatus method, of class PersonStatus.
     */
    @Test
    public void testGetIdpersonStatus() {
        System.out.println("getIdpersonStatus");
        PersonStatus instance = new PersonStatus();
        Integer expResult = null;
        Integer result = instance.getIdpersonStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdpersonStatus method, of class PersonStatus.
     */
    @Test
    public void testSetIdpersonStatus() {
        System.out.println("setIdpersonStatus");
        Integer idpersonStatus = null;
        PersonStatus instance = new PersonStatus();
        instance.setIdpersonStatus(idpersonStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonStatus method, of class PersonStatus.
     */
    @Test
    public void testGetPersonStatus() {
        System.out.println("getPersonStatus");
        PersonStatus instance = new PersonStatus();
        String expResult = "";
        String result = instance.getPersonStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonStatus method, of class PersonStatus.
     */
    @Test
    public void testSetPersonStatus() {
        System.out.println("setPersonStatus");
        String personStatus = "";
        PersonStatus instance = new PersonStatus();
        instance.setPersonStatus(personStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class PersonStatus.
     */
    @Test
    public void testGetPersons() {
        System.out.println("getPersons");
        PersonStatus instance = new PersonStatus();
        Set<Person> expResult = null;
        Set<Person> result = instance.getPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersons method, of class PersonStatus.
     */
    @Test
    public void testSetPersons() {
        System.out.println("setPersons");
        Set<Person> persons = null;
        PersonStatus instance = new PersonStatus();
        instance.setPersons(persons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
