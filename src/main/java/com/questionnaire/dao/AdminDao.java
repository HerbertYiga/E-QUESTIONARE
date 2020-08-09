package com.questionnaire.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import com.questionnaire.bean.FamilyBean;
import com.questionnaire.bean.MedicalAndBehaviourBean;
import com.questionnaire.bean.PersonDetailsBean;
import com.questionnaire.bean.RespondentBean;
import com.questionnaire.bean.UserBean;

public class AdminDao {

	JdbcTemplate template;

	// setter method for the jdbc template
	public void setTemplate(JdbcTemplate template) {

		this.template = template;
	}

	// getting all details
	public List<RespondentBean> getAllDetails() {

		return this.template.query(
				"behavioralhistry.sexualPartners,familyhistory.hasFatherDiagnosedWithProstrateCancer,familyhistory.ageOfFatherDiagnosis,familyhistory.brothersWithProstrateCancer,familyhistory.brothers,familyhistory.beforeAgeOfSixty,medicalhistory.weight,medicalhistory.feet,medicalhistory.inches,medicalhistory.circumsised,medicalhistory.hadVasectomy,medicalhistory.ageofvesectomy,medicalhistory.diagnosedOfHiv,medicalhistory.aboutCancerFromDoctr,medicalhistory.cancerTypeAndAge ,medicalhistory.ageOfCircumsion,medicalhistory.diagnosedOfStd, persondetails.fullNames,persondetails.levelOfEduc,persondetails.occupationHeld,persondetails.yourTribe,persondetails.fathersTribe,persondetails.mothersTribe,persondetails.dob from persondetails INNER JOIN behavioralhistry ON persondetails.respondentId=behavioralhistry.respondentId INNER JOIN familyhistory ON  persondetails.respondentId=familyhistory.respondentId INNER JOIN medicalhistory ON persondetails.respondentId =medicalhistory.respondentId",
				new RowMapper<RespondentBean>() {
					public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
						RespondentBean details = new RespondentBean();

						// person
						details.setRespondentId(rs.getInt("respondentId"));
						details.setFullNames(rs.getString("fullNames"));
						details.setLevelOfEduc(rs.getString("levelOfEduc"));

						details.setOccupationHeld(rs.getString("occupationHeld"));
						details.setYourTribe(rs.getString("yourTribe"));
						details.setFathersTribe(rs.getString("fathersTribe"));
						details.setMothersTribe(rs.getString("mothersTribe"));
						details.setDob(rs.getString("dob"));
						// family

						details.setHasFatherDiagnosedWithProstrateCancer(
								rs.getString("hasFatherDiagnosedWithProstrateCancer"));
						details.setAgeOfFatherDiagnosis(rs.getString("ageOfFatherDiagnosis"));
						details.setBrothersWithProstrateCancer(rs.getString("brothersWithProstrateCancer"));
						details.setBrothers(rs.getString("brothers"));
						details.setBeforeAgeOfSixty(rs.getString("beforeAgeOfSixty"));

						// medical
						details.setWeight(rs.getInt("weight"));
						details.setFeet(rs.getInt("feet"));
						details.setInches(rs.getInt("inches"));
						details.setCircumsised(rs.getString("circumsised"));
						details.setHadVasectomy(rs.getString("hadVasectomy"));
						details.setAgeofvesectomy(rs.getInt("ageofvesectomy"));
						details.setDiagnosedOfHiv(rs.getString("diagnosedOfHiv"));

						details.setAboutCancerFromDoctr(rs.getString("aboutCancerFromDoctr"));

						details.setCancerTypeAndAge(rs.getString("cancerTypeAndAge"));

						details.setAgeOfCircumsion(rs.getString("ageOfCircumsion"));

						details.setDiagnosedOfStd(rs.getString("diagnosedOfStd"));
						details.setSexualPartners(rs.getInt("sexualPartners"));

						// bevavioral

						return details;
					}
				});
	}

	// list of the medical details

	public List<RespondentBean> getMedicalDetails() {

		return this.template.query(
				"select medicalhistory.weight,medicalhistory.feet,medicalhistory.inches,medicalhistory.circumsised,medicalhistory.hadVasectomy,medicalhistory.ageofvesectomy,medicalhistory.diagnosedOfHiv,medicalhistory.aboutCancerFromDoctr,medicalhistory.cancerTypeAndAge,medicalhistory.ageOfCircumsion,medicalhistory.diagnosedOfStd,persondetails.fullNames  from medicalhistory INNER JOIN persondetails ON medicalhistory.respondentId=persondetails.respondentId ORDER BY  medicalhistory.medicalId DESC",
				new RowMapper<RespondentBean>() {
					public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
						RespondentBean medicaldetails = new RespondentBean();

						medicaldetails.setWeight(rs.getInt("weight"));
						medicaldetails.setFeet(rs.getInt("feet"));
						medicaldetails.setInches(rs.getInt("inches"));
						medicaldetails.setCircumsised(rs.getString("circumsised"));
						medicaldetails.setHadVasectomy(rs.getString("hadVasectomy"));
						medicaldetails.setAgeofvesectomy(rs.getInt("ageofvesectomy"));
						medicaldetails.setDiagnosedOfHiv(rs.getString("diagnosedOfHiv"));

						medicaldetails.setAboutCancerFromDoctr(rs.getString("aboutCancerFromDoctr"));

						medicaldetails.setCancerTypeAndAge(rs.getString("cancerTypeAndAge"));

						medicaldetails.setAgeOfCircumsion(rs.getString("ageOfCircumsion"));

						medicaldetails.setDiagnosedOfStd(rs.getString("diagnosedOfStd"));
						medicaldetails.setFullNames(rs.getString("fullNames"));

						return medicaldetails;
					}
				});
	}
