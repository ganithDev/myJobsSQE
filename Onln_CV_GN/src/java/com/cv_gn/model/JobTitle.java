package com.cv_gn.model;
// Generated May 1, 2017 11:12:07 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * JobTitle generated by hbm2java
 */
public class JobTitle  implements java.io.Serializable {


     private Short idJobTitle;
     private Sector sector;
     private String jobTitle;
     private Set<Experience> experiences = new HashSet<Experience>(0);
     private Set<JobPreference> jobPreferences = new HashSet<JobPreference>(0);

    public JobTitle() {
    }

	
    public JobTitle(Sector sector) {
        this.sector = sector;
    }
    public JobTitle(Sector sector, String jobTitle, Set<Experience> experiences, Set<JobPreference> jobPreferences) {
       this.sector = sector;
       this.jobTitle = jobTitle;
       this.experiences = experiences;
       this.jobPreferences = jobPreferences;
    }
   
    public Short getIdJobTitle() {
        return this.idJobTitle;
    }
    
    public void setIdJobTitle(Short idJobTitle) {
        this.idJobTitle = idJobTitle;
    }
    public Sector getSector() {
        return this.sector;
    }
    
    public void setSector(Sector sector) {
        this.sector = sector;
    }
    public String getJobTitle() {
        return this.jobTitle;
    }
    
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public Set<Experience> getExperiences() {
        return this.experiences;
    }
    
    public void setExperiences(Set<Experience> experiences) {
        this.experiences = experiences;
    }
    public Set<JobPreference> getJobPreferences() {
        return this.jobPreferences;
    }
    
    public void setJobPreferences(Set<JobPreference> jobPreferences) {
        this.jobPreferences = jobPreferences;
    }




}


