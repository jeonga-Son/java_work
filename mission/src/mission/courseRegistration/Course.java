package mission.courseRegistration;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String subject;
	private List<Student> students;
	
	public Course() {}

	public Course(String subject) {
		super();
		this.subject = subject;
		students = new ArrayList<Student>();
	}
	
	public void addStudents(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void showCourse() {
		System.out.println("과목명 : " + subject);
		
		for(Student student : students) {
			System.out.println("수강 신청 학생명 : " + student.getName());
		}
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
