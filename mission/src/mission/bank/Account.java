package mission.bank;

public class Account {
	private String id;
	private long balance;

	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public boolean withdraw(long withdrawBalance) {
		if (balance - withdrawBalance >= 0) {
			balance = balance - withdrawBalance;
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public void deposit(long depositBalance) {
		balance += depositBalance;
	}
}
