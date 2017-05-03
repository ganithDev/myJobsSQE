/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.model;

import java.util.Date;
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
public class EducationalQualificationTest {
    
    public EducationalQualificationTest() {
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
     * Test of getIdEducationalQualification method, of class EducationalQualification.
     */
    @Test
    public void testGetIdEducationalQualification() {
        System.out.println("getIdEducationalQualification");
        EducationalQualification instance = new EducationalQualification();
        Integer expResult = null;
        Integer result = instance.getIdEducationalQualification();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdEducationalQualification method, of class EducationalQualification.
     */
    @Test
    public void testSetIdEducationalQualification() {
        System.out.println("setIdEducationalQualification");
        Integer idEducationalQualification = null;
        EducationalQualification instance = new EducationalQualification();
        instance.setIdEducationalQualification(idEducationalQualification);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEducationLevel method, of class EducationalQualification.
     */
    @Test
    public void testGetEducationLevel() {
        System.out.println("getEducationLevel");
        EducationalQualification instance = new EducationalQualification();
        EducationLevel expResult = null;
        EducationLevel result = instance.getEducationLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEducationLevel method, of class EducationalQualification.
     */
    @Test
    public void testSetEducationLevel() {
        System.out.println("setEducationLevel");
        EducationLevel educationLevel = null;
        EducationalQualification instance = new EducationalQualification();
        instance.setEducationLevel(educationLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class EducationalQualification.
     */
    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        EducationalQualification instance = new EducationalQualification();
        Person expResult = null;
        Person result = instance.getPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPerson method, of class EducationalQualification.
     */
    @Test
    public void testSetPerson() {
        System.out.println("setPerson");
        Person person = null;
        EducationalQualification instance = new EducationalQualification();
        instance.setPerson(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQualificationType method, of class EducationalQualification.
     */
    @Test
    public void testGetQualificationType() {
        System.out.println("getQualificationType");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getQualificationType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQualificationType method, of class EducationalQualification.
     */
    @Test
    public void testSetQualificationType() {
        System.out.println("setQualificationType");
        String qualificationType = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setQualificationType(qualificationType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourseName method, of class EducationalQualification.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourseName method, of class EducationalQualification.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setCourseName(courseName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOtherEducationLevel method, of class EducationalQualification.
     */
    @Test
    public void testGetOtherEducationLevel() {
        System.out.println("getOtherEducationLevel");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getOtherEducationLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOtherEducationLevel method, of class EducationalQualification.
     */
    @Test
    public void testSetOtherEducationLevel() {
        System.out.println("setOtherEducationLevel");
        String otherEducationLevel = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setOtherEducationLevel(otherEducationLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVocational method, of class EducationalQualification.
     */
    @Test
    public void testGetVocational() {
        System.out.println("getVocational");
        EducationalQualification instance = new EducationalQualification();
        Boolean expResult = null;
        Boolean result = instance.getVocational();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVocational method, of class EducationalQualification.
     */
    @Test
    public void testSetVocational() {
        System.out.println("setVocational");
        Boolean vocational = null;
        EducationalQualification instance = new EducationalQualification();
        instance.setVocational(vocational);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMainSubject method, of class EducationalQualification.
     */
    @Test
    public void testGetMainSubject() {
        System.out.println("getMainSubject");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getMainSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMainSubject method, of class EducationalQualification.
     */
    @Test
    public void testSetMainSubject() {
        System.out.println("setMainSubject");
        String mainSubject = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setMainSubject(mainSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNameOfInstitution method, of class EducationalQualification.
     */
    @Test
    public void testGetNameOfInstitution() {
        System.out.println("getNameOfInstitution");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getNameOfInstitution();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameOfInstitution method, of class EducationalQualification.
     */
    @Test
    public void testSetNameOfInstitution() {
        System.out.println("setNameOfInstitution");
        String nameOfInstitution = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setNameOfInstitution(nameOfInstitution);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class EducationalQualification.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class EducationalQualification.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYearObtained method, of class EducationalQualification.
     */
    @Test
    public void testGetYearObtained() {
        System.out.println("getYearObtained");
        EducationalQualification instance = new EducationalQualification();
        Date expResult = null;
        Date result = instance.getYearObtained();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYearObtained method, of class EducationalQualification.
     */
    @Test
    public void testSetYearObtained() {
        System.out.println("setYearObtained");
        Date yearObtained = null;
        EducationalQualification instance = new EducationalQualification();
        instance.setYearObtained(yearObtained);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResult method, of class EducationalQualification.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getResult();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResult method, of class EducationalQualification.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        String result_2 = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setResult(result_2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getThesesTitle method, of class EducationalQualification.
     */
    @Test
    public void testGetThesesTitle() {
        System.out.println("getThesesTitle");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getThesesTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThesesTitle method, of class EducationalQualification.
     */
    @Test
    public void testSetThesesTitle() {
        System.out.println("setThesesTitle");
        String thesesTitle = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setThesesTitle(thesesTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVerified method, of class EducationalQualification.
     */
    @Test
    public void testGetVerified() {
        System.out.println("getVerified");
        EducationalQualification instance = new EducationalQualification();
        Boolean expResult = null;
        Boolean result = instance.getVerified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVerified method, of class EducationalQualification.
     */
    @Test
    public void testSetVerified() {
        System.out.println("setVerified");
        Boolean verified = null;
        EducationalQualification instance = new EducationalQualification();
        instance.setVerified(verified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHowVerified method, of class EducationalQualification.
     */
    @Test
    public void testGetHowVerified() {
        System.out.println("getHowVerified");
        EducationalQualification instance = new EducationalQualification();
        String expResult = "";
        String result = instance.getHowVerified();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHowVerified method, of class EducationalQualification.
     */
    @Test
    public void testSetHowVerified() {
        System.out.println("setHowVerified");
        String howVerified = "";
        EducationalQualification instance = new EducationalQualification();
        instance.setHowVerified(howVerified);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
