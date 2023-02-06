package mission.courseRegistration;

public class Main {

	public static void main(String[] args) {
		// 1. 객체를 추출
		// 2. 객체간의 관계
		// 주제 : 수강신청 로직을 구현하자.
		
		// 1단계
		// 학생(Student)이 여러 과목을 수강신청
		// 학생은 수강된 과목을 확인
		// 과목(Course)은 과목이름의 내용을 갖고 있다.
		// 여러 과목들이 개설되어야 한다.
		
		// 2단계
		// 학생은 수강신청한 과목을 취소할 수 있다.
		// 과목마다 수강신청한 학생 목록을 확인할 수 있다.
		
		Course c1 = new Course("전산학개론"); 
		Course c2 = new Course("기초통계학"); 
		Course c3 = new Course("빅데이터개론"); 
		
		Student s1 = new Student("홍길동");
		Student s2 = new Student("박길순");
		
		s1.register(c1);
		s1.register(c2);
		s1.dropCourse(c2);
		
		s2.register(c2);
		s2.register(c3);
		
//		s1.showStudent();
//		s2.showStudent();
		
		c1.showCourse();
		c2.showCourse();
	}

}
