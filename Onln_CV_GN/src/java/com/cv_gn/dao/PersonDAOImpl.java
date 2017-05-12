/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.dao;

import com.cv_gn.model.EducationLevel;
import com.cv_gn.model.EducationalQualification;
import com.cv_gn.model.EmploymentLevel;
import com.cv_gn.model.Experience;
import com.cv_gn.model.JobPreference;
import com.cv_gn.model.JobTitle;
import com.cv_gn.model.OnlnCVHiberUtil;
import com.cv_gn.model.Person;
import com.cv_gn.model.PersonContactMode;
import com.cv_gn.model.PersonStatus;
import com.cv_gn.model.PersonTitle;
import com.cv_gn.model.ProfessionalQualification;
import com.cv_gn.model.Referee;
import com.cv_gn.model.RefereeRelationship;
import com.cv_gn.model.Sector;
import com.cv_gn.model.Skill;
import com.cv_gn.model.SkillLevel;
import com.cv_gn.model.SkillPerson;
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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ganith Perera
 */
public class PersonDAOImpl {

    Session session = OnlnCVHiberUtil.getSessionFactory().openSession();

    public String addPerson(User user, Person person, PersonStatus personStatus, PersonTitle personTitle, PersonContactMode pcm) {
        // Open Database Connection
        session = OnlnCVHiberUtil.getSessionFactory().openSession();

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
            user.setPassword(ManagerDAO.encrypt(user.getPassword()));

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

            return "" + person.getIdPerson();
        } catch (Exception ex) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "";
    }

    public String addJobPreference(Integer personID, JobTitle jobTitle) {
        JobTitle jt = (JobTitle) session.load(JobTitle.class, jobTitle.getIdJobTitle());
        Person p = (Person) session.load(Person.class, personID);
        Transaction tr = session.beginTransaction();
        JobPreference jobPreference = new JobPreference(jt, p);
        session.save(jobPreference);
        tr.commit();
        session.close();

        return "success";
    }

    public Person getPersonFromUser(User usr) {
        Criteria cr = session.createCriteria(Person.class);
        cr.add(Restrictions.eq("user", usr));
        Person p = (Person) cr.uniqueResult();
        return p;
    }

    public String addEduQualification(EducationalQualification eq, Person p, EducationLevel el, User usr) {

        try {
            Transaction tr = session.beginTransaction();
            EducationLevel educationLevel = (EducationLevel) session.load(EducationLevel.class, el.getIdEducationLevel());
            eq.setEducationLevel(educationLevel);

            // Person prsn = new PersonDAOImpl().getPersonFromUser(usr, p);
            //System.out.println("person found"+person.getUser().getUsername());
            eq.setPerson(p);
            session.save(eq);
            tr.commit();
            session.close();
            return "success";
        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    public List<EducationalQualification> loadEduQualification(User usr) {

        try {
            Person prsn = new PersonDAOImpl().getPersonFromUser(usr);
            Criteria createCriteria = session.createCriteria(EducationalQualification.class);
            createCriteria.add(Restrictions.eq("person", prsn));
            return createCriteria.list();

        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public String addProfQualification(ProfessionalQualification pq, Person person, Sector sector) {

        try {
            Transaction tr = session.beginTransaction();
            Sector s = (Sector) session.load(Sector.class, sector.getIdSector());
            pq.setPerson(person);
            pq.setSector(s);
            session.save(pq);
            tr.commit();
            session.close();
            return "success";
        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    public List<ProfessionalQualification> loadProfQualification(User usr) {

        try {
            Person prsn = new PersonDAOImpl().getPersonFromUser(usr);
            Criteria createCriteria = session.createCriteria(ProfessionalQualification.class);
            createCriteria.add(Restrictions.eq("person", prsn));
            return createCriteria.list();

        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public String addExperience(Experience exp, Person person, JobTitle jobTitle) {

        try {
            Transaction tr = session.beginTransaction();
            JobTitle jt = (JobTitle) session.load(JobTitle.class, jobTitle.getIdJobTitle());
            exp.setPerson(person);
            exp.setJobTitle(jt);
            session.save(exp);
            tr.commit();
            session.close();
            return "success";
        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    public List<Experience> loadExperience(User usr) {

        try {
            Person prsn = new PersonDAOImpl().getPersonFromUser(usr);
            Criteria createCriteria = session.createCriteria(Experience.class);
            createCriteria.add(Restrictions.eq("person", prsn));
            return createCriteria.list();

        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public String addSkill(Person person, Skill skill, SkillLevel skillLevel) {

        try {
            Transaction tr = session.beginTransaction();
            SkillPerson skillPerson = new SkillPerson();
            skillPerson.setSkill(skill);
            skillPerson.setSkillLevel(skillLevel);
            skillPerson.setHowVerified("");
            skillPerson.setVerified(true);
            skillPerson.setPerson(person);

            session.save(skillPerson);
            tr.commit();
            session.close();
            return "success";
        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    public List<SkillPerson> loadSkills(User usr) {

        try {
            Person prsn = new PersonDAOImpl().getPersonFromUser(usr);
            Criteria createCriteria = session.createCriteria(SkillPerson.class);
            createCriteria.add(Restrictions.eq("person", prsn));
            return createCriteria.list();

        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public String addReferee(Person person, Referee referee, RefereeRelationship rel) {

        try {
            Transaction tr = session.beginTransaction();
            RefereeRelationship relationship = (RefereeRelationship) session.load(RefereeRelationship.class, rel.getIdrefereeRelationship());
            referee.setRefereeRelationship(relationship);
            session.save(referee);
            tr.commit();
            session.close();
            return "success";
        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return "";
    }

    public List<Referee> loadReferees(User usr) {

        try {
            Person prsn = new PersonDAOImpl().getPersonFromUser(usr);
            Criteria createCriteria = session.createCriteria(Referee.class);
            createCriteria.add(Restrictions.eq("person", prsn));
            return createCriteria.list();

        } catch (Exception e) {
            Logger.getLogger(PersonDAOImpl.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
