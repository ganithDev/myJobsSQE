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
public class PersonDAOImplIT {
    
    public PersonDAOImplIT() {
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
        Person person = null;
        PersonStatus personStatus = null;
        PersonTitle personTitle = null;
        PersonContactMode pcm = null;
        PersonDAOImpl instance = new PersonDAOImpl();
        String expResult = "";
        String result = instance.addPerson(user, person, personStatus, personTitle, pcm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
