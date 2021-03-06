package com.cv_gn.model;
// Generated May 1, 2017 11:12:07 PM by Hibernate Tools 4.3.1



/**
 * SkillPerson generated by hbm2java
 */
public class SkillPerson  implements java.io.Serializable {


     private int idSkillPerson;
     private Person person;
     private Skill skill;
     private SkillLevel skillLevel;
     private Boolean verified;
     private String howVerified;

    public SkillPerson() {
    }

	
    public SkillPerson(int idSkillPerson, Person person, Skill skill, SkillLevel skillLevel) {
        this.idSkillPerson = idSkillPerson;
        this.person = person;
        this.skill = skill;
        this.skillLevel = skillLevel;
    }
    public SkillPerson(int idSkillPerson, Person person, Skill skill, SkillLevel skillLevel, Boolean verified, String howVerified) {
       this.idSkillPerson = idSkillPerson;
       this.person = person;
       this.skill = skill;
       this.skillLevel = skillLevel;
       this.verified = verified;
       this.howVerified = howVerified;
    }
   
    public int getIdSkillPerson() {
        return this.idSkillPerson;
    }
    
    public void setIdSkillPerson(int idSkillPerson) {
        this.idSkillPerson = idSkillPerson;
    }
    public Person getPerson() {
        return this.person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    public Skill getSkill() {
        return this.skill;
    }
    
    public void setSkill(Skill skill) {
        this.skill = skill;
    }
    public SkillLevel getSkillLevel() {
        return this.skillLevel;
    }
    
    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
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


