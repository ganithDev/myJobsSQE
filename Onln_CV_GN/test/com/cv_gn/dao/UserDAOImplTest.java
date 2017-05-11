/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

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
public class UserDAOImplTest {
    
    public UserDAOImplTest() {
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
     * Test of checkUsernameAvailable method, of class UserDAOImpl.
     */
    @Test
    public void testCheckUsernameAvailable() {
        System.out.println("checkUsernameAvailable");
        String username = "";
        UserDAOImpl instance = new UserDAOImpl();
        boolean expResult = false;
        boolean result = instance.checkUsernameAvailable(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserAvailable method, of class UserDAOImpl.
     */
    @Test
    public void testIsUserAvailable() {
        System.out.println("isUserAvailable");
        String username = "";
        UserDAOImpl instance = new UserDAOImpl();
        User expResult = null;
        User result = instance.isUserAvailable(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUserPassswordCorrect method, of class UserDAOImpl.
     */
    @Test
    public void testIsUserPassswordCorrect() {
        System.out.println("isUserPassswordCorrect");
        String password = "";
        User usr = null;
        UserDAOImpl instance = new UserDAOImpl();
        String expResult = "";
        String result = instance.isUserPassswordCorrect(password, usr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UserDAOImpl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UserDAOImpl.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
