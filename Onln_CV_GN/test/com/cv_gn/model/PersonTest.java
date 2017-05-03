/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.model;

import java.util.Date;
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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of getIdPerson method, of class Person.
     */
    @Test
    public void testGetIdPerson() {
        System.out.println("getIdPerson");
        Person instance = new Person();
        Integer expResult = null;
        Integer result = instance.getIdPerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPerson method, of class Person.
     */
    @Test
    public void testSetIdPerson() {
        System.out.println("setIdPerson");
        Integer idPerson = null;
        Person instance = new Person();
        instance.setIdPerson(idPerson);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmploymentLevel method, of class Person.
     */
    @Test
    public void testGetEmploymentLevel() {
        System.out.println("getEmploymentLevel");
        Person instance = new Person();
        EmploymentLevel expResult = null;
        EmploymentLevel result = instance.getEmploymentLevel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmploymentLevel method, of class Person.
     */
    @Test
    public void testSetEmploymentLevel() {
        System.out.println("setEmploymentLevel");
        EmploymentLevel employmentLevel = null;
        Person instance = new Person();
        instance.setEmploymentLevel(employmentLevel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonContactMode method, of class Person.
     */
    @Test
    public void testGetPersonContactMode() {
        System.out.println("getPersonContactMode");
        Person instance = new Person();
        PersonContactMode expResult = null;
        PersonContactMode result = instance.getPersonContactMode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonContactMode method, of class Person.
     */
    @Test
    public void testSetPersonContactMode() {
        System.out.println("setPersonContactMode");
        PersonContactMode personContactMode = null;
        Person instance = new Person();
        instance.setPersonContactMode(personContactMode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonStatus method, of class Person.
     */
    @Test
    public void testGetPersonStatus() {
        System.out.println("getPersonStatus");
        Person instance = new Person();
        PersonStatus expResult = null;
        PersonStatus result = instance.getPersonStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonStatus method, of class Person.
     */
    @Test
    public void testSetPersonStatus() {
        System.out.println("setPersonStatus");
        PersonStatus personStatus = null;
        Person instance = new Person();
        instance.setPersonStatus(personStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonTitle method, of class Person.
     */
    @Test
    public void testGetPersonTitle() {
        System.out.println("getPersonTitle");
        Person instance = new Person();
        PersonTitle expResult = null;
        PersonTitle result = instance.getPersonTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonTitle method, of class Person.
     */
    @Test
    public void testSetPersonTitle() {
        System.out.println("setPersonTitle");
        PersonTitle personTitle = null;
        Person instance = new Person();
        instance.setPersonTitle(personTitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Person.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Person instance = new Person();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Person.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Person instance = new Person();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForename1 method, of class Person.
     */
    @Test
    public void testGetForename1() {
        System.out.println("getForename1");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getForename1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForename1 method, of class Person.
     */
    @Test
    public void testSetForename1() {
        System.out.println("setForename1");
        String forename1 = "";
        Person instance = new Person();
        instance.setForename1(forename1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForename2 method, of class Person.
     */
    @Test
    public void testGetForename2() {
        System.out.println("getForename2");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getForename2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForename2 method, of class Person.
     */
    @Test
    public void testSetForename2() {
        System.out.println("setForename2");
        String forename2 = "";
        Person instance = new Person();
        instance.setForename2(forename2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSurname method, of class Person.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSurname method, of class Person.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        String surname = "";
        Person instance = new Person();
        instance.setSurname(surname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddressLine1 method, of class Person.
     */
    @Test
    public void testGetAddressLine1() {
        System.out.println("getAddressLine1");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getAddressLine1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressLine1 method, of class Person.
     */
    @Test
    public void testSetAddressLine1() {
        System.out.println("setAddressLine1");
        String addressLine1 = "";
        Person instance = new Person();
        instance.setAddressLine1(addressLine1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddressLine2 method, of class Person.
     */
    @Test
    public void testGetAddressLine2() {
        System.out.println("getAddressLine2");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getAddressLine2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddressLine2 method, of class Person.
     */
    @Test
    public void testSetAddressLine2() {
        System.out.println("setAddressLine2");
        String addressLine2 = "";
        Person instance = new Person();
        instance.setAddressLine2(addressLine2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTown method, of class Person.
     */
    @Test
    public void testGetTown() {
        System.out.println("getTown");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getTown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTown method, of class Person.
     */
    @Test
    public void testSetTown() {
        System.out.println("setTown");
        String town = "";
        Person instance = new Person();
        instance.setTown(town);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPostcode method, of class Person.
     */
    @Test
    public void testGetPostcode() {
        System.out.println("getPostcode");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getPostcode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPostcode method, of class Person.
     */
    @Test
    public void testSetPostcode() {
        System.out.println("setPostcode");
        String postcode = "";
        Person instance = new Person();
        instance.setPostcode(postcode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondEmail method, of class Person.
     */
    @Test
    public void testGetSecondEmail() {
        System.out.println("getSecondEmail");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getSecondEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSecondEmail method, of class Person.
     */
    @Test
    public void testSetSecondEmail() {
        System.out.println("setSecondEmail");
        String secondEmail = "";
        Person instance = new Person();
        instance.setSecondEmail(secondEmail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonalUrl method, of class Person.
     */
    @Test
    public void testGetPersonalUrl() {
        System.out.println("getPersonalUrl");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getPersonalUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonalUrl method, of class Person.
     */
    @Test
    public void testSetPersonalUrl() {
        System.out.println("setPersonalUrl");
        String personalUrl = "";
        Person instance = new Person();
        instance.setPersonalUrl(personalUrl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoto method, of class Person.
     */
    @Test
    public void testGetPhoto() {
        System.out.println("getPhoto");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getPhoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoto method, of class Person.
     */
    @Test
    public void testSetPhoto() {
        System.out.println("setPhoto");
        String photo = "";
        Person instance = new Person();
        instance.setPhoto(photo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFemale method, of class Person.
     */
    @Test
    public void testGetFemale() {
        System.out.println("getFemale");
        Person instance = new Person();
        Boolean expResult = null;
        Boolean result = instance.getFemale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFemale method, of class Person.
     */
    @Test
    public void testSetFemale() {
        System.out.println("setFemale");
        Boolean female = null;
        Person instance = new Person();
        instance.setFemale(female);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPostcodeStart method, of class Person.
     */
    @Test
    public void testGetPostcodeStart() {
        System.out.println("getPostcodeStart");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getPostcodeStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPostcodeStart method, of class Person.
     */
    @Test
    public void testSetPostcodeStart() {
        System.out.println("setPostcodeStart");
        String postcodeStart = "";
        Person instance = new Person();
        instance.setPostcodeStart(postcodeStart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthorityToWorkStatement method, of class Person.
     */
    @Test
    public void testGetAuthorityToWorkStatement() {
        System.out.println("getAuthorityToWorkStatement");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getAuthorityToWorkStatement();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthorityToWorkStatement method, of class Person.
     */
    @Test
    public void testSetAuthorityToWorkStatement() {
        System.out.println("setAuthorityToWorkStatement");
        String authorityToWorkStatement = "";
        Person instance = new Person();
        instance.setAuthorityToWorkStatement(authorityToWorkStatement);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfGcses method, of class Person.
     */
    @Test
    public void testGetNoOfGcses() {
        System.out.println("getNoOfGcses");
        Person instance = new Person();
        Short expResult = null;
        Short result = instance.getNoOfGcses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfGcses method, of class Person.
     */
    @Test
    public void testSetNoOfGcses() {
        System.out.println("setNoOfGcses");
        Short noOfGcses = null;
        Person instance = new Person();
        instance.setNoOfGcses(noOfGcses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGcseEnglishGrade method, of class Person.
     */
    @Test
    public void testGetGcseEnglishGrade() {
        System.out.println("getGcseEnglishGrade");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getGcseEnglishGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGcseEnglishGrade method, of class Person.
     */
    @Test
    public void testSetGcseEnglishGrade() {
        System.out.println("setGcseEnglishGrade");
        String gcseEnglishGrade = "";
        Person instance = new Person();
        instance.setGcseEnglishGrade(gcseEnglishGrade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGcseMathsGrade method, of class Person.
     */
    @Test
    public void testGetGcseMathsGrade() {
        System.out.println("getGcseMathsGrade");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getGcseMathsGrade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGcseMathsGrade method, of class Person.
     */
    @Test
    public void testSetGcseMathsGrade() {
        System.out.println("setGcseMathsGrade");
        String gcseMathsGrade = "";
        Person instance = new Person();
        instance.setGcseMathsGrade(gcseMathsGrade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiveOrMoreGcses method, of class Person.
     */
    @Test
    public void testGetFiveOrMoreGcses() {
        System.out.println("getFiveOrMoreGcses");
        Person instance = new Person();
        Boolean expResult = null;
        Boolean result = instance.getFiveOrMoreGcses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFiveOrMoreGcses method, of class Person.
     */
    @Test
    public void testSetFiveOrMoreGcses() {
        System.out.println("setFiveOrMoreGcses");
        Boolean fiveOrMoreGcses = null;
        Person instance = new Person();
        instance.setFiveOrMoreGcses(fiveOrMoreGcses);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfAlevels method, of class Person.
     */
    @Test
    public void testGetNoOfAlevels() {
        System.out.println("getNoOfAlevels");
        Person instance = new Person();
        Short expResult = null;
        Short result = instance.getNoOfAlevels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfAlevels method, of class Person.
     */
    @Test
    public void testSetNoOfAlevels() {
        System.out.println("setNoOfAlevels");
        Short noOfAlevels = null;
        Person instance = new Person();
        instance.setNoOfAlevels(noOfAlevels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUcasPoints method, of class Person.
     */
    @Test
    public void testGetUcasPoints() {
        System.out.println("getUcasPoints");
        Person instance = new Person();
        Short expResult = null;
        Short result = instance.getUcasPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUcasPoints method, of class Person.
     */
    @Test
    public void testSetUcasPoints() {
        System.out.println("setUcasPoints");
        Short ucasPoints = null;
        Person instance = new Person();
        instance.setUcasPoints(ucasPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMobile method, of class Person.
     */
    @Test
    public void testGetMobile() {
        System.out.println("getMobile");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getMobile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMobile method, of class Person.
     */
    @Test
    public void testSetMobile() {
        System.out.println("setMobile");
        String mobile = "";
        Person instance = new Person();
        instance.setMobile(mobile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLandline method, of class Person.
     */
    @Test
    public void testGetLandline() {
        System.out.println("getLandline");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getLandline();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLandline method, of class Person.
     */
    @Test
    public void testSetLandline() {
        System.out.println("setLandline");
        String landline = "";
        Person instance = new Person();
        instance.setLandline(landline);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDob method, of class Person.
     */
    @Test
    public void testGetDob() {
        System.out.println("getDob");
        Person instance = new Person();
        Date expResult = null;
        Date result = instance.getDob();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDob method, of class Person.
     */
    @Test
    public void testSetDob() {
        System.out.println("setDob");
        Date dob = null;
        Person instance = new Person();
        instance.setDob(dob);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPenaltyPoints method, of class Person.
     */
    @Test
    public void testGetPenaltyPoints() {
        System.out.println("getPenaltyPoints");
        Person instance = new Person();
        Short expResult = null;
        Short result = instance.getPenaltyPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPenaltyPoints method, of class Person.
     */
    @Test
    public void testSetPenaltyPoints() {
        System.out.println("setPenaltyPoints");
        Short penaltyPoints = null;
        Person instance = new Person();
        instance.setPenaltyPoints(penaltyPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReferees method, of class Person.
     */
    @Test
    public void testGetReferees() {
        System.out.println("getReferees");
        Person instance = new Person();
        Set<Referee> expResult = null;
        Set<Referee> result = instance.getReferees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReferees method, of class Person.
     */
    @Test
    public void testSetReferees() {
        System.out.println("setReferees");
        Set<Referee> referees = null;
        Person instance = new Person();
        instance.setReferees(referees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSkillPersons method, of class Person.
     */
    @Test
    public void testGetSkillPersons() {
        System.out.println("getSkillPersons");
        Person instance = new Person();
        Set<SkillPerson> expResult = null;
        Set<SkillPerson> result = instance.getSkillPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSkillPersons method, of class Person.
     */
    @Test
    public void testSetSkillPersons() {
        System.out.println("setSkillPersons");
        Set<SkillPerson> skillPersons = null;
        Person instance = new Person();
        instance.setSkillPersons(skillPersons);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEducationalQualifications method, of class Person.
     */
    @Test
    public void testGetEducationalQualifications() {
        System.out.println("getEducationalQualifications");
        Person instance = new Person();
        Set<EducationalQualification> expResult = null;
        Set<EducationalQualification> result = instance.getEducationalQualifications();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEducationalQualifications method, of class Person.
     */
    @Test
    public void testSetEducationalQualifications() {
        System.out.println("setEducationalQualifications");
        Set<EducationalQualification> educationalQualifications = null;
        Person instance = new Person();
        instance.setEducationalQualifications(educationalQualifications);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperiences method, of class Person.
     */
    @Test
    public void testGetExperiences() {
        System.out.println("getExperiences");
        Person instance = new Person();
        Set<Experience> expResult = null;
        Set<Experience> result = instance.getExperiences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExperiences method, of class Person.
     */
    @Test
    public void testSetExperiences() {
        System.out.println("setExperiences");
        Set<Experience> experiences = null;
        Person instance = new Person();
        instance.setExperiences(experiences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessionalQualifications method, of class Person.
     */
    @Test
    public void testGetProfessionalQualifications() {
        System.out.println("getProfessionalQualifications");
        Person instance = new Person();
        Set<ProfessionalQualification> expResult = null;
        Set<ProfessionalQualification> result = instance.getProfessionalQualifications();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessionalQualifications method, of class Person.
     */
    @Test
    public void testSetProfessionalQualifications() {
        System.out.println("setProfessionalQualifications");
        Set<ProfessionalQualification> professionalQualifications = null;
        Person instance = new Person();
        instance.setProfessionalQualifications(professionalQualifications);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJobPreferences method, of class Person.
     */
    @Test
    public void testGetJobPreferences() {
        System.out.println("getJobPreferences");
        Person instance = new Person();
        Set<JobPreference> expResult = null;
        Set<JobPreference> result = instance.getJobPreferences();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJobPreferences method, of class Person.
     */
    @Test
    public void testSetJobPreferences() {
        System.out.println("setJobPreferences");
        Set<JobPreference> jobPreferences = null;
        Person instance = new Person();
        instance.setJobPreferences(jobPreferences);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
