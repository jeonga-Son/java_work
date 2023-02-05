package mission.basic;

public class VariableExam {

	public static void main(String[] args) {
		// 변수 선언 시 주의사항
		// 변수명은 특수문자X, 숫자로 시작X, 소문자로 시작O, 합성어의 두번째 단어 첫자 대문자 O
		
		int num; // 변수 선언(메모리 할당)
		num = 10; // 변수 초기화
		int num2 = 20; // 변수 선언 & 초기화
		
		// 기본 리터럴
		// 정수값 => int, 실수값 => double, 'A' => char,"문자열"=> String, true => boolean
		
		double d = 3.14;
		float f = 3.14f;
		
		// byte < short < int < long < float < double
		// 형변환(Casting)
		// 묵시적 형변환
		// 큰데이터형 <--- 작은 데이터형(O)
		// 큰데이터형 ---> 작은 데이터형(X) => 강제형변환이 필요, 캐스팅 필요	}
		// 강제 형변환 => 데이터 손실 유발
		
		int b = (int)3.14;
		System.out.println("b : " + b);
		
		// 연산할 때 적젏나 데이터 타입 명시 필요. 큰 데이터로 바뀐다.
		double num3 = 3.14 + 1;
		
		System.out.println("num3 : " + num3);
		
		// 실수형은 항상 오차 발생
		if (num3 == 4.14) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		
		// int <==> char(아스키코드)
		char num4 = 'A';
		System.out.println("num4 : " + (int)num4);
		
		// 원래는 이게 맞지만
		String str = new String("AAA");
		// 이렇게 기본형 타입으로 쓸 수 있다.
		String str2 = "BBB";
		
		// String <==> int 형변환 많이함.
		String num5 = "1";
		int result = Integer.parseInt(num5) + 1;
		
		System.out.println(result);
		
		// int => String
		int num7 = 100;
		String num8 = String.valueOf(num7);
		String num9 = num7 + "";
		
		System.out.println("num8 + num9 : " + num8 + num9);
		
		String str4 = 7 + "7" + 7;
		System.out.println(str4);
	}
}
