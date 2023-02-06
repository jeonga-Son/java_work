package mission.oop;

public class Account {
	// 계좌 객체
	// 상태(필드) : 계좌번호, 계좌주, 잔액
	// 기능(메서드)
	// default 생성자를 무조건 만들어줘야 함.
	
	private String accountNo;
	private String ownerName;
	private int balance;

	public Account() {}

	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccount() {
		return accountNo;
	}

	public void setAccount(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		
		return balance;
	}
	
	public int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		}
		
		balance -= amount;
		
		return balance;
	}
	
	public void showAccount() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("계좌주 : " + ownerName);
		System.out.println("잔액 : " + balance);
	}
}
