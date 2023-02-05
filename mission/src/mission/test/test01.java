package mission.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// 임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하자.
		// 5자리의 수 ex)12345
		// 짝수의 개수 : 2 
		// 홀수의 개수 : 3
		
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 정수값 5자리를 입력해주세요 : ");
		int num = sc.nextInt();
		String str = String.valueOf(num);
		int cnt = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) - '0') % 2 == 0) {
				cnt++;
			} 
		}
		
		System.out.println("짝수의 개수 : " + cnt);
		System.out.println("홀수의 개수 : " + (str.length() - cnt));
	}
}
