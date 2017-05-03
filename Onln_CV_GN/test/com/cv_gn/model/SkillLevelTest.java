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
public class SkillLevelTest {
    
    public SkillLevelTest() {
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
     * Test of getIdskillLevel method, of class SkillLevel.
     */
    @Test
    public void testGetIdskillLevel() {
        System.out.println("getIdskillLevel");
        SkillLevel instance = new SkillLevel();
        Integer expResult = null;
        Integer result = instance.getIdskillLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdskillLevel method, of class SkillLevel.
     */
    @Test
    public void testSetIdskillLevel() {
        System.out.println("setIdskillLevel");
        Integer idskillLevel = null;
        SkillLevel instance = new SkillLevel();
        instance.setIdskillLevel(idskillLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillLevel method, of class SkillLevel.
     */
    @Test
    public void testGetSkillLevel() {
        System.out.println("getSkillLevel");
        SkillLevel instance = new SkillLevel();
        String expResult = "";
        String result = instance.getSkillLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillLevel method, of class SkillLevel.
     */
    @Test
    public void testSetSkillLevel() {
        System.out.println("setSkillLevel");
        String skillLevel = "";
        SkillLevel instance = new SkillLevel();
        instance.setSkillLevel(skillLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillPersons method, of class SkillLevel.
     */
    @Test
    public void testGetSkillPersons() {
        System.out.println("getSkillPersons");
        SkillLevel instance = new SkillLevel();
        Set<SkillPerson> expResult = null;
        Set<SkillPerson> result = instance.getSkillPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillPersons method, of class SkillLevel.
     */
    @Test
    public void testSetSkillPersons() {
        System.out.println("setSkillPersons");
        Set<SkillPerson> skillPersons = null;
        SkillLevel instance = new SkillLevel();
        instance.setSkillPersons(skillPersons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
