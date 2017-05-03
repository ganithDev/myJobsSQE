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
public class SkillTest {
    
    public SkillTest() {
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
     * Test of getIdSkill method, of class Skill.
     */
    @Test
    public void testGetIdSkill() {
        System.out.println("getIdSkill");
        Skill instance = new Skill();
        Integer expResult = null;
        Integer result = instance.getIdSkill();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSkill method, of class Skill.
     */
    @Test
    public void testSetIdSkill() {
        System.out.println("setIdSkill");
        Integer idSkill = null;
        Skill instance = new Skill();
        instance.setIdSkill(idSkill);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillName method, of class Skill.
     */
    @Test
    public void testGetSkillName() {
        System.out.println("getSkillName");
        Skill instance = new Skill();
        String expResult = "";
        String result = instance.getSkillName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillName method, of class Skill.
     */
    @Test
    public void testSetSkillName() {
        System.out.println("setSkillName");
        String skillName = "";
        Skill instance = new Skill();
        instance.setSkillName(skillName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillPersons method, of class Skill.
     */
    @Test
    public void testGetSkillPersons() {
        System.out.println("getSkillPersons");
        Skill instance = new Skill();
        Set<SkillPerson> expResult = null;
        Set<SkillPerson> result = instance.getSkillPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillPersons method, of class Skill.
     */
    @Test
    public void testSetSkillPersons() {
        System.out.println("setSkillPersons");
        Set<SkillPerson> skillPersons = null;
        Skill instance = new Skill();
        instance.setSkillPersons(skillPersons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
