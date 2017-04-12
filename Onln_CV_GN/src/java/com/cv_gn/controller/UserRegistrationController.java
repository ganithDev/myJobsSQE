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
import com.cv_gn.model.ProfessionalQualification;
import com.cv_gn.model.Referee;
import com.cv_gn.model.SkillPerson;
import com.cv_gn.model.User;
import com.cv_gn.model.UserType;
import com.cv_gn.util.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
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

            String title = "", firstName = "", secondName = "", surName = "", address1 = "",
                    address2 = "", town = "", postcode = "", secondEmail = "", personalUrl = "", photo = "",
                    studentStatus = "", mobile = "", landLine = "", dob = "", userEmail = "", password = "";
            //initializing the varibales from the values submitted from registerUser
            title = request.getParameter("title");
            firstName = request.getParameter("firstName");
            secondName = request.getParameter("secondName");
            surName = request.getParameter("surName");
            address1 = request.getParameter("address1");
            address2 = request.getParameter("address2");
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
            Date birthDay = null;
//Need to define at registration or other approach
            String postcodeStart = "SL", authorityToWorkStatement = "authorityToWorkStatement", contactPreference = "Mobile", gcseEnglishGrade = "A", gcseMathsGrade = "B";
            //  Short noOfGcses=0, String , String gcseMathsGrade, Boolean fiveOrMoreGcses, Short noOfAlevels, Short ucasPoints, String studentStatus, String mobile, String landline, Date dob, Short penaltyPoints, Set<Referee> referees, Set<SkillPerson> skillPersons, Set<EducationalQualification> educationalQualifications, Set<Experience> experiences, Set<ProfessionalQualification> professionalQualifications, Set<JobPreference> jobPreferences)

            UserType userType = new UserType();
            Set<Referee> referees = new HashSet<Referee>(0);
            Set<SkillPerson> skillPersons = new HashSet<SkillPerson>(0);
            Set<EducationalQualification> educationalQualifications = new HashSet<EducationalQualification>(0);
            Set<Experience> experiences = new HashSet<Experience>(0);
            Set<ProfessionalQualification> professionalQualifications = new HashSet<ProfessionalQualification>(0);
            Set<JobPreference> jobPreferences = new HashSet<JobPreference>(0);
            EmploymentLevel employmentLevel = new EmploymentLevel();

            employmentLevel.getIdLevelOfEmployment();
//Create the User object
            User user = new User(0, userType, userEmail, password);
            System.out.println("dob="+dob);
            birthDay = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
            System.out.println("date="+birthDay);
            Person person = null;
            Boolean fm = Boolean.FALSE;
            out.println("female="+fm);
            Short noOfGces=5, ucasPoints=10,noOfAlevels=2,penaltyPoints=11;//Need to define at registration or other approach
            
            //Create the Person object
            person = new Person(employmentLevel, user, title, firstName, secondName, surName, address1, address2, town, postcode, secondEmail, personalUrl, photo, Boolean.FALSE, postcodeStart, authorityToWorkStatement, contactPreference,noOfGces , gcseEnglishGrade, gcseMathsGrade, Boolean.FALSE, noOfAlevels, ucasPoints, studentStatus, mobile, landLine, birthDay, penaltyPoints, referees, skillPersons, educationalQualifications, experiences, professionalQualifications, jobPreferences);
            //Pass person,user objects to addPerson 
            String addPerson = new PersonDAOImpl().addPerson(person, user);
            if(addPerson.equals("success")){
            response.sendRedirect("home.jsp");
            }else{
            response.sendRedirect("registerUser.jsp?msg="+addPerson);
            }

            Referee referee1 = null, referee2 = null;
            referee1 = new Referee(person, "Mr.", "Alex", "Stuart", "alx@yahoo.com", "845784", "employer", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "referee contacted by email", "path1");
            referee2 = new Referee(person, "Mr.", "Ray", "Fernando", "ray@yahoo.com", "878954", "academic", Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, "referee contacted by mobile", "path2");
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
