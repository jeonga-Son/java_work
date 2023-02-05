package mission.test;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// 퀴즈2 > 2개의 정수를 입력 받아 b - a 결과가 항상 양의 정수가 나오도록 구현해 보자.
		
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		// 정답코드1
//		while(true) {
//			System.out.print("a : ");
//			a = sc.nextInt();
//			
//			System.out.print("b : ");
//			b = sc.nextInt();
//			
//			if (a < b) {
//				break;
//			}
//		}
//		
//		System.out.println("b - a = " + (b - a));
	
		// 정답코드2
		do {
			System.out.print("a : ");
			a = sc.nextInt();
			
			System.out.print("b : ");
			b = sc.nextInt();
			
		} while(a > b);
		
		System.out.println("b - a = " + (b - a));

	}
}
