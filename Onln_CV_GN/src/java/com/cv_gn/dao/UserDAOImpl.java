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
import java.io.IOException;
import java.security.GeneralSecurityException;
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
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Naduni Pulsarani
 */
public class UserDAOImpl {

    private static PreparedStatement pstmt1 = null;
    private static Connection conn = null;

    public boolean checkUsernameAvailable(String username) {
        Criteria cr = ManagerDAO.openDBSession().createCriteria(com.cv_gn.model.User.class);
        cr.add(Restrictions.eq("username", username));
        User u = (User) cr.uniqueResult();
        return u != null;

    }

    public User isUserAvailable(String username) {
        Criteria cr = ManagerDAO.openDBSession().createCriteria(com.cv_gn.model.User.class);
        cr.add(Restrictions.eq("username", username));
        User u = (User) cr.uniqueResult();
        return u;
    }

    public User isUserPassswordCorrect(String password, User usr) {
        User ulok = null;

        try {
            System.out.println("mmm");
            if (password.equals(ManagerDAO.decrypt(usr.getPassword()))) {
                ulok = usr;
                System.out.println("nnnn");
            } else {
                ulok = null;
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }

        return ulok;
    }

}
