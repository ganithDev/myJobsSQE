/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import com.cv_gn.dao.PersonDAOImpl;
import com.cv_gn.model.EducationalQualification;
import com.cv_gn.model.EmploymentLevel;
import com.cv_gn.model.Experience;
import com.cv_gn.model.JobPreference;
import com.cv_gn.model.Person;
import com.cv_gn.model.ProfessionalQualification;
import com.cv_gn.model.Referee;
import com.cv_gn.model.SkillPerson;
import com.cv_gn.model.User;
import com.cv_gn.model.UserType;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Naduni Pulsarani
 */
public class TestCaseforUserRegistration {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    /* public void testEqual() {
        System.out.println("equal");
        int[] a = null;
        int[] b = null;
        boolean expResult = false;
        boolean result = Vectors.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
     */
    public void equalsCheck() throws ParseException {
        System.out.println("* TestCaseforUserRegistration: equalsCheck()");

        HttpServletRequest request = null;

        String title = "", firstName = "", secondName = "", surName = "", address1 = "",
                address2 = "", town = "", postcode = "", secondEmail = "", personalUrl = "", photo = "",
                studentStatus = "", mobile = "", landLine = "", dob = "", userEmail = "", password = "";

        title = "Mrs";
        System.out.println("title : " + title);
        firstName = "Kamal";
        System.out.println("firstName : "+firstName);
        secondName = "Nisala";
        System.out.println("secondName : "+secondName);
        surName = "Perera";
        System.out.println("surName : "+surName);
        address1 = "103/1,";
        System.out.println("address1 : "+address1);
        address2 = "Colombo 04";
        System.out.println("address2 : "+address2);
        town = "Bambalapitiya";
        System.out.println("town : "+town);
        postcode = "10150";
        System.out.println("");
        secondEmail = "kamal@gmail.com";
        System.out.println("postcode :"+postcode);
        personalUrl = null;
        photo = "87573__Interior - New - myname - Design.jpg";
        System.out.println("photo : "+photo);

        studentStatus = "Full-time";
        System.out.println("studentStatus : "+studentStatus);
        mobile = "0718895375";
        System.out.println("mobile : "+mobile);
        landLine = "0112849145";
        System.out.println("landLine : "+landLine);
        dob = "1991-02-07";
        System.out.println("dob : "+dob);
        userEmail = "kamal@gmail.com";
        System.out.println("userEmail : "+userEmail);
        password = "aaaaaa";
        System.out.println("password : "+password);

        //String date = "hu Feb 07 00:00:00 IST 1991";
        //String user = "com.cv_gn.model.User@3002802f";
        //int noOfGces = 5;
        //int noOfAlevels = 2;
        // int ucasPoints = 10;
        //int penaltyPoints = 11;
        UserType userType = new UserType();
        Set<Referee> referees = new HashSet<Referee>(0);
        Set<SkillPerson> skillPersons = new HashSet<SkillPerson>(0);
        Set<EducationalQualification> educationalQualifications = new HashSet<EducationalQualification>(0);
        Set<Experience> experiences = new HashSet<Experience>(0);
        Set<ProfessionalQualification> professionalQualifications = new HashSet<ProfessionalQualification>(0);
        Set<JobPreference> jobPreferences = new HashSet<JobPreference>(0);

        int userSatus = 1;
        boolean female = false;

        Date birthDay = null;
//Need to define at registration or other approach
        String postcodeStart = "SL", authorityToWorkStatement = "authorityToWorkStatement", contactPreference = "Mobile", gcseEnglishGrade = "A", gcseMathsGrade = "B";
        //  Short noOfGcses=0, String , String gcseMathsGrade, Boolean fiveOrMoreGcses, Short noOfAlevels, Short ucasPoints, String studentStatus, String mobile, String landline, Date dob, Short penaltyPoints, Set<Referee> referees, Set<SkillPerson> skillPersons, Set<EducationalQualification> educationalQualifications, Set<Experience> experiences, Set<ProfessionalQualification> professionalQualifications, Set<JobPreference> jobPreferences)

        EmploymentLevel employmentLevel = new EmploymentLevel();

        employmentLevel.getIdLevelOfEmployment();

//Create the User object
        User user = new User(0, userType, userEmail, password);

        //System.out.println("dob=" + dob);
        birthDay = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
        //System.out.println("date=" + birthDay);
        Person person = null;
        Boolean fm = Boolean.FALSE;
        //out.println("female=" + fm);
        Short noOfGces = 5, ucasPoints = 10, noOfAlevels = 2, penaltyPoints = 11;//Need to define at registration or other approach

        //Create the Person object
        person = new Person(employmentLevel, user, title, firstName, secondName, surName, address1, address2, town, postcode, secondEmail, personalUrl,
                photo, Boolean.FALSE, postcodeStart, authorityToWorkStatement, contactPreference, noOfGces, gcseEnglishGrade, gcseMathsGrade,
                Boolean.FALSE, noOfAlevels, ucasPoints, studentStatus, mobile, landLine, birthDay, penaltyPoints, referees, skillPersons,
                educationalQualifications, experiences, professionalQualifications, jobPreferences);
        //System.out.println("person : " + person);
        PersonDAOImpl personDAOImpl = new PersonDAOImpl();

        String addPerson = new PersonDAOImpl().addPerson(person, user);
        //System.out.println("addPerson : " + addPerson);
        //System.out.println("* VectorsJUnit4Test: equalsCheck()");
        String expResult = "exist";

        assertEquals(expResult, addPerson);
        System.out.println("Testing Successfull!!!!");

        /*assertTrue(Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(Vectors.equal(new int[]{0}, new int[]{0}));
        assertTrue(Vectors.equal(new int[]{0, 0}, new int[]{0, 0}));
        assertTrue(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
        assertTrue(Vectors.equal(new int[]{5, 6, 7}, new int[]{5, 6, 7}));

        assertFalse(Vectors.equal(new int[]{}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{}));

        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 1}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 1, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{1, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 1}, new int[]{0, 0, 3}));
         */
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    /*public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        int[] a = null;
        int[] b = null;
        int expResult = 0;
        int result = Vectors.scalarMultiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    public void ScalarMultiplicationCheck() {
        //System.out.println("* VectorsJUnit4Test: ScalarMultiplicationCheck()");
        assertEquals(0, Vectors.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(39, Vectors.scalarMultiplication(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, Vectors.scalarMultiplication(new int[]{-3, 4}, new int[]{5, -6}));
        assertEquals(0, Vectors.scalarMultiplication(new int[]{5, 9}, new int[]{-9, 5}));
        assertEquals(100, Vectors.scalarMultiplication(new int[]{6, 8}, new int[]{6, 8}));
    }
}
