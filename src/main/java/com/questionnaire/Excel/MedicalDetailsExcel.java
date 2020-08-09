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


public class MedicalDetailsExcel extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse reponse) throws Exception {

		List<RespondentBean> persondetails =(List<RespondentBean>) model.get("list");

		// creating a new Excel sheet
		HSSFSheet sheet = workbook.createSheet("RespondentBean");
		sheet.setDefaultColumnWidth(30);
		// styling the excel sheet

		
	  
	    Row header = sheet.createRow(0);
	    header.createCell(0).setCellValue("Full Names");
	    header.createCell(1).setCellValue("weight");
	    header.createCell(2).setCellValue("Feet");
	    header.createCell(3).setCellValue("Inches");
	    header.createCell(4).setCellValue("Circumsised");
	    header.createCell(5).setCellValue("Had Vasectomy");
	    header.createCell(6).setCellValue("Age of Vesectomy");

	    header.createCell(7).setCellValue("ageofvesectomy");

	    header.createCell(8).setCellValue("Diagnosed Of Hiv ");

	    header.createCell(9).setCellValue("About Cancer From Doctr");

	    header.createCell(10).setCellValue("Cancer Type And Age");

	    header.createCell(11).setCellValue("Age Of Circumsion ");

	    header.createCell(12).setCellValue(" Diagnosed Of Std");


	 

		// creating data rows
		int rowCount = 1;
		for (RespondentBean pdetails : persondetails) {

			HSSFRow aRow = sheet.createRow(rowCount++);
			

			aRow.createCell(0).setCellValue(pdetails.getFullNames());
			aRow.createCell(1).setCellValue(pdetails.getWeight());
			aRow.createCell(2).setCellValue(pdetails.getFeet());
			aRow.createCell(3).setCellValue(pdetails.getInches());
			aRow.createCell(4).setCellValue(pdetails.getCircumsised());
			aRow.createCell(5).setCellValue(pdetails.getHadVasectomy());
			aRow.createCell(6).setCellValue(pdetails.getAgeofvesectomy ());
			aRow.createCell(7).setCellValue(pdetails.getDiagnosedOfHiv  ());
			aRow.createCell(8).setCellValue(pdetails.getAboutCancerFromDoctr ());
			aRow.createCell(9).setCellValue(pdetails.getCancerTypeAndAge  ());
			aRow.createCell(10).setCellValue(pdetails.getAgeOfCircumsion ());
			aRow.createCell(11).setCellValue(pdetails.getDiagnosedOfStd());
			
		}

	}

}
