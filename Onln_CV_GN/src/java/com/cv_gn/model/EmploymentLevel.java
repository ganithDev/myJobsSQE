/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cv_gn.model;

/**
 *
 * @author Ganith Perera
 */
// Generated Apr 10, 2017 11:21:51 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * EmploymentLevel generated by hbm2java
 */
public class EmploymentLevel  implements java.io.Serializable {


     private Short idLevelOfEmployment;
     private String employmentLevel;
     private Set<Experience> experiences = new HashSet<Experience>(0);
     private Set<Person> persons = new HashSet<Person>(0);

    public EmploymentLevel() {
    }

	
    public EmploymentLevel(String employmentLevel) {
        this.employmentLevel = employmentLevel;
    }
    public EmploymentLevel(String employmentLevel, Set<Experience> experiences, Set<Person> persons) {
       this.employmentLevel = employmentLevel;
       this.experiences = experiences;
       this.persons = persons;
    }
   
    public Short getIdLevelOfEmployment() {
        return this.idLevelOfEmployment;
    }
    
    public void setIdLevelOfEmployment(Short idLevelOfEmployment) {
        this.idLevelOfEmployment = idLevelOfEmployment;
    }
    public String getEmploymentLevel() {
        return this.employmentLevel;
    }
    
    public void setEmploymentLevel(String employmentLevel) {
        this.employmentLevel = employmentLevel;
    }
    public Set<Experience> getExperiences() {
        return this.experiences;
    }
    
    public void setExperiences(Set<Experience> experiences) {
        this.experiences = experiences;
    }
    public Set<Person> getPersons() {
        return this.persons;
    }
    
    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }




}


