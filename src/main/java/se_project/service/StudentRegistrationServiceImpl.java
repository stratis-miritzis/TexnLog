package se_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se_project.dao.CourseDAO;
import se_project.dao.StudentRegistrationDAO;
import se_project.entity.Course;
import se_project.entity.StudentRegistration;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {

	@Autowired
	private StudentRegistrationDAO studentRegistrationRepository;
	
	public StudentRegistrationServiceImpl() {
		super();
	}

	@Autowired
	public StudentRegistrationServiceImpl(StudentRegistrationDAO theStudentRegistrationRepository) {
		studentRegistrationRepository = theStudentRegistrationRepository;
	}
	
	@Override
	@Transactional
	public List<StudentRegistration> findAll() {
		return studentRegistrationRepository.findAll();
	}

	@Override
	@Transactional
	public StudentRegistration findById(int theId) {
		StudentRegistration result = studentRegistrationRepository.findById(theId);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the StudentRegistration
			throw new RuntimeException("Did not find StudentRegistration id - " + theId);
		}
	}
	
	
	@Override
	@Transactional
	public List<StudentRegistration> findAllById(int theId) {
		List<StudentRegistration> result = studentRegistrationRepository.findAllById(theId);
		return result;
		
	}
	
	@Transactional
	public List<StudentRegistration> findByCourseId(int theId) {
		List<StudentRegistration> result = studentRegistrationRepository.findByCourseId(theId);
				
		if (result != null ) {
			return result;
		}
		else {
			// we didn't find the CourseId
			throw new RuntimeException("Did not find courseId - " + theId);
		}
	}

	@Override
	@Transactional
	public void save(StudentRegistration theStudentRegistration) {
		studentRegistrationRepository.save(theStudentRegistration);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentRegistrationRepository.deleteById(theId);
	}
	
	@Override
	@Transactional
	public void deleteByIdAndCourseId(int theId,int theCourseId) {
		studentRegistrationRepository.deleteByIdAndCourseId(theId,theCourseId);
	}
}






