/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.util.DBConnection;
import com.cv_gn.util.Onln_CV_GNConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.catalina.User;

/**
 *
 * @author Naduni Pulsarani
 */
public class UserDAOImpl {

    public String addEmployee(User user) {

        // OPen Database Connection 
        Connection conn = DBConnection.getConnection();

        if (conn != null) { // Check Connection Object
            String checkExistQuery = "select * from employee where username='" + user.getUsername() + "'";

            PreparedStatement pstmt1;
            try {
                pstmt1 = conn.prepareStatement(checkExistQuery);

                ResultSet rs = pstmt1.executeQuery();

                if (!rs.next()) {

                    String insertQuery = "INSERT INTO employee(first_name,last_name,address,contact_number,gender,email_address,username,password,user_status,user_type) VALUES(?,?,?,?,?,?,?,?,'1',?)";
                    PreparedStatement psmt = conn.prepareStatement(insertQuery);

                  /*  psmt.setString(1, employee.getFirstName());
                    psmt.setString(2, employee.getLastName());
                    psmt.setString(3, employee.getAddress());
                    psmt.setInt(4, employee.getContactNumber());
                    psmt.setString(5, employee.getGender());
                    psmt.setString(6, employee.getEmailAddress());
                    psmt.setString(7, employee.getUsername());
                    psmt.setString(8, employee.getPassword());

                    psmt.setString(9, employee.getUserType());
                  */
                    // Execute SQL Query
                    int status = psmt.executeUpdate();

                    if (status == 1) {

                        return Onln_CV_GNConstant.SUCCESS;
                    } else {
                        return Onln_CV_GNConstant.NOT_ADDED;
                    }
                } else { // Item ID exist
                    return Onln_CV_GNConstant.EXIST;
                }

            } catch (SQLException ex) {

                ex.printStackTrace();

                return Onln_CV_GNConstant.ERROR;

            } finally {
                try {
                    // Finally clause use for Close Connection Object
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else { // Connection Object is Null
            return Onln_CV_GNConstant.ERROR;
        }

    }

}
