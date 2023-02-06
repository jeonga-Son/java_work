package mission.oop;

public class AccountMain {

	public static void main(String[] args) {
//		CheckingAccount ca = 
//				new CheckingAccount("111-111", "홍길동", 10000, "111-111"); // 객체 생성
//		
//		try {
//			ca.pay("111-111", 3000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { // 예외가 발생하든 예외가 발생하지 않든 무조건 실행한다.
//			
//		}
//		
//		ca.showAccount();
//		ca.deposit(10000);
//		ca.showAccount();
		
		Account account = new MinusAccount("111-111", "홍길동", 5000, 10000);
		
		try {
			account.withdraw(12000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		account.showAccount();
	}
}
