package mission.speak;

public class Student extends Man {
	public Student(String name) {
		super(name);
	}
	
	public String speak() {
		//Student클래스의speak는 오버라이딩과 아무 관계가 없는 메소드
		return getName() + " : 공부나 열심히 해!";
	}
}
