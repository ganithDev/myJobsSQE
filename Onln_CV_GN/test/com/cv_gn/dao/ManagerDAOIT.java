/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
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
public class ManagerDAOIT {
    
    public ManagerDAOIT() {
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
     * Test of openDBSession method, of class ManagerDAO.
     */
    @Test
    public void testOpenDBSession() {
        System.out.println("openDBSession");
        Session expResult = null;
        Session result = ManagerDAO.openDBSession();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAll method, of class ManagerDAO.
     */
    @Test
    public void testSearchAll() {
        System.out.println("searchAll");
        Object object = null;
        List expResult = null;
        List result = ManagerDAO.searchAll(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchCriteria method, of class ManagerDAO.
     */
    @Test
    public void testSearchCriteria() {
        System.out.println("searchCriteria");
        Object object = null;
        Criteria expResult = null;
        Criteria result = ManagerDAO.searchCriteria(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encrypt method, of class ManagerDAO.
     */
    @Test
    public void testEncrypt() throws Exception {
        System.out.println("encrypt");
        String property = "";
        String expResult = "";
        String result = ManagerDAO.encrypt(property);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decrypt method, of class ManagerDAO.
     */
    @Test
    public void testDecrypt() throws Exception {
        System.out.println("decrypt");
        String property = "";
        String expResult = "";
        String result = ManagerDAO.decrypt(property);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
