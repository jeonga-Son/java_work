package mission.video;

public class VideoMain {
	
	public static void main(String[] args) {
		System.out.println("<Video 대여 사이트 '다빌려'에 오신걸 환영합니다.>\n");
		
		Video v1 = new Video("1", "탑건2", "톰크루즈");
		Video v2 = new Video("2", "아바타2", "unknown");
		
		GeneralMember arr[] = { // 부모의 클래스로 자식 모두 모을 수 있다. 최상위 클래스.
				new GeneralMember("king", "홍길동", "송파"),
				new SpecialMember("누구", "홍길순", "부산", 0)
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rental(v1);
			arr[i].showMember();
			System.out.println();
		}
		
//		GeneralMember gm = new GeneralMember("king", "홍길동", "송파");
//		gm.rental(v2);
//		gm.showMember();
//		
//		SpecialMember sm = new SpecialMember("누구", "홍길순", "부산", 0);
//		sm.rental(v1);
//		sm.showMember();
	}
}
