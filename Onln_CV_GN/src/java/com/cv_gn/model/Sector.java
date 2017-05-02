package com.cv_gn.model;
// Generated May 1, 2017 11:12:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sector generated by hbm2java
 */
public class Sector  implements java.io.Serializable {


     private Short idSector;
     private String sectorTitle;
     private Set<JobTitle> jobTitles = new HashSet<JobTitle>(0);
     private Set<ProfessionalQualification> professionalQualifications = new HashSet<ProfessionalQualification>(0);

    public Sector() {
    }

    public Sector(String sectorTitle, Set<JobTitle> jobTitles, Set<ProfessionalQualification> professionalQualifications) {
       this.sectorTitle = sectorTitle;
       this.jobTitles = jobTitles;
       this.professionalQualifications = professionalQualifications;
    }
   
    public Short getIdSector() {
        return this.idSector;
    }
    
    public void setIdSector(Short idSector) {
        this.idSector = idSector;
    }
    public String getSectorTitle() {
        return this.sectorTitle;
    }
    
    public void setSectorTitle(String sectorTitle) {
        this.sectorTitle = sectorTitle;
    }
    public Set<JobTitle> getJobTitles() {
        return this.jobTitles;
    }
    
    public void setJobTitles(Set<JobTitle> jobTitles) {
        this.jobTitles = jobTitles;
    }
    public Set<ProfessionalQualification> getProfessionalQualifications() {
        return this.professionalQualifications;
    }
    
    public void setProfessionalQualifications(Set<ProfessionalQualification> professionalQualifications) {
        this.professionalQualifications = professionalQualifications;
    }




}


