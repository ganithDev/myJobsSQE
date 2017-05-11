/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Naduni Pulsarani
 */
public class UserDAOImpl {

    
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
