package com.cv_gn.model;
// Generated May 1, 2017 11:12:07 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person implements java.io.Serializable {


     private Integer idPerson;
     private EmploymentLevel employmentLevel;
     private PersonContactMode personContactMode;
     private PersonStatus personStatus;
     private PersonTitle personTitle;
     private User user;
     private String forename1;
     private String forename2;
     private String surname;
     private String addressLine1;
     private String addressLine2;
     private String town;
     private String postcode;
     private String secondEmail;
     private String personalUrl;
     private String photo;
     private Boolean female;
     private String postcodeStart;
     private String authorityToWorkStatement;
     private Short noOfGcses;
     private String gcseEnglishGrade;
     private String gcseMathsGrade;
     private Boolean fiveOrMoreGcses;
     private Short noOfAlevels;
     private Short ucasPoints;
     private String mobile;
     private String landline;
     private Date dob;
     private Short penaltyPoints;
     private Set<Referee> referees = new HashSet<Referee>(0);
     private Set<SkillPerson> skillPersons = new HashSet<SkillPerson>(0);
     private Set<EducationalQualification> educationalQualifications = new HashSet<EducationalQualification>(0);
     private Set<Experience> experiences = new HashSet<Experience>(0);
     private Set<ProfessionalQualification> professionalQualifications = new HashSet<ProfessionalQualification>(0);
     private Set<JobPreference> jobPreferences = new HashSet<JobPreference>(0);

    public Person() {
    }

	
    public Person(EmploymentLevel employmentLevel, PersonContactMode personContactMode, PersonStatus personStatus, PersonTitle personTitle, User user, String forename1, String surname) {
        this.employmentLevel = employmentLevel;
        this.personContactMode = personContactMode;
        this.personStatus = personStatus;
        this.personTitle = personTitle;
        this.user = user;
        this.forename1 = forename1;
        this.surname = surname;
    }
    public Person(EmploymentLevel employmentLevel, PersonContactMode personContactMode, PersonStatus personStatus, PersonTitle personTitle, User user, String forename1, String forename2, String surname, String addressLine1, String addressLine2, String town, String postcode, String secondEmail, String personalUrl, String photo, Boolean female, String postcodeStart, String authorityToWorkStatement, Short noOfGcses, String gcseEnglishGrade, String gcseMathsGrade, Boolean fiveOrMoreGcses, Short noOfAlevels, Short ucasPoints, String mobile, String landline, Date dob, Short penaltyPoints, Set<Referee> referees, Set<SkillPerson> skillPersons, Set<EducationalQualification> educationalQualifications, Set<Experience> experiences, Set<ProfessionalQualification> professionalQualifications, Set<JobPreference> jobPreferences) {
       this.employmentLevel = employmentLevel;
       this.personContactMode = personContactMode;
       this.personStatus = personStatus;
       this.personTitle = personTitle;
       this.user = user;
       this.forename1 = forename1;
       this.forename2 = forename2;
       this.surname = surname;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.town = town;
       this.postcode = postcode;
       this.secondEmail = secondEmail;
       this.personalUrl = personalUrl;
       this.photo = photo;
       this.female = female;
       this.postcodeStart = postcodeStart;
       this.authorityToWorkStatement = authorityToWorkStatement;
       this.noOfGcses = noOfGcses;
       this.gcseEnglishGrade = gcseEnglishGrade;
       this.gcseMathsGrade = gcseMathsGrade;
       this.fiveOrMoreGcses = fiveOrMoreGcses;
       this.noOfAlevels = noOfAlevels;
       this.ucasPoints = ucasPoints;
       this.mobile = mobile;
       this.landline = landline;
       this.dob = dob;
       this.penaltyPoints = penaltyPoints;
       this.referees = referees;
       this.skillPersons = skillPersons;
       this.educationalQualifications = educationalQualifications;
       this.experiences = experiences;
       this.professionalQualifications = professionalQualifications;
       this.jobPreferences = jobPreferences;
    }
   
    public Integer getIdPerson() {
        return this.idPerson;
    }
    
    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }
    public EmploymentLevel getEmploymentLevel() {
        return this.employmentLevel;
    }
    
    public void setEmploymentLevel(EmploymentLevel employmentLevel) {
        this.employmentLevel = employmentLevel;
    }
    public PersonContactMode getPersonContactMode() {
        return this.personContactMode;
    }
    
    public void setPersonContactMode(PersonContactMode personContactMode) {
        this.personContactMode = personContactMode;
    }
    public PersonStatus getPersonStatus() {
        return this.personStatus;
    }
    
    public void setPersonStatus(PersonStatus personStatus) {
        this.personStatus = personStatus;
    }
    public PersonTitle getPersonTitle() {
        return this.personTitle;
    }
    
    public void setPersonTitle(PersonTitle personTitle) {
        this.personTitle = personTitle;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getForename1() {
        return this.forename1;
    }
    
    public void setForename1(String forename1) {
        this.forename1 = forename1;
    }
    public String getForename2() {
        return this.forename2;
    }
    
    public void setForename2(String forename2) {
        this.forename2 = forename2;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getTown() {
        return this.town;
    }
    
    public void setTown(String town) {
        this.town = town;
    }
    public String getPostcode() {
        return this.postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getSecondEmail() {
        return this.secondEmail;
    }
    
    public void setSecondEmail(String secondEmail) {
        this.secondEmail = secondEmail;
    }
    public String getPersonalUrl() {
        return this.personalUrl;
    }
    
    public void setPersonalUrl(String personalUrl) {
        this.personalUrl = personalUrl;
    }
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Boolean getFemale() {
        return this.female;
    }
    
    public void setFemale(Boolean female) {
        this.female = female;
    }
    public String getPostcodeStart() {
        return this.postcodeStart;
    }
    
    public void setPostcodeStart(String postcodeStart) {
        this.postcodeStart = postcodeStart;
    }
    public String getAuthorityToWorkStatement() {
        return this.authorityToWorkStatement;
    }
    
    public void setAuthorityToWorkStatement(String authorityToWorkStatement) {
        this.authorityToWorkStatement = authorityToWorkStatement;
    }
    public Short getNoOfGcses() {
        return this.noOfGcses;
    }
    
    public void setNoOfGcses(Short noOfGcses) {
        this.noOfGcses = noOfGcses;
    }
    public String getGcseEnglishGrade() {
        return this.gcseEnglishGrade;
    }
    
    public void setGcseEnglishGrade(String gcseEnglishGrade) {
        this.gcseEnglishGrade = gcseEnglishGrade;
    }
    public String getGcseMathsGrade() {
        return this.gcseMathsGrade;
    }
    
    public void setGcseMathsGrade(String gcseMathsGrade) {
        this.gcseMathsGrade = gcseMathsGrade;
    }
    public Boolean getFiveOrMoreGcses() {
        return this.fiveOrMoreGcses;
    }
    
    public void setFiveOrMoreGcses(Boolean fiveOrMoreGcses) {
        this.fiveOrMoreGcses = fiveOrMoreGcses;
    }
    public Short getNoOfAlevels() {
        return this.noOfAlevels;
    }
    
    public void setNoOfAlevels(Short noOfAlevels) {
        this.noOfAlevels = noOfAlevels;
    }
    public Short getUcasPoints() {
        return this.ucasPoints;
    }
    
    public void setUcasPoints(Short ucasPoints) {
        this.ucasPoints = ucasPoints;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getLandline() {
        return this.landline;
    }
    
    public void setLandline(String landline) {
        this.landline = landline;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Short getPenaltyPoints() {
        return this.penaltyPoints;
    }
    
    public void setPenaltyPoints(Short penaltyPoints) {
        this.penaltyPoints = penaltyPoints;
    }
    public Set<Referee> getReferees() {
        return this.referees;
    }
    
    public void setReferees(Set<Referee> referees) {
        this.referees = referees;
    }
    public Set<SkillPerson> getSkillPersons() {
        return this.skillPersons;
    }
    
    public void setSkillPersons(Set<SkillPerson> skillPersons) {
        this.skillPersons = skillPersons;
    }
    public Set<EducationalQualification> getEducationalQualifications() {
        return this.educationalQualifications;
    }
    
    public void setEducationalQualifications(Set<EducationalQualification> educationalQualifications) {
        this.educationalQualifications = educationalQualifications;
    }
    public Set<Experience> getExperiences() {
        return this.experiences;
    }
    
    public void setExperiences(Set<Experience> experiences) {
        this.experiences = experiences;
    }
    public Set<ProfessionalQualification> getProfessionalQualifications() {
        return this.professionalQualifications;
    }
    
    public void setProfessionalQualifications(Set<ProfessionalQualification> professionalQualifications) {
        this.professionalQualifications = professionalQualifications;
    }
    public Set<JobPreference> getJobPreferences() {
        return this.jobPreferences;
    }
    
    public void setJobPreferences(Set<JobPreference> jobPreferences) {
        this.jobPreferences = jobPreferences;
    }

    public void setDob(String birthDay) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}


