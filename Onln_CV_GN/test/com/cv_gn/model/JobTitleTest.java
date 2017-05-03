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
public class JobTitleTest {
    
    public JobTitleTest() {
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
     * Test of getIdJobTitle method, of class JobTitle.
     */
    @Test
    public void testGetIdJobTitle() {
        System.out.println("getIdJobTitle");
        JobTitle instance = new JobTitle();
        Short expResult = null;
        Short result = instance.getIdJobTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdJobTitle method, of class JobTitle.
     */
    @Test
    public void testSetIdJobTitle() {
        System.out.println("setIdJobTitle");
        Short idJobTitle = null;
        JobTitle instance = new JobTitle();
        instance.setIdJobTitle(idJobTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSector method, of class JobTitle.
     */
    @Test
    public void testGetSector() {
        System.out.println("getSector");
        JobTitle instance = new JobTitle();
        Sector expResult = null;
        Sector result = instance.getSector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSector method, of class JobTitle.
     */
    @Test
    public void testSetSector() {
        System.out.println("setSector");
        Sector sector = null;
        JobTitle instance = new JobTitle();
        instance.setSector(sector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobTitle method, of class JobTitle.
     */
    @Test
    public void testGetJobTitle() {
        System.out.println("getJobTitle");
        JobTitle instance = new JobTitle();
        String expResult = "";
        String result = instance.getJobTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobTitle method, of class JobTitle.
     */
    @Test
    public void testSetJobTitle() {
        System.out.println("setJobTitle");
        String jobTitle = "";
        JobTitle instance = new JobTitle();
        instance.setJobTitle(jobTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperiences method, of class JobTitle.
     */
    @Test
    public void testGetExperiences() {
        System.out.println("getExperiences");
        JobTitle instance = new JobTitle();
        Set<Experience> expResult = null;
        Set<Experience> result = instance.getExperiences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperiences method, of class JobTitle.
     */
    @Test
    public void testSetExperiences() {
        System.out.println("setExperiences");
        Set<Experience> experiences = null;
        JobTitle instance = new JobTitle();
        instance.setExperiences(experiences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobPreferences method, of class JobTitle.
     */
    @Test
    public void testGetJobPreferences() {
        System.out.println("getJobPreferences");
        JobTitle instance = new JobTitle();
        Set<JobPreference> expResult = null;
        Set<JobPreference> result = instance.getJobPreferences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobPreferences method, of class JobTitle.
     */
    @Test
    public void testSetJobPreferences() {
        System.out.println("setJobPreferences");
        Set<JobPreference> jobPreferences = null;
        JobTitle instance = new JobTitle();
        instance.setJobPreferences(jobPreferences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
