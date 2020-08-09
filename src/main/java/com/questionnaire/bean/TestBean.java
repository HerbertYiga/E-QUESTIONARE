package com.questionnaire.bean;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class TestBean {
	
	
    @NotNull(message="please insert number of sexual partners")
	private Integer sexualPartners;
    @NotNull(message="please insert weight")
	private Integer weight;
    @NotNull(message="please insert feet")
	private Integer feet;
    @NotNull(message="please insert inches")
	private Integer inches;
    @NotEmpty(message="please insert value")
	private String circumsised;
    @NotEmpty(message="please insert full Names")
	private String hadVasectomy;
    @NotEmpty(message="please insert value")
    private String diagnosedOfStd;
    @NotNull(message="please insert age of vesoctomy")
	private Integer ageofvesectomy;
    @NotNull(message="please insert value")
	private String diagnosedOfHiv;
    @NotNull(message="please insert age of Circumcision")
	private String ageOfCircumsion;
    @NotNull(message="please insert value")
	private String aboutCancerFromDoctr;
    @NotEmpty(message="please insert cancertypes and ages")
	private String cancerTypeAndAge;

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


}
