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
public class SkillPersonTest {
    
    public SkillPersonTest() {
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
     * Test of getIdSkillPerson method, of class SkillPerson.
     */
    @Test
    public void testGetIdSkillPerson() {
        System.out.println("getIdSkillPerson");
        SkillPerson instance = new SkillPerson();
        int expResult = 0;
        int result = instance.getIdSkillPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSkillPerson method, of class SkillPerson.
     */
    @Test
    public void testSetIdSkillPerson() {
        System.out.println("setIdSkillPerson");
        int idSkillPerson = 0;
        SkillPerson instance = new SkillPerson();
        instance.setIdSkillPerson(idSkillPerson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class SkillPerson.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        SkillPerson instance = new SkillPerson();
        Person expResult = null;
        Person result = instance.getPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerson method, of class SkillPerson.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Person person = null;
        SkillPerson instance = new SkillPerson();
        instance.setPerson(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkill method, of class SkillPerson.
     */
    @Test
    public void testGetSkill() {
        System.out.println("getSkill");
        SkillPerson instance = new SkillPerson();
        Skill expResult = null;
        Skill result = instance.getSkill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkill method, of class SkillPerson.
     */
    @Test
    public void testSetSkill() {
        System.out.println("setSkill");
        Skill skill = null;
        SkillPerson instance = new SkillPerson();
        instance.setSkill(skill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillLevel method, of class SkillPerson.
     */
    @Test
    public void testGetSkillLevel() {
        System.out.println("getSkillLevel");
        SkillPerson instance = new SkillPerson();
        SkillLevel expResult = null;
        SkillLevel result = instance.getSkillLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillLevel method, of class SkillPerson.
     */
    @Test
    public void testSetSkillLevel() {
        System.out.println("setSkillLevel");
        SkillLevel skillLevel = null;
        SkillPerson instance = new SkillPerson();
        instance.setSkillLevel(skillLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerified method, of class SkillPerson.
     */
    @Test
    public void testGetVerified() {
        System.out.println("getVerified");
        SkillPerson instance = new SkillPerson();
        Boolean expResult = null;
        Boolean result = instance.getVerified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerified method, of class SkillPerson.
     */
    @Test
    public void testSetVerified() {
        System.out.println("setVerified");
        Boolean verified = null;
        SkillPerson instance = new SkillPerson();
        instance.setVerified(verified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHowVerified method, of class SkillPerson.
     */
    @Test
    public void testGetHowVerified() {
        System.out.println("getHowVerified");
        SkillPerson instance = new SkillPerson();
        String expResult = "";
        String result = instance.getHowVerified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHowVerified method, of class SkillPerson.
     */
    @Test
    public void testSetHowVerified() {
        System.out.println("setHowVerified");
        String howVerified = "";
        SkillPerson instance = new SkillPerson();
        instance.setHowVerified(howVerified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
