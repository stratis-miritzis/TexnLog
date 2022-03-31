package se_project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se_project.entity.Course;
import se_project.entity.StudentRegistration;

@Repository
public interface StudentRegistrationDAO extends JpaRepository<StudentRegistration, Integer> {
	
	public StudentRegistration findById(int theId);
	
	public List<StudentRegistration> findByCourseId(int theId);
		
}
