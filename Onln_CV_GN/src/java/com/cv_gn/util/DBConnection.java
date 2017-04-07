/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User1
 */
public class DBConnection {
    
 private static String className = "com.mysql.jdbc.Driver";
    private static String driverURL = "jdbc:mysql://localhost:3306/mymscsqeprocv_db";
    private static String dbUsername = "root";
    private static String dbPassword = "";
    
    
    public static Connection getConnection(){
        
        // Declare SQL Connection
    
      Connection conn = null;

            try {
                // Retrievel Instance of Driver Class

                Class.forName(className).newInstance();
                
                //Intialize Connection object
                conn = DriverManager.getConnection(driverURL, dbUsername, dbPassword);

                System.out.println("Connection Success");

            } catch (Exception ex) {

                ex.printStackTrace();


            }
    
    return conn;
    }
    
}

