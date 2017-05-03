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
public class PersonContactModeTest {
    
    public PersonContactModeTest() {
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
     * Test of getIdcontactPreference method, of class PersonContactMode.
     */
    @Test
    public void testGetIdcontactPreference() {
        System.out.println("getIdcontactPreference");
        PersonContactMode instance = new PersonContactMode();
        Integer expResult = null;
        Integer result = instance.getIdcontactPreference();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdcontactPreference method, of class PersonContactMode.
     */
    @Test
    public void testSetIdcontactPreference() {
        System.out.println("setIdcontactPreference");
        Integer idcontactPreference = null;
        PersonContactMode instance = new PersonContactMode();
        instance.setIdcontactPreference(idcontactPreference);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContactMode method, of class PersonContactMode.
     */
    @Test
    public void testGetContactMode() {
        System.out.println("getContactMode");
        PersonContactMode instance = new PersonContactMode();
        String expResult = "";
        String result = instance.getContactMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContactMode method, of class PersonContactMode.
     */
    @Test
    public void testSetContactMode() {
        System.out.println("setContactMode");
        String contactMode = "";
        PersonContactMode instance = new PersonContactMode();
        instance.setContactMode(contactMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersons method, of class PersonContactMode.
     */
    @Test
    public void testGetPersons() {
        System.out.println("getPersons");
        PersonContactMode instance = new PersonContactMode();
        Set<Person> expResult = null;
        Set<Person> result = instance.getPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersons method, of class PersonContactMode.
     */
    @Test
    public void testSetPersons() {
        System.out.println("setPersons");
        Set<Person> persons = null;
        PersonContactMode instance = new PersonContactMode();
        instance.setPersons(persons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
