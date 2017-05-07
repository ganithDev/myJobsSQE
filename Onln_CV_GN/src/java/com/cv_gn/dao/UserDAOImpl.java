/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.OnlnCVHiberUtil;
import com.cv_gn.model.PersonTitle;
import com.cv_gn.model.User;
import com.cv_gn.util.DBConnection;
import com.cv_gn.util.Onln_CV_GNConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Naduni Pulsarani
 */
public class UserDAOImpl {
    
   

    private static PreparedStatement pstmt1;
    private static Connection conn;
   

    public static void main(String[] args) {
     //boolean isUser=new UserDAOImpl().checkUsernameAvailable("ganithperera@outlook.com");
        //System.out.println("User "+isUser);
   //     new ManagerDAO();
               
        List<PersonTitle> pt=ManagerDAO.searchAll(new PersonTitle());
        for (PersonTitle personTitle : pt) {
            System.out.println("V-"+personTitle.getTitle());
        }
    }

   

    public String getUserID(String username) {
        String userID = "", userIDQuery = "";
        try {

            // Open Database Connection
            conn = DBConnection.getDBConnection();

            if (conn != null) { // Check Connection Object
                userIDQuery = "select * from user where username='" + username + "'";
                pstmt1 = conn.prepareStatement(userIDQuery);
                ResultSet rs = pstmt1.executeQuery();
                while (rs.next()) {
                    userID = rs.getString(1);
                }
            } else { // Connection Object is Null
                return Onln_CV_GNConstant.ERROR;
            }
            return userID;
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userID;

    }
    
    public boolean checkUsernameAvailable(String username) {
        Criteria cr = ManagerDAO.openDBSession().createCriteria(com.cv_gn.model.User.class);
        cr.add(Restrictions.eq("username", username));
        User u = (User) cr.uniqueResult();
        return u != null;
        
         }


    

}
