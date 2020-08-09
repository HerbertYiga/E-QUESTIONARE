package com.questionnaire.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class RespondentBean {

	private Integer psaTest;
	private String sex;
	private Integer age;

	private Integer gleasonScore;

	private String patientNo;

	private String specimenNo;

	private String dov;// date of visit

	private String de;// date entered

	private String priDRName;

	private String labNo;
	private Integer interviewNo;

	private Integer particpantIdNo;

	// form three

	private String hasFatherDiagnosedWithProstrateCancer;
	private String ageOfFatherDiagnosis;
	private String brothersWithProstrateCancer;
	private String brothers;
	private String beforeAgeOfSixty;

	// form two variables
	@NotNull(message = "please insert number of sexual partners")
	private Integer sexualPartners;
	@NotNull(message = "please insert weight")
	private Integer weight;
	@NotNull(message = "please insert feet")
	private Integer feet;
	@NotNull(message = "please insert inches")
	private Integer inches;
	@NotEmpty(message = "please insert value")
	private String circumsised;
	@NotEmpty(message = "please insert full Names")
	private String hadVasectomy;
	@NotEmpty(message = "please insert value")
	private String diagnosedOfStd;
	@NotNull(message = "please insert age of vesoctomy")
	private Integer ageofvesectomy;
	@NotNull(message = "please insert value")
	private String diagnosedOfHiv;
	@NotNull(message = "please insert age of Circumcision")
	private String ageOfCircumsion;
	@NotNull(message = "please insert value")
	private String aboutCancerFromDoctr;
	@NotEmpty(message = "please insert cancertypes and ages")
	private String cancerTypeAndAge;

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
	// setters and getters for formm two

	public Integer getSexualPartners() {
		return sexualPartners;
	}

	public void setSexualPartners(Integer sexualPartners) {
		this.sexualPartners = sexualPartners;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getFeet() {
		return feet;
	}

	public void setFeet(Integer feet) {
		this.feet = feet;
	}

	public Integer getInches() {
		return inches;
	}

	public void setInches(Integer inches) {
		this.inches = inches;
	}

	public String getCircumsised() {
		return circumsised;
	}

	public void setCircumsised(String circumsised) {
		this.circumsised = circumsised;
	}

	public String getHadVasectomy() {
		return hadVasectomy;
	}

	public void setHadVasectomy(String hadVasectomy) {
		this.hadVasectomy = hadVasectomy;
	}

	public Integer getAgeofvesectomy() {
		return ageofvesectomy;
	}

	public void setAgeofvesectomy(Integer ageofvesectomy) {
		this.ageofvesectomy = ageofvesectomy;
	}

	public String getDiagnosedOfHiv() {
		return diagnosedOfHiv;
	}

	public void setDiagnosedOfHiv(String diagnosedOfHiv) {
		this.diagnosedOfHiv = diagnosedOfHiv;
	}

	public String getAgeOfCircumsion() {
		return ageOfCircumsion;
	}

	public void setAgeOfCircumsion(String ageOfCircumsion) {
		this.ageOfCircumsion = ageOfCircumsion;
	}

	public String getAboutCancerFromDoctr() {
		return aboutCancerFromDoctr;
	}

	public void setAboutCancerFromDoctr(String aboutCancerFromDoctr) {
		this.aboutCancerFromDoctr = aboutCancerFromDoctr;
	}

	public String getCancerTypeAndAge() {
		return cancerTypeAndAge;
	}

	public void setCancerTypeAndAge(String cancerTypeAndAge) {
		this.cancerTypeAndAge = cancerTypeAndAge;
	}

	// form three
	public String getHasFatherDiagnosedWithProstrateCancer() {
		return hasFatherDiagnosedWithProstrateCancer;
	}

	public void setHasFatherDiagnosedWithProstrateCancer(String hasFatherDiagnosedWithProstrateCancer) {
		this.hasFatherDiagnosedWithProstrateCancer = hasFatherDiagnosedWithProstrateCancer;
	}

	public String getAgeOfFatherDiagnosis() {
		return ageOfFatherDiagnosis;
	}

	public void setAgeOfFatherDiagnosis(String ageOfFatherDiagnosis) {
		this.ageOfFatherDiagnosis = ageOfFatherDiagnosis;
	}

	public String getBrothersWithProstrateCancer() {
		return brothersWithProstrateCancer;
	}

	public void setBrothersWithProstrateCancer(String brothersWithProstrateCancer) {
		this.brothersWithProstrateCancer = brothersWithProstrateCancer;
	}

	public String getBrothers() {
		return brothers;
	}

	public void setBrothers(String brothers) {
		this.brothers = brothers;
	}

	public String getBeforeAgeOfSixty() {
		return beforeAgeOfSixty;
	}

	public void setBeforeAgeOfSixty(String beforeAgeOfSixty) {
		this.beforeAgeOfSixty = beforeAgeOfSixty;
	}

	public String getDiagnosedOfStd() {
		return diagnosedOfStd;
	}

	public void setDiagnosedOfStd(String diagnosedOfStd) {
		this.diagnosedOfStd = diagnosedOfStd;
	}

	public Integer getPsaTest() {
		return psaTest;
	}

	public void setPsaTest(Integer psaTest) {
		this.psaTest = psaTest;
	}

	public Integer getGleasonScore() {
		return gleasonScore;
	}

	public void setGleasonScore(Integer gleasonScore) {
		this.gleasonScore = gleasonScore;
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

	public Integer getInterviewNo() {
		return interviewNo;
	}

	public void setInterviewNo(Integer interviewNo) {
		this.interviewNo = interviewNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
