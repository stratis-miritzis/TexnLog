package myy803.springboot.sb_tutorial_4_thymeleaf_security.service;

import java.util.List;

import myy803.springboot.sb_tutorial_4_thymeleaf_security.entity.Course;

public interface CourseService {

	public List<Course> findAll();
	
	public Course findById(int theId);
	
	public void save(Course theCourse);
	
	public void deleteById(int theId);
	
}
