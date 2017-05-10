/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.OnlnCVHiberUtil;
import com.cv_gn.model.Person;
import com.cv_gn.model.PersonContactMode;
import com.cv_gn.model.PersonStatus;
import com.cv_gn.model.PersonTitle;
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
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ganith Perera
 */
public class PersonDAOImpl {

    private static PreparedStatement pstmt1 = null;
    private static Connection conn = null;
    private static PersonDAOImpl pl = null;

    public String addPerson(User user, Person person, PersonStatus personStatus, PersonTitle personTitle, PersonContactMode pcm) {
        // Open Database Connection
        Session session = OnlnCVHiberUtil.getSessionFactory().openSession();

        try {

            Transaction transaction = session.beginTransaction();
            UserType ut = (UserType) session.load(UserType.class, Short.parseShort("1"));//Bug:Provided id of the wrong type for class UserType. Expected: class Short, got class Integer #6
            user.setUserType(ut);
            System.out.println(" user.setUserType(ut);");
            PersonStatus ps = (PersonStatus) session.load(PersonStatus.class, personStatus.getIdpersonStatus());
            PersonTitle pt = (PersonTitle) session.load(PersonTitle.class, personTitle.getIdpersonTitle());
            PersonContactMode prsncm = (PersonContactMode) session.load(PersonContactMode.class, pcm.getIdcontactPreference());
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

}
