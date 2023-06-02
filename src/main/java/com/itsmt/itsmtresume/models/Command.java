package com.itsmt.itsmtresume.models;


public class Command {
	private User user;
	private School school;
	private Skills skills;
	private WorkExperience workExperience;
	private SchoolExperience schoolExperience;
	
	public Command(User user, School school, Skills skills, WorkExperience workExperience,
			SchoolExperience schoolExperience) {
		super();
		this.user = user;
		this.school = school;
		this.skills = skills;
		this.workExperience = workExperience;
		this.schoolExperience = schoolExperience;
	}
	public Command() {
		super();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public WorkExperience getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}
	public SchoolExperience getSchoolExperience() {
		return schoolExperience;
	}
	public void setSchoolExperience(SchoolExperience schoolExperience) {
		this.schoolExperience = schoolExperience;
	}
	
	

}
