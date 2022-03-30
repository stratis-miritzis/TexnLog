package myy803.springboot.sb_tutorial_4_thymeleaf_security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="instructor")
	private String instructor;
	
	@Column(name="syllabus")
	private String syllabus;
	
	@Column(name="year")
	private String year;
	
	@Column(name="semester")
	private String semester;
	// define constructors

	public Course(String name, String instructor, String syllabus, String year, String semester) {
		super();
		this.name = name;
		this.instructor = instructor;
		this.syllabus = syllabus;
		this.year = year;
		this.semester = semester;
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

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", instructor=" + instructor + ", syllabus=" + syllabus
				+ ", year=" + year + ", semester=" + semester + "]";
	}
	
	
		
}











