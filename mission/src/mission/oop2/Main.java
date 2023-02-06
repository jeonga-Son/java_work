package mission.oop2;

public class Main {

	public static void main(String[] args) {
		// Work => Study
		
		Work work = new Work();
		Study study = new Study();
		// Driver
		
		Person person = new Person("홍길동", new Role() { // Role은 추상클래스이기때문에 자신의 이름이 없다. 따라서 익명내부클래스이다.

			@Override
			public void doing() {
				System.out.println("Driver Role");
			}
			
		});
		
		person.doIt(); // work라는 객체를 가지고 있다.
	}

}
