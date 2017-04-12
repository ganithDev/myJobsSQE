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


import java.util.Date;

/**
 * ProfessionalQualification generated by hbm2java
 */
public class ProfessionalQualification  implements java.io.Serializable {


     private Integer idProfessionalQualification;
     private Person person;
     private Sector sector;
     private String qualificationName;
     private String awardingBody;
     private Date yearObtained;
     private String classification;
     private Boolean verified;
     private String howVerified;

    public ProfessionalQualification() {
    }

	
    public ProfessionalQualification(Person person, Sector sector, String qualificationName) {
        this.person = person;
        this.sector = sector;
        this.qualificationName = qualificationName;
    }
    public ProfessionalQualification(Person person, Sector sector, String qualificationName, String awardingBody, Date yearObtained, String classification, Boolean verified, String howVerified) {
       this.person = person;
       this.sector = sector;
       this.qualificationName = qualificationName;
       this.awardingBody = awardingBody;
       this.yearObtained = yearObtained;
       this.classification = classification;
       this.verified = verified;
       this.howVerified = howVerified;
    }
   
    public Integer getIdProfessionalQualification() {
        return this.idProfessionalQualification;
    }
    
    public void setIdProfessionalQualification(Integer idProfessionalQualification) {
        this.idProfessionalQualification = idProfessionalQualification;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public Sector getSector() {
        return this.sector;
    }
    
    public void setSector(Sector sector) {
        this.sector = sector;
    }
    public String getQualificationName() {
        return this.qualificationName;
    }
    
    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }
    public String getAwardingBody() {
        return this.awardingBody;
    }
    
    public void setAwardingBody(String awardingBody) {
        this.awardingBody = awardingBody;
    }
    public Date getYearObtained() {
        return this.yearObtained;
    }
    
    public void setYearObtained(Date yearObtained) {
        this.yearObtained = yearObtained;
    }
    public String getClassification() {
        return this.classification;
    }
    
    public void setClassification(String classification) {
        this.classification = classification;
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


