package myy803.springboot.sb_tutorial_4_thymeleaf_security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentRegistration")
public class StudentRegistration {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="year_of_registration")
	private String yearOfRegistration;
	
	@Column(name="semester")
	private String semester;
	
	@Column(name="course_id")
	private String courseId;
	
	public StudentRegistration() {
	}

	public StudentRegistration(String name, String yearOfRegistration, String semester, String courseId) {
		super();
		this.name = name;
		this.yearOfRegistration = yearOfRegistration;
		this.semester = semester;
		this.courseId = courseId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYearOfRegistration() {
		return yearOfRegistration;
	}

	public void setYearOfRegistration(String yearOfRegistration) {
		this.yearOfRegistration = yearOfRegistration;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		return "StudentRegistration [id=" + id + ", name=" + name + ", yearOfRegistration=" + yearOfRegistration
				+ ", semester=" + semester + ", courseId=" + courseId + "]";
	}


	
	
}











