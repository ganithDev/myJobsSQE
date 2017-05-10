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
public class SectorIT {
    
    public SectorIT() {
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
     * Test of getIdSector method, of class Sector.
     */
    @Test
    public void testGetIdSector() {
        System.out.println("getIdSector");
        Sector instance = new Sector();
        Short expResult = null;
        Short result = instance.getIdSector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSector method, of class Sector.
     */
    @Test
    public void testSetIdSector() {
        System.out.println("setIdSector");
        Short idSector = null;
        Sector instance = new Sector();
        instance.setIdSector(idSector);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSectorTitle method, of class Sector.
     */
    @Test
    public void testGetSectorTitle() {
        System.out.println("getSectorTitle");
        Sector instance = new Sector();
        String expResult = "";
        String result = instance.getSectorTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSectorTitle method, of class Sector.
     */
    @Test
    public void testSetSectorTitle() {
        System.out.println("setSectorTitle");
        String sectorTitle = "";
        Sector instance = new Sector();
        instance.setSectorTitle(sectorTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobTitles method, of class Sector.
     */
    @Test
    public void testGetJobTitles() {
        System.out.println("getJobTitles");
        Sector instance = new Sector();
        Set<JobTitle> expResult = null;
        Set<JobTitle> result = instance.getJobTitles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobTitles method, of class Sector.
     */
    @Test
    public void testSetJobTitles() {
        System.out.println("setJobTitles");
        Set<JobTitle> jobTitles = null;
        Sector instance = new Sector();
        instance.setJobTitles(jobTitles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessionalQualifications method, of class Sector.
     */
    @Test
    public void testGetProfessionalQualifications() {
        System.out.println("getProfessionalQualifications");
        Sector instance = new Sector();
        Set<ProfessionalQualification> expResult = null;
        Set<ProfessionalQualification> result = instance.getProfessionalQualifications();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessionalQualifications method, of class Sector.
     */
    @Test
    public void testSetProfessionalQualifications() {
        System.out.println("setProfessionalQualifications");
        Set<ProfessionalQualification> professionalQualifications = null;
        Sector instance = new Sector();
        instance.setProfessionalQualifications(professionalQualifications);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
