package com.cv_gn.model;
// Generated May 1, 2017 11:12:07 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Experience generated by hbm2java
 */
public class Experience  implements java.io.Serializable {


     private Integer idExperience;
     private EmploymentLevel employmentLevel;
     private JobTitle jobTitle;
     private Person person;
     private Date dateStarted;
     private Date dateFinished;
     private String otherJobTitle;
     private String keyDuties;
     private String employerName;
     private Boolean verified;
     private String howVerified;

    public Experience() {
    }

	
    public Experience(EmploymentLevel employmentLevel, JobTitle jobTitle, Person person, Date dateStarted) {
        this.employmentLevel = employmentLevel;
        this.jobTitle = jobTitle;
        this.person = person;
        this.dateStarted = dateStarted;
    }
    public Experience(EmploymentLevel employmentLevel, JobTitle jobTitle, Person person, Date dateStarted, Date dateFinished, String otherJobTitle, String keyDuties, String employerName, Boolean verified, String howVerified) {
       this.employmentLevel = employmentLevel;
       this.jobTitle = jobTitle;
       this.person = person;
       this.dateStarted = dateStarted;
       this.dateFinished = dateFinished;
       this.otherJobTitle = otherJobTitle;
       this.keyDuties = keyDuties;
       this.employerName = employerName;
       this.verified = verified;
       this.howVerified = howVerified;
    }
   
    public Integer getIdExperience() {
        return this.idExperience;
    }
    
    public void setIdExperience(Integer idExperience) {
        this.idExperience = idExperience;
    }
    public EmploymentLevel getEmploymentLevel() {
        return this.employmentLevel;
    }
    
    public void setEmploymentLevel(EmploymentLevel employmentLevel) {
        this.employmentLevel = employmentLevel;
    }
    public JobTitle getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public Date getDateStarted() {
        return this.dateStarted;
    }
    
    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }
    public Date getDateFinished() {
        return this.dateFinished;
    }
    
    public void setDateFinished(Date dateFinished) {
        this.dateFinished = dateFinished;
    }
    public String getOtherJobTitle() {
        return this.otherJobTitle;
    }
    
    public void setOtherJobTitle(String otherJobTitle) {
        this.otherJobTitle = otherJobTitle;
    }
    public String getKeyDuties() {
        return this.keyDuties;
    }
    
    public void setKeyDuties(String keyDuties) {
        this.keyDuties = keyDuties;
    }
    public String getEmployerName() {
        return this.employerName;
    }
    
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }
    public Boolean getVerified() {
        return this.verified;
    }
    
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
    public String getHowVerified() {
        return this.howVerified;
    }
    
    public void setHowVerified(String howVerified) {
        this.howVerified = howVerified;
    }




}


