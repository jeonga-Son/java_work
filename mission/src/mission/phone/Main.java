package mission.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.추가 2.출력 3.검색  4.종료
		Manager manager = new Manager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.추가  2.출력  3.검색  4.종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			String menu = sc.nextLine();
			int idx = 0;
			
			switch(menu) {
			case "1" :
				manager.addPhoneInfo();
				break;
			
			case "2" :
				manager.showListPhoneInfo();
				break;
				
			case "3" :
				manager.searchListPhoneInfo();
				break;
				
			case "4" :
				idx = -1;
				break;
			}
			
			if (idx == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
