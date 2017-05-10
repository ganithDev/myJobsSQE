package com.cv_gn.controller;

import com.cv_gn.dao.UserDAOImpl;
import com.cv_gn.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ganith Perera
 */
public class UserLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            if (request == null) {
                out.write("request is null");
            } else {
                HttpSession hs = request.getSession();
                String username = "", password = "";
                username = request.getParameter("userEmail");
                password = request.getParameter("password");
                User u = new UserDAOImpl().isUserAvailable(username);
                if (u == null) {
                    response.sendRedirect("login.jsp?msg=Please insert your valid username.");
                } else {
                    User userOk = new UserDAOImpl().isUserPassswordCorrect(password, u);
                    if (userOk == null) {
                        response.sendRedirect("login.jsp?msg=Please insert your valid password.");
                    } else {
                        if (userOk.getUserType().getUserType().equals("Admin")) {
                            hs.setAttribute("Admin", userOk);
                        } else if (userOk.getUserType().getUserType().equals("Agency")) {
                            hs.setAttribute("Agency", userOk);
                            response.sendRedirect("searchCV.jsp");
                        } else {
                            hs.setAttribute("JobSeeker", userOk);
                            response.sendRedirect("profile.jsp");
                        }
                    }
                }
            }
        } catch (Exception e) {
            out.write(e.getMessage());
        } finally {
            out.close();
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
