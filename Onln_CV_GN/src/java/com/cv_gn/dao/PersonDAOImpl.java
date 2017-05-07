/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.EducationalQualification;
import com.cv_gn.model.EmploymentLevel;
import com.cv_gn.model.Experience;
import com.cv_gn.model.JobPreference;
import com.cv_gn.model.OnlnCVHiberUtil;
import com.cv_gn.model.Person;
import com.cv_gn.model.PersonContactMode;
import com.cv_gn.model.PersonStatus;
import com.cv_gn.model.PersonTitle;
import com.cv_gn.model.ProfessionalQualification;
import com.cv_gn.model.Referee;
import com.cv_gn.model.SkillPerson;
import com.cv_gn.model.User;
import com.cv_gn.model.UserType;
import com.cv_gn.util.DBConnection;
import com.cv_gn.util.Onln_CV_GNConstant;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Ganith Perera
 */

public class PersonDAOImpl{
private static PreparedStatement pstmt1=null;
     private static Connection conn=null;
     private static PersonDAOImpl pl=null;
     
   
    public String addPerson(User user,Person p) {
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
                    String personInsertQry = "INSERT INTO person VALUES('0','" + user_id + "','Mr.','" + p.getForename1() + "','" + p.getForename2() + "','" + p.getSurname() + "','" + p.getAddressLine1() + "','" + p.getAddressLine2() + "','" + p.getTown() + "','" + p.getPostcode() + "','" + p.getSecondEmail() + "','" + p.getPersonalUrl() + "','" + p.getPhoto() + "','0','" + p.getPostcodeStart() + "','" + p.getAuthorityToWorkStatement() + "','Mobile','" + p.getNoOfGcses() + "','" + p.getGcseEnglishGrade() + "','" + p.getGcseMathsGrade() + "','0','" + p.getNoOfAlevels() + "','" + p.getUcasPoints() + "','" + p.getPersonStatus() + "','" + p.getMobile() + "','" + p.getLandline() + "','" + birthDay + "','" + p.getPenaltyPoints() + "','1')";

                    preparedStatementPerson = conn.prepareStatement(personInsertQry);
                    //Save Person to database
                    int statusPerson = preparedStatementPerson.executeUpdate();
                    //System.out.println("statusPerson=" + statusPerson);
                    // Check SQL Query status
                    if (statusUser == 1 || statusPerson == 1) {

                        return Onln_CV_GNConstant.SUCCESS;
                    } else {
                        return Onln_CV_GNConstant.NOT_ADDED;
                    }
                } else { // Username exist
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
    
    public String addPerson(User user,Person person,PersonStatus personStatus,PersonTitle personTitle,PersonContactMode pcm) {
    // Open Database Connection
    Session session = OnlnCVHiberUtil.getSessionFactory().openSession();
      
        try {
            
                

        Transaction transaction = session.beginTransaction();
        UserType ut = (UserType) session.load(UserType.class, Short.parseShort("1"));//Bug:Provided id of the wrong type for class UserType. Expected: class Short, got class Integer #6
        user.setUserType(ut);
            System.out.println(" user.setUserType(ut);");
        PersonStatus ps = (PersonStatus) session.load(PersonStatus.class, personStatus.getIdpersonStatus());
        PersonTitle pt=(PersonTitle) session.load(PersonTitle.class, personTitle.getIdpersonTitle());
        PersonContactMode prsncm=(PersonContactMode) session.load(PersonContactMode.class, pcm.getIdcontactPreference());
             person.setPersonContactMode(prsncm);
             person.setPersonTitle(pt);
             person.setPersonStatus(ps);
             
             user.setRegisterDate(new Date());
           
             //Save User to database
             System.out.println("Save User to database");
       session.save(user);
       
       
              person.setUser(user);
              System.out.println("person.setUser(user);");
person.setDob(person.getDob());
                  
                    //Save Person to database
                   session.save(person);
                    System.out.println("Save Person to database");
                    //Commit the changes to database
                   transaction.commit();
                   session.close();
                   
                   
  return "success";
        } catch (Exception ex) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
           
              return "";
                } 

          
        

    
    
       public String getPersonTitleLength() {
        int titleLength=0;
        String personTitleQuery="";
         try {
             // Open Database Connection
             conn = DBConnection.getDBConnection();
             if (conn != null) { // Check Connection Object
                 personTitleQuery= "SELECT * FROM person_title";
                 pstmt1 = conn.prepareStatement(personTitleQuery);
                 ResultSet rs = pstmt1.executeQuery();
                 while (rs.next()) {
                     rs.getString(1);  
                     titleLength++;
                 }
             }else { // Connection Object is Null
                 return Onln_CV_GNConstant.ERROR;
             }
             return ""+titleLength;
         } catch (SQLException ex) {
             Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return ""+titleLength;

    }
        public String[] getPersonTitles() {
            int titleLength= Integer.parseInt(pl.getPersonTitleLength());
        String[] personTitle=new String[titleLength];
       pl=new PersonDAOImpl();
      
        String personTitleQuery="";
         try {
             
             // Open Database Connection
             conn = DBConnection.getDBConnection();
             
             
             if (conn != null) { // Check Connection Object
                 personTitleQuery= "SELECT * FROM person_title";
                 pstmt1 = conn.prepareStatement(personTitleQuery);
                 ResultSet rs = pstmt1.executeQuery();
                 while (rs.next()) {
                     System.out.println("indxA="+titleLength);
                   personTitle[titleLength-1]=  rs.getString("title");
                   
                     System.out.println("indxB="+titleLength);
                     titleLength--;
                 }
             }else { // Connection Object is Null
                 //return Onln_CV_GNConstant.ERROR;
             }
             return personTitle;
         } catch (SQLException ex) {
             Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
         }
         return personTitle;

    }
        public static void main(String[] args) {
         pl=new PersonDAOImpl();
        String size=pl.getPersonTitleLength();
            System.out.println("size="+size);
          String ary[]=pl.getPersonTitles();
            for (int i = 0; i < ary.length; i++) {
                System.out.println("val="+ary[i]);
                
            }
    }

    
   
}
