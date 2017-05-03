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
public class PersonTitleTest {
    
    public PersonTitleTest() {
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
     * Test of getIdpersonTitle method, of class PersonTitle.
     */
    @Test
    public void testGetIdpersonTitle() {
        System.out.println("getIdpersonTitle");
        PersonTitle instance = new PersonTitle();
        Integer expResult = null;
        Integer result = instance.getIdpersonTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdpersonTitle method, of class PersonTitle.
     */
    @Test
    public void testSetIdpersonTitle() {
        System.out.println("setIdpersonTitle");
        Integer idpersonTitle = null;
        PersonTitle instance = new PersonTitle();
        instance.setIdpersonTitle(idpersonTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class PersonTitle.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        PersonTitle instance = new PersonTitle();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class PersonTitle.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        PersonTitle instance = new PersonTitle();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class PersonTitle.
     */
    @Test
    public void testGetPersons() {
        System.out.println("getPersons");
        PersonTitle instance = new PersonTitle();
        Set<Person> expResult = null;
        Set<Person> result = instance.getPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersons method, of class PersonTitle.
     */
    @Test
    public void testSetPersons() {
        System.out.println("setPersons");
        Set<Person> persons = null;
        PersonTitle instance = new PersonTitle();
        instance.setPersons(persons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
