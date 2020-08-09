package com.questionnaire.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.questionnaire.bean.RespondentBean;
import com.questionnaire.bean.UserBean;
import com.questionnaire.dao.AdminDao;
import com.questionnaire.dao.UserDao;

@Controller

@SessionAttributes("respondentDetails")

public class AdminController {
	@Autowired
	AdminDao admindao;
	@Autowired
	UserDao userdao;
	
	
	//returning excel for the excel in medical  
	
	
	@RequestMapping(value ="/MedicalDetailsExcel", method = RequestMethod.GET)

	public ModelAndView downLoadMedicalResults(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			List<RespondentBean> list = admindao.getMedicalDetails();

			return new ModelAndView("MedicalDetailsExcel", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}
	

	// downloading medical details in excel
	@RequestMapping(value = "/AllDetails", method = RequestMethod.GET)

	public ModelAndView downLoadExcelForMedicalDEtails(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			List<RespondentBean> list = admindao.getAllDetails();

			return new ModelAndView("AllDetails", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// downloading the family details in excel
	@RequestMapping(value = "/FamilyDetailsExcel", method = RequestMethod.GET)

	public ModelAndView downLoadExcelForFamilyDEtails(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			List<RespondentBean> list = admindao.getFamilyDetails();

			return new ModelAndView("FamilyDetailEcxel", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// downloading the excel sheets
	@RequestMapping(value = "/BehavioralDetailsExcel", method = RequestMethod.GET)

	public ModelAndView downLoadExcelForBehavioralDEtails(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			List<RespondentBean> list = admindao.getBehavioralDetails();

			return new ModelAndView("BehavioralDetailEcxel", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// downloading the excel sheets
	@RequestMapping(value = "/downloadExcelForPersonalDetails", method = RequestMethod.GET)

	public ModelAndView downLoadExcelForPersonalDEtails(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			List<RespondentBean> list = admindao.getPersonDetails();

			return new ModelAndView("PersonDetailsExcel", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// downloading the excel sheets
	@RequestMapping("Downloads")

	public ModelAndView downLoadExcel(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			return new ModelAndView("Downloads");
		}
		return new ModelAndView("redirect:/Login");
	}

	// family details

	@RequestMapping(value = "/viewFamilyDetailsAdmin/{pageid}")
	public ModelAndView personPersonalDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getFamilyDetailsByPage(pageid, total);

			return new ModelAndView("viewFamilyDetailsAdmin", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// viewing the medical details

	@RequestMapping(value = "/viewMedicalDetailsAdmin/{pageid}")
	public ModelAndView personMedicalDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getMedicalDetailsByPage(pageid, total);

			return new ModelAndView("viewMedicalDetailsAdmin", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// getBehavioralDetailsByPage
	@RequestMapping(value = "/viewBehavioralDetailsAdmin/{pageid}")
	public ModelAndView personBehavioralDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getBehavioralDetailsByPage(pageid, total);

			return new ModelAndView("viewBehavioralDetailsAdmin", "list", list);
		}
		return new ModelAndView("redirect:/Login");
	}

	// viewing the person details by pagination
	@RequestMapping(value = "/viewPersonDetailsAdmin/{pageid}")
	public ModelAndView personDetailsAccordingToPagination(HttpServletRequest request, HttpSession session,
			@PathVariable int pageid) {

		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			int total = 300;
			if (pageid == 1) {
			} else {
				pageid = (pageid - 1) * total + 1;
			}
			List<RespondentBean> list = admindao.getDetailsByPage(pageid, total);

			return new ModelAndView("viewPersonDetailsAdmin", "list", list);
		}

		return new ModelAndView("redirect:/Login");
	}

	// end of viewa

	// Admin panel
	@RequestMapping("AdminPanel")
	public ModelAndView AdminPanel(HttpServletRequest request, HttpSession session,
			@ModelAttribute("adduser") UserBean userbean) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			return new ModelAndView("AdminPanel");

		} else
			return new ModelAndView("Login");

	}

	// saving user details
	@RequestMapping("saveuserdetails")
	public ModelAndView saveUsers(HttpServletRequest request, HttpSession session,
			@Valid @ModelAttribute("adduser") UserBean userbean, BindingResult result, Model model) {

		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			if (result.hasErrors()) {

				return new ModelAndView("AdminPanel");
			}

			if (!(userbean.getPassword().equals(userbean.getPassword2()))) {

				model.addAttribute("error", "make sure that the passwords correspond");

				return new ModelAndView("AdminPanel");
			}
			if (userdao.getUserByUserName(userbean.getUserName()) != null) {

				model.addAttribute("checkusername", "User name exists use another one");

				return new ModelAndView("AdminPanel");

			}

			// save the user details

			userdao.saveUserDetails(userbean);

			return new ModelAndView("redirect:/viewUsers");
		}
		return new ModelAndView("Login");

	}

	// changePasswordView

	@RequestMapping("updatePassword")

	public ModelAndView updatePassword(HttpServletRequest request, HttpSession session, UserBean userbean) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			userdao.updatePassword(userbean);

			return new ModelAndView("redirect:/ChangeUserPasswords");
		}

		return new ModelAndView("Login");

	}

	// change passord page view
	@RequestMapping(value = "/changepassword/{id}", method = RequestMethod.GET)

	public ModelAndView changePassword(HttpServletRequest request, HttpSession session, @PathVariable int id,
			@ModelAttribute("edituser") UserBean edituser, Model model) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			UserBean user = userdao.getUserById(id);
			model.addAttribute("user", user);

			return new ModelAndView("changePasswordView");
		} else
			return new ModelAndView("redirect:Login");
	}

