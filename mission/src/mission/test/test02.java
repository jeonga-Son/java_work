package mission.test;

public class test02 {

	public static void main(String[] args) {
		// 퀴즈 > 1-100 까지의 정수 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오.
		
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println(i);
			}
		}
	}
}
