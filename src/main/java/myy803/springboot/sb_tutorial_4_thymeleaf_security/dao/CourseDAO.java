package myy803.springboot.sb_tutorial_4_thymeleaf_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myy803.springboot.sb_tutorial_4_thymeleaf_security.entity.Course;

@Repository
public interface CourseDAO extends JpaRepository<Course, Integer> {
	
	public Course findById(int theId);
		
}
