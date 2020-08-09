package com.questionnaire.Excel;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.questionnaire.bean.RespondentBean;


public class AllDetails extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse reponse) throws Exception {

		List<RespondentBean> persondetails =(List<RespondentBean>) model.get("list");

		// creating a new Excel sheet
		HSSFSheet sheet = workbook.createSheet("RespondentBean");
		sheet.setDefaultColumnWidth(30);
		// styling the excel sheet

		
	  
	    Row header = sheet.createRow(0);


	    //person details
	    
	    header.createCell(0).setCellValue("Full Names");
	    header.createCell(1).setCellValue("Level of Education");
	    header.createCell(2).setCellValue("Occupation Held");
	    header.createCell(3).setCellValue("Your tribe");
	    header.createCell(4).setCellValue("Fathers tribe");
	    header.createCell(5).setCellValue("Mothers tribe");
	    header.createCell(6).setCellValue("Date of Birth");
	    //behavior
	    header.createCell(7).setCellValue("Number of Sexual  Partners");
	    //medical
	
	    header.createCell(8).setCellValue("weight");
	    header.createCell(9).setCellValue("Feet");
	    header.createCell(10).setCellValue("Inches");
	    header.createCell(11).setCellValue("Circumsised");
	    header.createCell(12).setCellValue("Had Vasectomy");
	    header.createCell(13).setCellValue("Age of Vesectomy");
        header.createCell(14).setCellValue("ageofvesectomy");

	    header.createCell(15).setCellValue("Diagnosed Of Hiv ");

	    header.createCell(16).setCellValue("About Cancer From Doctr");

	    header.createCell(17).setCellValue("Cancer Type And Age");

	    header.createCell(18).setCellValue("Age Of Circumsion ");

	    header.createCell(19).setCellValue(" Diagnosed Of Std");
        //family
	    header.createCell(20).setCellValue("Has Father Been Diagnosed With ProstrateCancer ");
		header.createCell(21).setCellValue("Age Of Father's Diagnosis");
		header.createCell(22).setCellValue("Brothers With Prostrate Cancer");
		header.createCell(23).setCellValue("brothers");
		header.createCell(24).setCellValue("beforeAgeOfSixty");

	 

		// creating data rows
		int rowCount = 1;
		for (RespondentBean pdetails : persondetails) {

			HSSFRow aRow = sheet.createRow(rowCount++);
			//person
			
			aRow.createCell(0).setCellValue(pdetails.getFullNames());
			aRow.createCell(1).setCellValue(pdetails.getLevelOfEduc());
			aRow.createCell(2).setCellValue(pdetails.getOccupationHeld());
			aRow.createCell(3).setCellValue(pdetails.getYourTribe());
			aRow.createCell(4).setCellValue(pdetails.getFathersTribe());
			aRow.createCell(5).setCellValue(pdetails.getMothersTribe());
			aRow.createCell(6).setCellValue(pdetails.getDob());
			//behavioral
			aRow.createCell(7).setCellValue(pdetails.getSexualPartners());
			//Medical
			

			
			aRow.createCell(8).setCellValue(pdetails.getWeight());
			aRow.createCell(9).setCellValue(pdetails.getFeet());
			aRow.createCell(10).setCellValue(pdetails.getInches());
			aRow.createCell(11).setCellValue(pdetails.getCircumsised());
			aRow.createCell(12).setCellValue(pdetails.getHadVasectomy());
			aRow.createCell(13).setCellValue(pdetails.getAgeofvesectomy ());
			aRow.createCell(14).setCellValue(pdetails.getDiagnosedOfHiv  ());
			aRow.createCell(15).setCellValue(pdetails.getAboutCancerFromDoctr ());
			aRow.createCell(16).setCellValue(pdetails.getCancerTypeAndAge  ());
			aRow.createCell(17).setCellValue(pdetails.getAgeOfCircumsion ());
			aRow.createCell(18).setCellValue(pdetails.getDiagnosedOfStd ());
			
			
			//family
			
			aRow.createCell(19).setCellValue(pdetails.getFullNames());
			aRow.createCell(20).setCellValue(pdetails.getHasFatherDiagnosedWithProstrateCancer());
			aRow.createCell(21).setCellValue(pdetails.getAgeOfFatherDiagnosis());
			aRow.createCell(22).setCellValue(pdetails.getBrothersWithProstrateCancer());
			aRow.createCell(23).setCellValue(pdetails.getBrothers());
			aRow.createCell(24).setCellValue(pdetails.getBeforeAgeOfSixty());

			
		}

	}

}
