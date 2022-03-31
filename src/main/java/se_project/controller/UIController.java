package se_project.controller;

import java.util.List;

import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

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

import se_project.entity.Course;
import se_project.entity.Instructor;
import se_project.entity.StudentRegistration;
import se_project.service.CourseService;
import se_project.service.StudentRegistrationService;

@Controller
@RequestMapping("/dashboard")
//@SessionAttributes("employees")
public class UIController {

	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	public UIController(StudentRegistrationService theStudentRegistrationService, CourseService theCourseService) {
		courseService = theCourseService;
	}

	@GetMapping("/myCourses")
	public String myCourses(Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		List<Course> listCourses = courseService.findByInstructor(authentication.getName());

	    model.addAttribute("listCourses", listCourses);

	    return "dashboard/coursesList";
	}
	
	@GetMapping("/addCourse")
	public String addCourse(Model model) {
		Course course = new Course();
		model.addAttribute("course", course);
		
	    return "dashboard/addCourse";
	}
	
	@PostMapping("/postCourse")
	public String postCourse(@ModelAttribute("course")Course course, Model model) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		course.setInstructor(authentication.getName());

		courseService.save(course);
		
	    return "redirect:myCourses";
	}
	
	@PostMapping("/deleteCourse")
	public String deleteCourse(@ModelAttribute("course")int courseId, Model model) {
		
		courseService.deleteById(courseId);

	    return "redirect:myCourses";
	}
	
	@GetMapping("/calculateGrades")
	public String calculateGrades(@ModelAttribute("course")int courseId, Model model) {
		double examWeight = 0.7; // set to weight apo front end -> field sto course?
		double projectWeight = 1-examWeight;
		List<StudentRegistration> studentsList = studentRegistrationService.findByCourseId(courseId);
		
		for(int i = 0; i < studentsList.size(); i++) {
			double examGrade = studentsList.get(i).getExamGrade();
			double projectGrade = studentsList.get(i).getProjectGrade();
			double grade = examGrade*examWeight + projectGrade*projectWeight;

			studentsList.get(i).setGrade(grade);
			studentRegistrationService.save(studentsList.get(i));
		}

	    return "redirect:myCourses";
	}
	
}