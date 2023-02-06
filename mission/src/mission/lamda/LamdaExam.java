package mission.lamda;

public class LamdaExam {

	public static void main(String[] args) {
		//MyType => 익명내부클래스로 구현하시오.
		// 방법1
		MyType my1 = new MyType() {

			@Override
			public void hello() {
				System.out.println("익명내부클래스 형식입니다.");
			}
			
		};
		
		my1.hello();
		
		// 방법2 : 람다식 
		MyType my2 = () -> {
			System.out.println("람다식 형식 입니다."); // 인터페이스 안에 함수가 하나이기때문에 가능한 것. 여러개는 불가능.
		};
		
		my2.hello();
		
		// 방법3 : 향상된 람다식 
		MyType my3 = () -> System.out.println("향상된 람다식 형식입니다. ");
		
		my3.hello();
		
		// 방법1 : 람다식
		YourType you1 = (String message) -> {
			System.out.println("메세지 : " + message);
		};
		
		you1.talk("안녕");
		
		// 방법2 : 향상된 람다식 
		YourType you2 = (String message) -> System.out.println("메세지 : " + message);
		
		you2.talk("hello");
		
		//MyNumber의 getMax를 구현해서 두개의 값 중에 큰 값이 출력되도록 구현. 
		// 람다식 구현
		MyNumber my = (x, y) -> (x > y) ? x : y;
		
		System.out.println(my.getMax(10, 20));
		
		// Runnable => 람다식(1~10) 출력. 멀티스레드
		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				System.out.print(i + " ");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
