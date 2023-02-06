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
		course.addStudents(this); // 여기서 this가 뜻하는 것?
	}
	
	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}

	// 왜 이건 안되는지? => eqauls는 주소값을 가지고 비교하는거기 때문에 안됨.
//	public void dropCourse(Course course) {
//		for (Course c : courses) {
//			if (c.equals(course)) {
//				courses.remove(course);
//			}
//		}
//	}
	
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
