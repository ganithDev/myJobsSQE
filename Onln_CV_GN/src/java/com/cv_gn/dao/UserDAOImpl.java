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

    public Object isUserAvailable(String username) {
        Criteria cr = ManagerDAO.openDBSession().createCriteria(com.cv_gn.model.User.class);
        cr.add(Restrictions.eq("username", username));
        User u = (User) cr.uniqueResult();
        System.out.println(u.getPassword());
        return u;
    }
public User isUserAvailableok(String username) {
        Criteria cr = ManagerDAO.openDBSession().createCriteria(com.cv_gn.model.User.class);
        cr.add(Restrictions.eq("username", username));
        User u = (User) cr.uniqueResult();
        System.out.println(u.getPassword());
        return u;
    }

    public Object isUserPassswordCorrect(String password, User usr) {
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
    public String isUserPassswordCorrectok(String password, User usr) {
        String ulok = "";

        try {
            System.out.println("mmm");
            if (password.equals(ManagerDAO.decrypt(usr.getPassword()))) {
                ulok = "correct";
                System.out.println("nnnn");
            } else {
                ulok = "wrong";
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }

        return ulok;
    }

    public static void main(String[] args) {
//        User us=null;
//        User userAvailable = new UserDAOImpl().isUserAvailable("ganithperera@outlook.com");
//   //     String u=new UserDAOImpl().isUserPassswordCorrect("888888888888", userAvailable);
//        //System.out.println("New user="+u);
//        try {
//            User u=new UserDAOImpl().isUserPassswordCorrect("888888888888", userAvailable);
//                if(u==null){System.out.println("null");}else{System.out.println("ok");}
//        System.out.println("New user="+u.getUserType().getUserType());
//        } catch (Exception e) {
//            System.out.println("msg="+e.getMessage());
//        }
 
        
    }
}
