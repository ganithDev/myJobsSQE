/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.Person;
import com.cv_gn.model.User;
import com.cv_gn.model.UserType;
import com.cv_gn.util.DBConnection;
import com.cv_gn.util.Onln_CV_GNConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ganith Perera
 */
public class PersonDAOImpl {

    public String addPerson(Person p, User user) {
        // Open Database Connection 
        Connection conn = DBConnection.getDBConnection();

        if (conn != null) { // Check Connection Object
            String checkExistQuery = "select * from user where username='" + user.getUsername() + "'";

            PreparedStatement checkUser, preparedStatementUser, preparedStatementPerson;
            try {

                checkUser = conn.prepareStatement(checkExistQuery);
//validate whether username is already availbale
                ResultSet rs = checkUser.executeQuery();

                if (!rs.next()) {
                    //UserType userType = new UserType();
                    //  userType.getIdUserType(1, conn);
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    DateFormat dateFormatShort = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = new Date();
                    String regDate = "", birthDay = "";
                    regDate = dateFormat.format(date);
                    birthDay = dateFormatShort.format(p.getDob());

                    System.out.println("user");
                    String userInsertQry = "INSERT INTO user(username,password,registerDate,idUser_type) VALUES('" + user.getUsername() + "','" + user.getPassword() + "','" + regDate + "','1')";

                    preparedStatementUser = conn.prepareStatement(userInsertQry);
                    //Save User to database
                    int statusUser = preparedStatementUser.executeUpdate();
                    System.out.println("userSatus=" + statusUser);
                    System.out.println("female=" + p.getFemale());//Issue#2:SQL Insert Data too long for column #2>Fix : Change data type to boolean(ER) / DB(tinyint)
                    //Get user ID from the database
                    String userID = new UserDAOImpl().getUserID(user.getUsername());
                    short user_id = Short.parseShort(userID);
                    String personInsertQry = "INSERT INTO person VALUES('0','" + user_id + "','" + p.getTitle() + "','" + p.getForename1() + "','" + p.getForename2() + "','" + p.getSurname() + "','" + p.getAddressLine1() + "','" + p.getAddressLine2() + "','" + p.getTown() + "','" + p.getPostcode() + "','" + p.getSecondEmail() + "','" + p.getPersonalUrl() + "','" + p.getPhoto() + "','0','" + p.getPostcodeStart() + "','" + p.getAuthorityToWorkStatement() + "','" + p.getContactPreference() + "','" + p.getNoOfGcses() + "','" + p.getGcseEnglishGrade() + "','" + p.getGcseMathsGrade() + "','0','" + p.getNoOfAlevels() + "','" + p.getUcasPoints() + "','" + p.getStudentStatus() + "','" + p.getMobile() + "','" + p.getLandline() + "','" + birthDay + "','" + p.getPenaltyPoints() + "','1')";

                    preparedStatementPerson = conn.prepareStatement(personInsertQry);
                    //Save Person to database
                    int statusPerson = preparedStatementPerson.executeUpdate();
                    System.out.println("statusPerson=" + statusPerson);
                    // Check SQL Query status
                    if (statusUser == 1 || statusPerson == 1) {

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
