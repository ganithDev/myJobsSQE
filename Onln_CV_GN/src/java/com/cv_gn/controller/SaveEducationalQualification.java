/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.controller;

import com.cv_gn.dao.PersonDAOImpl;
import com.cv_gn.model.EducationLevel;
import com.cv_gn.model.EducationalQualification;
import com.cv_gn.model.Person;
import com.cv_gn.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ganith Perera
 */
@WebServlet(name = "SaveEducationalQualification", urlPatterns = {"/SaveEducationalQualification"})
public class SaveEducationalQualification extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            HttpSession hs=request.getSession();
            User usr = (User) hs.getAttribute("JobSeeker");
            if(usr!=null){
           String qualificationType = "", courseName = "", vocational = "", mainSubject = "", nameOfInstitution = "",
                    country = "", yearObtained = "", result = "", thesesTitle = "",msg="";
              
//initializing the varibales from the values submitted from add edu qulif
            qualificationType = request.getParameter("eduLevel");
            courseName = request.getParameter("courseName");
            vocational = request.getParameter("vocational");
            boolean vocationalQl=true;
            mainSubject = request.getParameter("mainSubject");
            nameOfInstitution = request.getParameter("nameOfInstitution");
            country = request.getParameter("country");
            yearObtained = request.getParameter("yearObtained");
              result = request.getParameter("result");
                 thesesTitle = request.getParameter("thesesTitle");
              
             if (vocational==null) {
                vocationalQl = false;
            } else {
                vocationalQl = true;
            }
             Date yrObtained = null;
             
            yrObtained = new SimpleDateFormat("yyyy-MM-dd").parse(yearObtained);
                System.out.println("date=" + yrObtained);
                Person p=new PersonDAOImpl().getPersonFromUser(usr);
                EducationLevel el=new EducationLevel();
                el.setIdEducationLevel(Short.parseShort(qualificationType));
                EducationalQualification eq=new EducationalQualification(el, p, "", courseName, "", vocationalQl, mainSubject, nameOfInstitution, country, yrObtained, result, thesesTitle, true, "");
                String addEduQualification = new PersonDAOImpl().addEduQualification(eq, p, el,usr);
             if (addEduQualification.equals("success")) {
                    response.sendRedirect("profile.jsp");
                } else {
                 msg="Not saved properly";
                    response.sendRedirect("profile.jsp?msg=" + msg);
                }           
            }else{
            response.sendRedirect("login.jsp");
                   
            }
        } catch (Exception e) {
            out.println("excep="+e.getMessage());
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
        processRequest(request, response);
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
        processRequest(request, response);
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
