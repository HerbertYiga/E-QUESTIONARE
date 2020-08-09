package com.questionnaire.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.questionnaire.bean.FamilyBean;
import com.questionnaire.bean.MedicalAndBehaviourBean;
import com.questionnaire.bean.PersonDetailsBean;
import com.questionnaire.bean.RespondentBean;
import com.questionnaire.bean.UserBean;
import com.questionnaire.dao.AdminDao;
import com.questionnaire.dao.UserDao;

/**
 * @author DELL
 *
 */
@Controller

@SessionAttributes({ "Object1", "Object2" })

public class UserController {

	// admin
	@Autowired
	UserDao userdao;

	@Autowired
	AdminDao admindao;
	// family details
	
	@RequestMapping(value="/viewFamilyDetails/{pageid}")
	public ModelAndView personPersonalDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {
			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao. getFamilyDetailsByPage(pageid, total);

			return new ModelAndView("viewFamilyDetails", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}


	// viewing the medical details
	
	@RequestMapping(value="/viewMedicalDetails/{pageid}")
	public ModelAndView personMedicalDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {
			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getMedicalDetailsByPage(pageid, total);

			return new ModelAndView("viewMedicalDetails", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// getBehavioralDetailsByPage
	@RequestMapping(value="/viewBehavioralDetails/{pageid}")
	public ModelAndView personBehavioralDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {
			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getBehavioralDetailsByPage(pageid, total);

			return new ModelAndView("viewBehavioralDetails", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// viewing the person details by pagination
	@RequestMapping(value = "/viewPersonDetails/{pageid}")
	public ModelAndView personDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {

		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getDetailsByPage(pageid, total);

			return new ModelAndView("viewPersonDetails", "list", list);
		}

		return new ModelAndView("redirect:/Login");
	}

	// going to form three

	@RequestMapping("gototest3")
	public String Test3(HttpServletRequest request, HttpSession session,
			@Valid @ModelAttribute("addDetails") MedicalAndBehaviourBean medicalandbehaviourbean, BindingResult result,
			Model model) {

		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			// first checking whether a number is an integer or not
			Integer sexualPartners = medicalandbehaviourbean.getSexualPartners();
			if (sexualPartners != (Integer) sexualPartners) {

				model.addAttribute("error", "Please insert a number");
				return "Form2";
			}

			if (result.hasErrors()) {

				try {
					return "Form2";
				} catch (NumberFormatException e) {
					model.addAttribute("error", "please insert a number");

				}

			}
			model.addAttribute("Object2", medicalandbehaviourbean);
			return "redirect:/Form3";
		}
		return "Login";

	}

	// going to from two
	@RequestMapping("gototest2")
	public String Test1(HttpServletRequest request, HttpSession session,
			@Valid @ModelAttribute("addDetails") PersonDetailsBean details, BindingResult result, Model model) {

		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			if (result.hasErrors()) {
				return "UserPanel";

			}
			model.addAttribute("Object1", details);
			return "redirect:/Form2";

		}

		return "redirect:/Login";
	}

	// Form three

	@RequestMapping("Form3")

	public String Form3(HttpServletRequest request, HttpSession session,
			@ModelAttribute("addDetails") FamilyBean familybean, Model model) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			return "Form3";
		}

		else {

			return "opps";
		}
	}

	// Form two
	@RequestMapping("Form2")

	public String Form2(HttpServletRequest request, HttpSession session,
			@ModelAttribute("addDetails") MedicalAndBehaviourBean medicalandbehaviourbean, Model model) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			return "Form2";
		}

		else {

			return "Login";
		}
	}

	// user panel has details for form one
	@RequestMapping("UserPanel")

	public String userPannel(HttpServletRequest request, HttpSession session,
			@ModelAttribute("addDetails") PersonDetailsBean details) {
		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			return "UserPanel";
		}

		else {

			return "redirect:/Login";
		}
	}

	// saving saving all the form details within a session
	@RequestMapping("savetest3")
	public String saveTest2(HttpServletRequest request, HttpSession session,
			@ModelAttribute("Object1") PersonDetailsBean details,
			@ModelAttribute("Object2") MedicalAndBehaviourBean mandbbean,
			@Valid @ModelAttribute("addDetails") FamilyBean familybean, BindingResult result, SessionStatus status) {

		Integer userId = (Integer) request.getSession().getAttribute("userId");

		if (userId != null) {

			if (result.hasErrors()) {
				return "Form3";
			}
			admindao.saveRespondentDetails(details, mandbbean, familybean);

			status.setComplete();

			return "redirect:/viewPersonDetails/1";

		}

		return "Login";

	}

	
}
