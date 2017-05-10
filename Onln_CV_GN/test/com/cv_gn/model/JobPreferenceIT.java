/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.model;

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
public class JobPreferenceIT {
    
    public JobPreferenceIT() {
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
     * Test of getIdJobPreference method, of class JobPreference.
     */
    @Test
    public void testGetIdJobPreference() {
        System.out.println("getIdJobPreference");
        JobPreference instance = new JobPreference();
        Integer expResult = null;
        Integer result = instance.getIdJobPreference();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdJobPreference method, of class JobPreference.
     */
    @Test
    public void testSetIdJobPreference() {
        System.out.println("setIdJobPreference");
        Integer idJobPreference = null;
        JobPreference instance = new JobPreference();
        instance.setIdJobPreference(idJobPreference);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobTitle method, of class JobPreference.
     */
    @Test
    public void testGetJobTitle() {
        System.out.println("getJobTitle");
        JobPreference instance = new JobPreference();
        JobTitle expResult = null;
        JobTitle result = instance.getJobTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobTitle method, of class JobPreference.
     */
    @Test
    public void testSetJobTitle() {
        System.out.println("setJobTitle");
        JobTitle jobTitle = null;
        JobPreference instance = new JobPreference();
        instance.setJobTitle(jobTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class JobPreference.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        JobPreference instance = new JobPreference();
        Person expResult = null;
        Person result = instance.getPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerson method, of class JobPreference.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Person person = null;
        JobPreference instance = new JobPreference();
        instance.setPerson(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
