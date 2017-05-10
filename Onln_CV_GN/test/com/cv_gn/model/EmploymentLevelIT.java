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
public class EmploymentLevelIT {
    
    public EmploymentLevelIT() {
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
     * Test of getIdLevelOfEmployment method, of class EmploymentLevel.
     */
    @Test
    public void testGetIdLevelOfEmployment() {
        System.out.println("getIdLevelOfEmployment");
        EmploymentLevel instance = new EmploymentLevel();
        Short expResult = null;
        Short result = instance.getIdLevelOfEmployment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdLevelOfEmployment method, of class EmploymentLevel.
     */
    @Test
    public void testSetIdLevelOfEmployment() {
        System.out.println("setIdLevelOfEmployment");
        Short idLevelOfEmployment = null;
        EmploymentLevel instance = new EmploymentLevel();
        instance.setIdLevelOfEmployment(idLevelOfEmployment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmploymentLevel method, of class EmploymentLevel.
     */
    @Test
    public void testGetEmploymentLevel() {
        System.out.println("getEmploymentLevel");
        EmploymentLevel instance = new EmploymentLevel();
        String expResult = "";
        String result = instance.getEmploymentLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmploymentLevel method, of class EmploymentLevel.
     */
    @Test
    public void testSetEmploymentLevel() {
        System.out.println("setEmploymentLevel");
        String employmentLevel = "";
        EmploymentLevel instance = new EmploymentLevel();
        instance.setEmploymentLevel(employmentLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperiences method, of class EmploymentLevel.
     */
    @Test
    public void testGetExperiences() {
        System.out.println("getExperiences");
        EmploymentLevel instance = new EmploymentLevel();
        Set<Experience> expResult = null;
        Set<Experience> result = instance.getExperiences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperiences method, of class EmploymentLevel.
     */
    @Test
    public void testSetExperiences() {
        System.out.println("setExperiences");
        Set<Experience> experiences = null;
        EmploymentLevel instance = new EmploymentLevel();
        instance.setExperiences(experiences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class EmploymentLevel.
     */
    @Test
    public void testGetPersons() {
        System.out.println("getPersons");
        EmploymentLevel instance = new EmploymentLevel();
        Set<Person> expResult = null;
        Set<Person> result = instance.getPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersons method, of class EmploymentLevel.
     */
    @Test
    public void testSetPersons() {
        System.out.println("setPersons");
        Set<Person> persons = null;
        EmploymentLevel instance = new EmploymentLevel();
        instance.setPersons(persons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
