package com.questionnaire.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.questionnaire.bean.PersonDetailsBean;

@Controller

public class Test {
	
	
	
	//going to form two
	
	
	
	//test which  form one
	@RequestMapping("Test")
	
	public ModelAndView TestPageOne(@Valid @ModelAttribute("addDetails") PersonDetailsBean details,BindingResult result) {
		
		if(result.hasErrors()) {
			
		 return new ModelAndView("Test");
		 
		}
		
		
		return  new ModelAndView("Test");
		
		
	}
	
	
	

}
