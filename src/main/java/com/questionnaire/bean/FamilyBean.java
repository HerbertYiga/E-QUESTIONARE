package com.questionnaire.bean;







import org.hibernate.validator.constraints.NotEmpty;

public class FamilyBean {
	// form three
    @NotEmpty(message="please insert value")
	private String hasFatherDiagnosedWithProstrateCancer;
    @NotEmpty(message="please insert value")
	private String ageOfFatherDiagnosis;
    @NotEmpty(message="please insert value")
	private String brothersWithProstrateCancer;
    @NotEmpty(message="please insert value")
	private String brothers;
    @NotEmpty(message="please insert value")
	private String beforeAgeOfSixty;


	
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



}
