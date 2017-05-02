/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.Person;
import com.cv_gn.model.PersonContactMode;
import com.cv_gn.model.PersonStatus;
import com.cv_gn.model.PersonTitle;
import com.cv_gn.model.User;
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
public class PersonDAOImplTest {
    
    public PersonDAOImplTest() {
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
     * Test of addPerson method, of class PersonDAOImpl.
     */
    @Test
    public void testAddPerson() {
        System.out.println("addPerson");
        User user = null;
        Person p = null;
        PersonStatus personStatus = null;
        PersonTitle personTitle = null;
        PersonContactMode pcm = null;
        PersonDAOImpl instance = new PersonDAOImpl();
        String expResult = "";
        String result = instance.addPerson(user, p, personStatus, personTitle, pcm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonTitleLength method, of class PersonDAOImpl.
     */
    @Test
    public void testGetPersonTitleLength() {
        System.out.println("getPersonTitleLength");
        PersonDAOImpl instance = new PersonDAOImpl();
        String expResult = "";
        String result = instance.getPersonTitleLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonTitles method, of class PersonDAOImpl.
     */
    @Test
    public void testGetPersonTitles() {
        System.out.println("getPersonTitles");
        PersonDAOImpl instance = new PersonDAOImpl();
        String[] expResult = null;
        String[] result = instance.getPersonTitles();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PersonDAOImpl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PersonDAOImpl.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
