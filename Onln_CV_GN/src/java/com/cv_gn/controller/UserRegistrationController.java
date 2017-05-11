/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.controller;

import com.cv_gn.dao.PersonDAOImpl;
import com.cv_gn.dao.UserDAOImpl;
import com.cv_gn.model.EducationalQualification;
import com.cv_gn.model.EmploymentLevel;
import com.cv_gn.model.Experience;
import com.cv_gn.model.JobPreference;
import com.cv_gn.model.Person;
import com.cv_gn.model.PersonContactMode;
import com.cv_gn.model.PersonStatus;
import com.cv_gn.model.PersonTitle;
import com.cv_gn.model.ProfessionalQualification;
import com.cv_gn.model.Referee;
import com.cv_gn.model.SkillPerson;
import com.cv_gn.model.User;
import com.cv_gn.model.UserType;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Naduni Pulsarani
 */
public class UserRegistrationController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* declaring the varibles */

            String title = "", firstName = "", secondName = "", surName = "", addressLine1 = "",
                    addressLine2 = "", town = "", postcode = "", secondEmail = "", personalUrl = "", photo = "",
                    studentStatus = "", mobile = "", landLine = "", dob = "", userEmail = "", password = "", contactPreference = "",
                    empLevel = "", msg = "", postcodeStart = "SL", authorityToWorkStatement = "", gcseEnglishGrade = "", gcseMathsGrade = "";
            Short noOfGces = 0, ucasPoints = 0, noOfAlevels = 0, penaltyPoints = 0;
            boolean fiveOrMoreGCSES = true, legallyBond = true;
//initializing the varibales from the values submitted from registerUser
            title = request.getParameter("title");
            firstName = request.getParameter("firstName");
            secondName = request.getParameter("secondName");
            surName = request.getParameter("surName");
            addressLine1 = request.getParameter("addressLine1");
            addressLine2 = request.getParameter("addressLine2");
            town = request.getParameter("town");
            postcode = request.getParameter("postcode");
            secondEmail = request.getParameter("secondEmail");
            personalUrl = request.getParameter("personalUrl");
            photo = request.getParameter("photo");
            studentStatus = request.getParameter("studentStatus");
            mobile = request.getParameter("mobile");
            landLine = request.getParameter("landLine");
            dob = request.getParameter("dob");
            userEmail = request.getParameter("userEmail");
            password = request.getParameter("password");
            contactPreference = request.getParameter("preferredContactMode");
            empLevel = request.getParameter("employmentLevel");
            noOfGces = Short.parseShort(request.getParameter("NoofGCSESpasses"));
            gcseEnglishGrade = request.getParameter("GCSEEnglishGrade");
            gcseMathsGrade = request.getParameter("GCSEMathsGrade");
            noOfAlevels = Short.parseShort(request.getParameter("noOfAlevels"));
            ucasPoints = Short.parseShort(request.getParameter("ucasPoints"));
            authorityToWorkStatement = request.getParameter("authorityToWorkStatement");
            penaltyPoints = Short.parseShort(request.getParameter("penaltyPoints"));
      
            if (request.getParameter("fiveOrMoreGCSES")==null) {
                fiveOrMoreGCSES = false;
            } else {
                fiveOrMoreGCSES = true;
            }
            if (request.getParameter("legallyBond")==null) {
                legallyBond = false;
            } else {
                legallyBond = true;
            }
            Date birthDay = null;
            //Validate User available
            if ("".equals(title) || "".equals(firstName) || "".equals(surName) || "".equals(addressLine1) || "".equals(town) || "".equals(postcode) || "".equals(secondEmail) || "".equals(mobile) || "".equals(dob)
                    || "".equals(userEmail) || "".equals(password) || "".equals(noOfGces)) {
                msg = "Required field or fields empty";
                System.out.println("Required field or fields empty");
                response.sendRedirect("registerUser.jsp?msg=" + msg);
            } else if (new UserDAOImpl().checkUsernameAvailable(userEmail) == true) {
                msg = "Email is already available.Please insert another one";
                System.out.println("Email is already available");
                response.sendRedirect("registerUser.jsp?msg=" + msg);
            } else if (false) {

            } else {
                UserType userType = new UserType();
                Set<Referee> referees = new HashSet<Referee>(0);
                Set<SkillPerson> skillPersons = new HashSet<SkillPerson>(0);
                Set<EducationalQualification> educationalQualifications = new HashSet<EducationalQualification>(0);
                Set<Experience> experiences = new HashSet<Experience>(0);
                Set<ProfessionalQualification> professionalQualifications = new HashSet<ProfessionalQualification>(0);
                Set<JobPreference> jobPreferences = new HashSet<JobPreference>(0);
                EmploymentLevel employmentLevel = new EmploymentLevel();
                employmentLevel.setIdLevelOfEmployment(Short.parseShort(empLevel));
                PersonStatus personStatus = new PersonStatus();
                personStatus.setIdpersonStatus(Integer.parseInt(studentStatus));
                PersonTitle personTitle = new PersonTitle();
                personTitle.setIdpersonTitle(Integer.parseInt(title));
                PersonContactMode pcm = new PersonContactMode();
                pcm.setIdcontactPreference(Integer.parseInt(contactPreference));

//Create the User object
                User user = new User(userType, userEmail, password);
                out.println("Create the User object");
                System.out.println("dob=" + dob);
                birthDay = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
                System.out.println("date=" + birthDay);
                Person person = null;

                //Create the Person object
                out.println("Create the Person object");
                person = new Person(employmentLevel, pcm, personStatus, personTitle, user, firstName, secondName, surName, addressLine1, addressLine2, town, postcode,
                        secondEmail, personalUrl, photo, legallyBond, postcodeStart, authorityToWorkStatement, noOfGces,
                        gcseEnglishGrade, gcseMathsGrade, fiveOrMoreGCSES, noOfAlevels, ucasPoints, mobile, landLine, birthDay,
                        penaltyPoints, referees, skillPersons, educationalQualifications, experiences, professionalQualifications,
                        jobPreferences);

                //Pass person,user objects to addPerson 
                out.println("Pass person");
                String addPerson = new PersonDAOImpl().addPerson(user, person, personStatus, personTitle, pcm);
                if (addPerson.equals("success")) {
                    response.sendRedirect("login.jsp");
                } else {
                    response.sendRedirect("registerUser.jsp?msg=" + addPerson);
                }

                Referee referee1 = null, referee2 = null;
                // referee1 = new Referee(person, "Mr.", "Alex", "Stuart", "alx@yahoo.com", "845784", "employer", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "referee contacted by email", "path1");
                ///referee2 = new Referee(person, "Mr.", "Ray", "Fernando", "ray@yahoo.com", "878954", "academic", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "referee contacted by mobile", "path2");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(UserRegistrationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(UserRegistrationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
