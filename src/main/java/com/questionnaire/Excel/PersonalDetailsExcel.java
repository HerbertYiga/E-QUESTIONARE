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


public class PersonalDetailsExcel extends AbstractExcelView {

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
	    header.createCell(1).setCellValue("Level of Education");
	    header.createCell(2).setCellValue("Occupation Held");
	    header.createCell(3).setCellValue("Client's tribe");
	    header.createCell(4).setCellValue("Fathers tribe");
	    header.createCell(5).setCellValue("Mothers tribe");
	    header.createCell(6).setCellValue("Date of Birth");
	    
	    
	    header.createCell(7).setCellValue("Psa Test");
	    header.createCell(8).setCellValue("Gleason Score");
	    header.createCell(9).setCellValue("Lab No");
	    header.createCell(10).setCellValue("Particpant ID No");
	    header.createCell(11).setCellValue("Patient No");
	    header.createCell(12).setCellValue("Specimen No");
	    header.createCell(13).setCellValue("Date of visit");
	    header.createCell(14).setCellValue("Interviewer's No");
	    header.createCell(15).setCellValue("Date entered");
	    header.createCell(16).setCellValue("PRI Doctors Name");
	    header.createCell(17).setCellValue("Client's Age");
	    header.createCell(18).setCellValue("Client's Sex");
	   
	 

		// creating data rows
		int rowCount = 1;
		for (RespondentBean pdetails : persondetails) {

			HSSFRow aRow = sheet.createRow(rowCount++);
			

			aRow.createCell(0).setCellValue(pdetails.getFullNames());
			aRow.createCell(1).setCellValue(pdetails.getLevelOfEduc());
			aRow.createCell(2).setCellValue(pdetails.getOccupationHeld());
			aRow.createCell(3).setCellValue(pdetails.getYourTribe());
			aRow.createCell(4).setCellValue(pdetails.getFathersTribe());
			aRow.createCell(5).setCellValue(pdetails.getMothersTribe());
			aRow.createCell(6).setCellValue(pdetails.getDob());
			
			aRow.createCell(7).setCellValue(pdetails.getPsaTest());
			aRow.createCell(8).setCellValue(pdetails.getGleasonScore());
			aRow.createCell(9).setCellValue(pdetails.getLabNo());
			aRow.createCell(10).setCellValue(pdetails.getParticpantIdNo());
			
			aRow.createCell(11).setCellValue(pdetails.getPatientNo());
			aRow.createCell(12).setCellValue(pdetails.getSpecimenNo());
			aRow.createCell(13).setCellValue(pdetails.getDov());
			aRow.createCell(14).setCellValue(pdetails.getInterviewNo());
			aRow.createCell(15).setCellValue(pdetails.getDe());
			aRow.createCell(16).setCellValue(pdetails.getPriDRName());
			aRow.createCell(17).setCellValue(pdetails.getAge());
			aRow.createCell(18).setCellValue(pdetails.getSex());
			
		
			
			

		}

	}

}
