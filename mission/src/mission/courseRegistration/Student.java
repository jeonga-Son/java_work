package mission.courseRegistration;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses;
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList();
	}
	
	public void register(Course course) {
		courses.add(course);
	}
	
	public void showStudent() {
		System.out.println("학생 이름 : " + name);
		
		for (Course course : courses) {
			System.out.println("수강 과목 : " + course.getSubject());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
