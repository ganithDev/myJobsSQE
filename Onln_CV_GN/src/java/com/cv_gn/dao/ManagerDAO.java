/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.OnlnCVHiberUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author Ganith Perera
 */
public class ManagerDAO {
    
            public static Session openDBSession(){
            Session session=OnlnCVHiberUtil.getSessionFactory().openSession();
            return session;
            }
            
            public static List searchAll(Object object){
                Criteria criteria =ManagerDAO.openDBSession().createCriteria(object.getClass());//Bug:Hibernate class cast exception #5
                List<Class> list=criteria.list();
                return list;
            }
            public static Criteria searchCriteria(Object object){
            Criteria criteria=ManagerDAO.openDBSession().createCriteria(object.getClass());
            return criteria;
            }
            
}
