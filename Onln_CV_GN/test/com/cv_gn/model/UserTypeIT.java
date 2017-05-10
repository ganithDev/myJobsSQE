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
public class UserTypeIT {
    
    public UserTypeIT() {
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
     * Test of getIdUserType method, of class UserType.
     */
    @Test
    public void testGetIdUserType() {
        System.out.println("getIdUserType");
        UserType instance = new UserType();
        Short expResult = null;
        Short result = instance.getIdUserType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUserType method, of class UserType.
     */
    @Test
    public void testSetIdUserType() {
        System.out.println("setIdUserType");
        Short idUserType = null;
        UserType instance = new UserType();
        instance.setIdUserType(idUserType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserType method, of class UserType.
     */
    @Test
    public void testGetUserType() {
        System.out.println("getUserType");
        UserType instance = new UserType();
        String expResult = "";
        String result = instance.getUserType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserType method, of class UserType.
     */
    @Test
    public void testSetUserType() {
        System.out.println("setUserType");
        String userType = "";
        UserType instance = new UserType();
        instance.setUserType(userType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class UserType.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        UserType instance = new UserType();
        Set<User> expResult = null;
        Set<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class UserType.
     */
    @Test
    public void testSetUsers() {
        System.out.println("setUsers");
        Set<User> users = null;
        UserType instance = new UserType();
        instance.setUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
