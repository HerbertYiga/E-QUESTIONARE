package com.questionnaire.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class PersonDetailsBean {
  
	
	private Integer age;
	
	@NotEmpty(message = "please insert sex")
	private String sex;

	private String psaTest;
	
	private Integer interviewNo;
	
	private Integer gleasonScore;
	
	@NotEmpty(message = "please insert patient No")
	private String patientNo;
	
	@NotEmpty(message = "please specimen No")
	private String specimenNo;
	
	@NotEmpty(message = "please insert date of visit")
	private String dov;//date of visit

	private Integer interviewersNo;
	
	@NotEmpty(message = "please insert date of entered")
	private String de;//date entered
	
	@NotEmpty(message = "please insert primary doctors no")
	private String priDRName;
	
	
	@NotEmpty(message = "please insert primary lab No")
	private String labNo;
	

	private Integer particpantIdNo;
	
	private Integer respondentId;
	// form one variables
	@NotEmpty(message = "please insert full Names")
	private String fullNames;
	@NotEmpty(message = "please insert date of birth")
	private String dob;
	@NotEmpty(message = "please insert level of education")
	private String levelOfEduc;
	@NotEmpty(message = "please insert ocuppation held")
	private String occupationHeld;
	@NotEmpty(message = "please insert  tribe")
	private String yourTribe;
	@NotEmpty(message = "please insert  fathers tribe")
	private String fathersTribe;
	@NotEmpty(message = "please insert mothers tribe")
	private String mothersTribe;

	// setters and getters of form one
	public String getFullNames() {
		return fullNames;
	}

	public void setFullNames(String fullNames) {
		this.fullNames = fullNames;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMothersTribe() {
		return mothersTribe;
	}

	public void setMothersTribe(String mothersTribe) {
		this.mothersTribe = mothersTribe;
	}

	public String getLevelOfEduc() {
		return levelOfEduc;
	}

	public void setLevelOfEduc(String levelOfEduc) {
		this.levelOfEduc = levelOfEduc;
	}

	public String getOccupationHeld() {
		return occupationHeld;
	}

	public void setOccupationHeld(String occupationHeld) {
		this.occupationHeld = occupationHeld;
	}

	public String getYourTribe() {
		return yourTribe;
	}

	public void setYourTribe(String yourTribe) {
		this.yourTribe = yourTribe;
	}

	public String getFathersTribe() {
		return fathersTribe;
	}

	public void setFathersTribe(String fathersTribe) {
		this.fathersTribe = fathersTribe;
	}

	// end of the getters and setters for form one
	public Integer getRespondentId() {
		return respondentId;
	}

	public void setRespondentId(Integer respondentId) {
		this.respondentId = respondentId;
	}

	public String getPsaTest() {
		return psaTest;
	}

	public void setPsaTest(String psaTest) {
		this.psaTest = psaTest;
	}

	public Integer getGleasonScore() {
		return gleasonScore;
	}

	public void setGleasonScore(Integer gleasonScore) {
		this.gleasonScore = gleasonScore;
	}

	public String getLabNo() {
		return labNo;
	}

	public void setLabNo(String labNo) {
		this.labNo = labNo;
	}

	public Integer getParticpantIdNo() {
		return particpantIdNo;
	}

	public void setParticpantIdNo(Integer particpantIdNo) {
		this.particpantIdNo = particpantIdNo;
	}

	public String getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(String patientNo) {
		this.patientNo = patientNo;
	}

	public String getSpecimenNo() {
		return specimenNo;
	}

	public void setSpecimenNo(String specimenNo) {
		this.specimenNo = specimenNo;
	}

	public String getDov() {
		return dov;
	}

	public void setDov(String dov) {
		this.dov = dov;
	}

	public Integer getInterviewersNo() {
		return interviewersNo;
	}

	public void setInterviewersNo(Integer interviewersNo) {
		this.interviewersNo = interviewersNo;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPriDRName() {
		return priDRName;
	}

	public void setPriDRName(String priDRName) {
		this.priDRName = priDRName;
	}

	public Integer getInterviewNo() {
		return interviewNo;
	}

	public void setInterviewNo(Integer interviewNo) {
		this.interviewNo = interviewNo;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


}
