package myy803.springboot.sb_tutorial_4_thymeleaf_security.service;

import java.util.List;

import myy803.springboot.sb_tutorial_4_thymeleaf_security.entity.StudentRegistration;

public interface StudentRegistrationService {

	public List<StudentRegistration> findAll();
	
	public StudentRegistration findById(int theId);
	
	public void save(StudentRegistration theStudentRegistration);
	
	public void deleteById(int theId);
	
}