// getting the family details 

	public List<RespondentBean> getFamilyDetails() {

		return this.template.query(
				"select persondetails.fullNames,familyhistory.hasFatherDiagnosedWithProstrateCancer,familyhistory.ageOfFatherDiagnosis,familyhistory.brothersWithProstrateCancer,familyhistory.brothers,familyhistory.beforeAgeOfSixty from familyhistory INNER JOIN persondetails ON familyhistory.respondentId=persondetails.respondentId ORDER BY  familyhistory.familyId DESC ",
				new RowMapper<RespondentBean>() {
					public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
						RespondentBean familydetails = new RespondentBean();

						familydetails.setFullNames(rs.getString("fullNames"));
						familydetails.setHasFatherDiagnosedWithProstrateCancer(
								rs.getString("hasFatherDiagnosedWithProstrateCancer"));
						familydetails.setAgeOfFatherDiagnosis(rs.getString("ageOfFatherDiagnosis"));
						familydetails.setBrothersWithProstrateCancer(rs.getString("brothersWithProstrateCancer"));
						familydetails.setBrothers(rs.getString("brothers"));
						familydetails.setBeforeAgeOfSixty(rs.getString("beforeAgeOfSixty"));

						return familydetails;
					}
				});
	}

	// getting the behavioral details list
	public List<RespondentBean> getBehavioralDetails() {

		return this.template.query(
				"select persondetails.fullNames,behavioralhistry.sexualPartners from behavioralhistry INNER JOIN persondetails ON behavioralhistry.respondentId=persondetails.respondentId ORDER BY  behavioralhistry.behavioralId ",
				new RowMapper<RespondentBean>() {
					public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
						RespondentBean personaldetails = new RespondentBean();

						personaldetails.setFullNames(rs.getString("fullNames"));
						personaldetails.setSexualPartners(rs.getInt("sexualPartners"));

						return personaldetails;
					}
				});
	}

	// getting the personal details list
	public List<RespondentBean> getPersonDetails() {

		return this.template.query("select * from persondetails", new RowMapper<RespondentBean>() {
			public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
				RespondentBean personaldetails = new RespondentBean();
				personaldetails.setRespondentId(rs.getInt("respondentId"));
				personaldetails.setFullNames(rs.getString("fullNames"));
				personaldetails.setLevelOfEduc(rs.getString("levelOfEduc"));

				personaldetails.setOccupationHeld(rs.getString("occupationHeld"));
				personaldetails.setYourTribe(rs.getString("yourTribe"));
				personaldetails.setFathersTribe(rs.getString("fathersTribe"));
				personaldetails.setMothersTribe(rs.getString("mothersTribe"));
				personaldetails.setDob(rs.getString("dob"));

				personaldetails.setAge(rs.getInt("age"));
				personaldetails.setSex(rs.getString("sex"));

				personaldetails.setPsaTest(rs.getInt("psaTest"));

				personaldetails.setGleasonScore(rs.getInt("gleasonScore"));

				personaldetails.setPatientNo(rs.getString("patientNo"));

				personaldetails.setSpecimenNo(rs.getString("specimenNo"));

				personaldetails.setDov(rs.getString("dov"));

				personaldetails.setDe(rs.getString("de"));

				personaldetails.setPriDRName(rs.getString("priDRName"));

				personaldetails.setLabNo(rs.getString("labNo"));

				personaldetails.setParticpantIdNo(rs.getInt("particpantIdNo"));

				personaldetails.setInterviewNo(rs.getInt("interviewNo"));

				return personaldetails;
			}
		});
	}

	// getting detailsfamily
	public List<RespondentBean> getFamilyDetailsByPage(int pageid, int total) {
		String sql = "select persondetails.fullNames,familyhistory.hasFatherDiagnosedWithProstrateCancer,familyhistory.ageOfFatherDiagnosis,familyhistory.brothersWithProstrateCancer,familyhistory.brothers,familyhistory.beforeAgeOfSixty from familyhistory INNER JOIN persondetails ON familyhistory.respondentId=persondetails.respondentId ORDER BY  familyhistory.familyId DESC limit "
				+ (pageid - 1) + "," + total;
		return template.query(sql, new RowMapper<RespondentBean>() {
			public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
				RespondentBean familydetails = new RespondentBean();

				familydetails.setFullNames(rs.getString("fullNames"));
				familydetails.setHasFatherDiagnosedWithProstrateCancer(
						rs.getString("hasFatherDiagnosedWithProstrateCancer"));
				familydetails.setAgeOfFatherDiagnosis(rs.getString("ageOfFatherDiagnosis"));
				familydetails.setBrothersWithProstrateCancer(rs.getString("brothersWithProstrateCancer"));
				familydetails.setBrothers(rs.getString("brothers"));
				familydetails.setBeforeAgeOfSixty(rs.getString("beforeAgeOfSixty"));

				return familydetails;
			}
		});
	}
	// getting the medical records

	public List<RespondentBean> getMedicalDetailsByPage(int pageid, int total) {
		String sql = "select medicalhistory.weight,medicalhistory.feet,medicalhistory.inches,medicalhistory.circumsised,medicalhistory.hadVasectomy,medicalhistory.ageofvesectomy,medicalhistory.diagnosedOfHiv,medicalhistory.aboutCancerFromDoctr,medicalhistory.cancerTypeAndAge,medicalhistory.ageOfCircumsion,medicalhistory.diagnosedOfStd,persondetails.fullNames  from medicalhistory INNER JOIN persondetails ON medicalhistory.respondentId=persondetails.respondentId ORDER BY  medicalhistory.medicalId DESC limit "
				+ (pageid - 1) + "," + total;
		return template.query(sql, new RowMapper<RespondentBean>() {
			public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
				RespondentBean medicaldetails = new RespondentBean();

				medicaldetails.setWeight(rs.getInt("weight"));
				medicaldetails.setFeet(rs.getInt("feet"));
				medicaldetails.setInches(rs.getInt("inches"));
				medicaldetails.setCircumsised(rs.getString("circumsised"));
				medicaldetails.setHadVasectomy(rs.getString("hadVasectomy"));
				medicaldetails.setAgeofvesectomy(rs.getInt("ageofvesectomy"));
				medicaldetails.setDiagnosedOfHiv(rs.getString("diagnosedOfHiv"));

				medicaldetails.setAboutCancerFromDoctr(rs.getString("aboutCancerFromDoctr"));

				medicaldetails.setCancerTypeAndAge(rs.getString("cancerTypeAndAge"));

				medicaldetails.setAgeOfCircumsion(rs.getString("ageOfCircumsion"));

				medicaldetails.setDiagnosedOfStd(rs.getString("diagnosedOfStd"));
				medicaldetails.setFullNames(rs.getString("fullNames"));

				return medicaldetails;
			}
		});
	}

	// getting behavioral details
	public List<RespondentBean> getBehavioralDetailsByPage(int pageid, int total) {
		String sql = "select persondetails.fullNames,behavioralhistry.sexualPartners from behavioralhistry INNER JOIN persondetails ON behavioralhistry.respondentId=persondetails.respondentId ORDER BY  behavioralhistry.behavioralId DESC limit "
				+ (pageid - 1) + "," + total;
		return template.query(sql, new RowMapper<RespondentBean>() {
			public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
				RespondentBean behaviraldetails = new RespondentBean();

				behaviraldetails.setSexualPartners(rs.getInt("sexualPartners"));
				behaviraldetails.setFullNames(rs.getString("fullNames"));

				return behaviraldetails;
			}
		});
	}

	// getting personal details
	public List<RespondentBean> getDetailsByPage(int pageid, int total) {
		String sql = "select * from persondetails ORDER BY  persondetails.respondentId DESC limit " + (pageid - 1) + ","
				+ total;
		return template.query(sql, new RowMapper<RespondentBean>() {
			public RespondentBean mapRow(ResultSet rs, int row) throws SQLException {
				RespondentBean personaldetails = new RespondentBean();
				personaldetails.setRespondentId(rs.getInt("respondentId"));
				personaldetails.setFullNames(rs.getString("fullNames"));
				personaldetails.setLevelOfEduc(rs.getString("levelOfEduc"));

				personaldetails.setOccupationHeld(rs.getString("occupationHeld"));
				personaldetails.setYourTribe(rs.getString("yourTribe"));
				personaldetails.setFathersTribe(rs.getString("fathersTribe"));
				personaldetails.setMothersTribe(rs.getString("mothersTribe"));
				personaldetails.setDob(rs.getString("dob"));

				personaldetails.setPsaTest(rs.getInt("psaTest"));

				personaldetails.setGleasonScore(rs.getInt("gleasonScore"));

				personaldetails.setPatientNo(rs.getString("patientNo"));

				personaldetails.setSpecimenNo(rs.getString("specimenNo"));

				personaldetails.setDov(rs.getString("dov"));

				personaldetails.setInterviewNo(rs.getInt("interviewNo"));

				personaldetails.setDe(rs.getString("de"));

				personaldetails.setPriDRName(rs.getString("priDRName"));

				personaldetails.setLabNo(rs.getString("labNo"));

				personaldetails.setParticpantIdNo(rs.getInt("particpantIdNo"));

				personaldetails.setSex(rs.getString("sex"));
				personaldetails.setAge(rs.getInt("age"));

				return personaldetails;
			}
		});
	}

	public void saveRespondentDetails(final PersonDetailsBean personbean, final MedicalAndBehaviourBean mandbbean,
			final FamilyBean familybean) {
		// Getting the last generated id using Genrated Key Holder
		GeneratedKeyHolder holder = new GeneratedKeyHolder();

		template.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement statement = con.prepareStatement(
						"insert into persondetails(fullNames,dob,levelOfEduc,occupationHeld,yourTribe,fathersTribe,mothersTribe,psaTest,gleasonScore,patientNo,specimenNo,dov,interviewNo,de,priDRName,labNo,particpantIdNo,age,sex) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ",
						Statement.RETURN_GENERATED_KEYS);
				statement.setString(1, personbean.getFullNames());
				statement.setString(2, personbean.getDob());
				statement.setString(3, personbean.getLevelOfEduc());
				statement.setString(4, personbean.getOccupationHeld());
				statement.setString(5, personbean.getYourTribe());
				statement.setString(6, personbean.getFathersTribe());
				statement.setString(7, personbean.getMothersTribe());
				statement.setString(8, personbean.getPsaTest());
				statement.setInt(9, personbean.getGleasonScore());
				statement.setString(10, personbean.getPatientNo());

				statement.setString(11, personbean.getSpecimenNo());

				statement.setString(12, personbean.getDov());
				statement.setInt(13, personbean.getInterviewNo());
				statement.setString(14, personbean.getDe());
				statement.setString(15, personbean.getPriDRName());
				statement.setString(16, personbean.getLabNo());
				statement.setInt(17, personbean.getParticpantIdNo());
				statement.setInt(18, personbean.getAge());
				statement.setString(19, personbean.getSex());
				;

				return statement;
			}
		}, holder);

		// storing the last generated id to int
		final long generateuserid = holder.getKey().longValue();
		personbean.setRespondentId((int) generateuserid);
		String sql2 = "insert into behavioralhistry(respondentId,sexualPartners) values( '"
				+ personbean.getRespondentId() + "', '" + mandbbean.getSexualPartners() + "')";

		template.update(sql2);

		String sql3 = "insert into medicalhistory(respondentId,weight,feet,inches,circumsised,hadVasectomy,diagnosedOfStd,ageofvesectomy,diagnosedOfHiv,ageOfCircumsion,aboutCancerFromDoctr,cancerTypeAndAge"
				+ ") values( '" + personbean.getRespondentId() + "', '" + mandbbean.getWeight() + "','"
				+ mandbbean.getFeet() + "','" + mandbbean.getInches() + "','" + mandbbean.getCircumsised() + "','"
				+ mandbbean.getHadVasectomy() + "', '" + mandbbean.getDiagnosedOfStd() + "', '"
				+ mandbbean.getAgeofvesectomy() + "','" + mandbbean.getDiagnosedOfHiv() + "','"
				+ mandbbean.getAgeOfCircumsion() + "','" + mandbbean.getAboutCancerFromDoctr() + "','"
				+ mandbbean.getCancerTypeAndAge() + "')";

		template.update(sql3);

		String sql4 = "insert into familyhistory(respondentId,hasFatherDiagnosedWithProstrateCancer,ageOfFatherDiagnosis,brothersWithProstrateCancer,brothers,beforeAgeOfSixty) values( '"
				+ personbean.getRespondentId() + "', '" + familybean.getHasFatherDiagnosedWithProstrateCancer() + "', '"
				+ familybean.getAgeOfFatherDiagnosis() + "', '" + familybean.getBrothersWithProstrateCancer() + "', '"
				+ familybean.getBrothers() + "', '" + familybean.getBeforeAgeOfSixty() + "')";

		template.update(sql4);

	}

}
