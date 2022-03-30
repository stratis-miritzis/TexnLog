package myy803.springboot.sb_tutorial_4_thymeleaf_security.controller;

import java.util.List;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.beans.factory.annotation.Autowired;

import myy803.springboot.sb_tutorial_4_thymeleaf_security.service.CourseService;
import myy803.springboot.sb_tutorial_4_thymeleaf_security.service.StudentRegistrationService;

@Controller
@RequestMapping("/dashboard")
//@SessionAttributes("employees")
public class EmployeeController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	public EmployeeController(StudentRegistrationService theStudentRegistrationService, CourseService theCourseService) {
		courseService = theCourseService;
	}
	
	// add mapping for "/list"

	@GetMapping("/test")
	public String getTest(Model model) {
		model.addAttribute("bombo", "DIonisis");
		
		return "test";
	}
	
}


















