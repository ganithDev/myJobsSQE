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
public class RefereeRelationshipTest {
    
    public RefereeRelationshipTest() {
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
     * Test of getIdrefereeRelationship method, of class RefereeRelationship.
     */
    @Test
    public void testGetIdrefereeRelationship() {
        System.out.println("getIdrefereeRelationship");
        RefereeRelationship instance = new RefereeRelationship();
        Integer expResult = null;
        Integer result = instance.getIdrefereeRelationship();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdrefereeRelationship method, of class RefereeRelationship.
     */
    @Test
    public void testSetIdrefereeRelationship() {
        System.out.println("setIdrefereeRelationship");
        Integer idrefereeRelationship = null;
        RefereeRelationship instance = new RefereeRelationship();
        instance.setIdrefereeRelationship(idrefereeRelationship);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelationship method, of class RefereeRelationship.
     */
    @Test
    public void testGetRelationship() {
        System.out.println("getRelationship");
        RefereeRelationship instance = new RefereeRelationship();
        String expResult = "";
        String result = instance.getRelationship();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelationship method, of class RefereeRelationship.
     */
    @Test
    public void testSetRelationship() {
        System.out.println("setRelationship");
        String relationship = "";
        RefereeRelationship instance = new RefereeRelationship();
        instance.setRelationship(relationship);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReferees method, of class RefereeRelationship.
     */
    @Test
    public void testGetReferees() {
        System.out.println("getReferees");
        RefereeRelationship instance = new RefereeRelationship();
        Set<Referee> expResult = null;
        Set<Referee> result = instance.getReferees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReferees method, of class RefereeRelationship.
     */
    @Test
    public void testSetReferees() {
        System.out.println("setReferees");
        Set<Referee> referees = null;
        RefereeRelationship instance = new RefereeRelationship();
        instance.setReferees(referees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