	// viewing the saved users
	@RequestMapping("ChangeUserPasswords")
	public ModelAndView viewUserPasswords(HttpServletRequest request, HttpSession session, UserBean userbean) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			List<UserBean> list = userdao.getUserDetails();

			return new ModelAndView("ChangeUserPasswords", "list", list);
		}

		else
			return new ModelAndView("redirect:/Login");

	}

	// Enabling users
	@RequestMapping("viewUsersForEnable")
	public ModelAndView viewUsersForEnable(HttpServletRequest request, HttpSession session, UserBean userbean) {

		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			List<UserBean> list = userdao.getUserDetails();

			return new ModelAndView("viewUsersForEnable", "list", list);
		}
		return new ModelAndView("Login");
	}
	// Enabling the user

	@RequestMapping(value = "/enableuser/{userId}", method = RequestMethod.GET)

	public ModelAndView enableUsers(HttpServletRequest request, HttpSession session, @PathVariable int userId,
			@ModelAttribute("edituser") UserBean edituser, Model model) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			userdao.enableUser(userId);

			return new ModelAndView("redirect:/viewUsersForEnable");
		}

		return new ModelAndView("redirect:/Login");

	}

	// Disable users

	@RequestMapping(value = "/disableuser/{userId}", method = RequestMethod.GET)

	public ModelAndView DiableUsers(HttpServletRequest request, HttpSession session, @PathVariable int userId,
			@ModelAttribute("edituser") UserBean edituser, Model model) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			userdao.disableUser(userId);

			return new ModelAndView("redirect:/viewUsersForEnable");
		}

		return new ModelAndView("redirect:/Login");

	}

	// updating use details
	@RequestMapping(value = "updateDetails")
	public ModelAndView updateUsers(HttpServletRequest request, HttpSession session,
			@ModelAttribute("edituser") UserBean userdetails, Model model) {

		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			userdao.update(userdetails);

			return new ModelAndView("redirect:/viewUsers");
		}

		return new ModelAndView("Login");
	}

	// edit form
	@RequestMapping("editUserDetailsForm")
	public ModelAndView editUserDetials(HttpServletRequest request, HttpSession session) {
		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {

			return new ModelAndView("editUserDetailsForm");
		}

		return new ModelAndView("redirect:/Login");
	}

	// getting the user details from the users and users_roles databases by id for
	// editing
	@RequestMapping(value = "/edituserdetails/{id}", method = RequestMethod.GET)

	public ModelAndView editUserDetails(HttpServletRequest request, HttpSession session, @PathVariable int id,
			@ModelAttribute("edituser") UserBean edituser, Model model) {

		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			UserBean user = userdao.getUserById(id);
			model.addAttribute("user", user);

			return new ModelAndView("editUserDetailsForm");
		}

		else
			return new ModelAndView("redirect:/Login");
	}

	// viewing the saved users
	@RequestMapping("viewUsers")
	public ModelAndView viewUsers(HttpServletRequest request, HttpSession session, UserBean userbean) {

		String adminId = (String) request.getSession().getAttribute("adminId");
		if (adminId != null) {
			List<UserBean> list = userdao.getUserDetails();

			return new ModelAndView("viewUsers", "list", list);
		}

		else

			return new ModelAndView("Login");

	}

}
