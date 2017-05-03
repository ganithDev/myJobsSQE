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
public class EducationLevelTest {
    
    public EducationLevelTest() {
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
     * Test of getIdEducationLevel method, of class EducationLevel.
     */
    @Test
    public void testGetIdEducationLevel() {
        System.out.println("getIdEducationLevel");
        EducationLevel instance = new EducationLevel();
        Short expResult = null;
        Short result = instance.getIdEducationLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEducationLevel method, of class EducationLevel.
     */
    @Test
    public void testSetIdEducationLevel() {
        System.out.println("setIdEducationLevel");
        Short idEducationLevel = null;
        EducationLevel instance = new EducationLevel();
        instance.setIdEducationLevel(idEducationLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEducationLevel method, of class EducationLevel.
     */
    @Test
    public void testGetEducationLevel() {
        System.out.println("getEducationLevel");
        EducationLevel instance = new EducationLevel();
        String expResult = "";
        String result = instance.getEducationLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEducationLevel method, of class EducationLevel.
     */
    @Test
    public void testSetEducationLevel() {
        System.out.println("setEducationLevel");
        String educationLevel = "";
        EducationLevel instance = new EducationLevel();
        instance.setEducationLevel(educationLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEducationalQualifications method, of class EducationLevel.
     */
    @Test
    public void testGetEducationalQualifications() {
        System.out.println("getEducationalQualifications");
        EducationLevel instance = new EducationLevel();
        Set<EducationalQualification> expResult = null;
        Set<EducationalQualification> result = instance.getEducationalQualifications();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEducationalQualifications method, of class EducationLevel.
     */
    @Test
    public void testSetEducationalQualifications() {
        System.out.println("setEducationalQualifications");
        Set<EducationalQualification> educationalQualifications = null;
        EducationLevel instance = new EducationLevel();
        instance.setEducationalQualifications(educationalQualifications);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
