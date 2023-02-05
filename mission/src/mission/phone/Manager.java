package mission.phone;

import java.util.Scanner;

public class Manager {
	// 객체를 생성했으면 객체를 담아야한다.
	// phoneInfo 객체를 담기 위한 배열
	// addInfo는 phoneInfo 객체를 추가한다.
	
	PhoneInfo[] arr = new PhoneInfo[10];
	Scanner sc = new Scanner(System.in);
	int cnt;
	
	public void addPhoneInfo() {
		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("전화번호를 입력해주세요.(공백과 '-' 없이 입력해주세요.) : ");
		String phoneNo = sc.nextLine();
		
		System.out.print("생년일을 입력해주요.(ex.990201) : ");
		String birth = sc.nextLine();
		
		arr[cnt++] = new PhoneInfo(name, phoneNo, birth);
		System.out.println("저장되었습니다.");
	}
	
	public void showListPhoneInfo() {
		System.out.println("전화번호 목록입니다.");
		System.out.println("================");
		
		if (cnt == 0) {
			System.out.println("전화번호부가 비어있습니다.");
		}
		
		for(int i = 0; i < cnt; i++) {
			arr[i].show();
		}
	}
	
	public void searchListPhoneInfo() {
		int idx = -1;
		
		System.out.print("찾을 이름을 입력해주세요 : ");
		String findName = sc.nextLine();
		
		System.out.print("생년월일을 입력해주세요.(ex.990203) : ");
		String findBirth = sc.nextLine();
		
		for(int i = 0; i < cnt; i++) {
			if (arr[i].getName().equals(findName) && arr[i].getBirth().equals(findBirth)) {
				idx = i;
				arr[i].show();
			}
		}
		
		if (idx == -1) {
			System.out.println("존재하지 않는 사용자입니다.");
		}
	}
}
