package mission.courseRegistration;

public class Main {

	public static void main(String[] args) {
		// 1. 객체를 추출
		// 2. 객체간의 관계
		// 주제 : 수강신청 로직을 구현하자.
		// 학생(Student)이 여러 과목을 수강신청
		// 학생은 수강된 과목을 확인
		// 과목(Course)은 과목이름의 내용을 갖고 있다.
		// 여러 과목들이 개설되어야 한다.
		
		Course c1 = new Course("전산학개론"); 
		Course c2 = new Course("기초통계학"); 
		Course c3 = new Course("빅데이터개론"); 
		
		Student s1 = new Student("홍길동");
		Student s2 = new Student("홍길순");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c2);
		s2.register(c3);
		
		s1.showStudent();
		s2.showStudent();
	}

}
