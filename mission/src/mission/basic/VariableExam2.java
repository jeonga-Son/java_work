package mission.basic;

public class VariableExam2 {

	public static void main(String[] args) {
		// 지역변수(로컬변수) -> 특정 블록, 메소드 내에서 선언된 변수
		// 2가지 특징
		// 1. 반드시 초기화 후 사용해야 한다.(선언만 하면 됨)
		
		int num = 0;
		num += 1;
		System.out.println("num : " + num);
		
		// 2. 선언된 변수는 정의된 범위 안에서만 사용할 수 있다.
		// 지역변수는 선언된 위치가 중요.
		
		int a = 0;
		
		if (num == 1) {
			a = 100;
			System.out.println("a : " + a);
		}

	}

}
