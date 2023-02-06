package mission.speak;

public class Main {

	public static void main(String[] args) {
		Object obj[] = {new Reader("둘리"), new Work("길동"),
				new Student("마이콜")};
		
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Speakable) {
//				 obj[i].speak(); // 자식클래스에만 있는 메서드 호출 불가능
				Speakable speaker = (Speakable)obj[i];
				System.out.println(speaker.speak());
			}
		}
	}

}
