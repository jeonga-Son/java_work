package mission.test;

import java.util.Scanner;

public class test04 {
	static int cnt = 0;
	static Scanner sc = new Scanner(System.in);
	
	// 같은 주소값을 가지니까 배열을 return할 필요 없다.
	public static void add(String[] arr) {
		System.out.print("이름 : ");
		arr[cnt++] = sc.nextLine();
	}
	
	public static void print(String[] arr) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
	}
	
	public static void search(String[] arr) {
		System.out.print("검색 : ");
		String findName = sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < cnt; i++) {
			if (findName.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		if (idx == -1) {
			System.out.println("해당 이름은 존재하지 않습니다.");
		}
	}
	
	public static void modify(String[] arr) {
		System.out.print("수정할 이름 : ");
		String findName = sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < cnt; i++) {
			if (findName.equals(arr[i])) {
				idx = i;
				break;
			}
		}
		
		if (idx == -1) {
			System.out.println("해당하는 이름은 존재하지 않습니다.");
		} else {
			System.out.print("변경 이름 : ");
			arr[idx] = sc.nextLine();
		}
	}
	
	public static void delete(String[] arr) {
		System.out.print("삭제할 이름 : ");
		String findName = sc.nextLine();
		int idx = -1;
		
		for (int i = 0; i < cnt; i++) {
			if(arr[i].equals(findName)) {
				idx = i;
				break;
			}
		}
		
		if (idx == -1) {
			System.out.println("해당하는 이름은 존재하지 않습니다.");
		} else {
			for (int i = 0; i < cnt - 1; i++) {
				arr[i] = arr[i] + 1;
			}
			cnt--;
		}
 	}
	
	public static void main(String[] args) {
		String[] arr= new String[10];
		
		while (true) {
			System.out.println("1.추가 | 2.출력 | 3.검색 | 4.수정 | 5.삭제 | 6.종료");
			System.out.print("메뉴 입력 : ");
			String menu = sc.nextLine();
			int exit = 0;
			
			switch(menu) {
			case "1" :
				add(arr);
				break;
			
			case "2" :
				print(arr);
				break;
				
			case "3" :
				search(arr);
				break;
				
			case "4" :
				modify(arr);
				break;
				
			case "5" :
				delete(arr);
				break;
				
			case "6" :
				exit = -1;
				break;
			
			default :
				System.out.println("해당하는 메뉴번호가 없습니다. 다시 입력해주세요.");
				break;
			}
			
			if (exit == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
	}

}
