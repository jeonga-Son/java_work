package mission.bank;

public class MyBank {
	private Customer[] customers = new Customer[10];
	private int customersNum;
	int cnt;
	public MyBank() {}

	public MyBank(Customer[] customers, int customersNum) {
		super();
		this.customers = customers;
		this.customersNum = customersNum;
	}
	
	public void addCustomer(String id, String name, long balance) {
		customers[cnt++] = new Customer(id, name, balance);
		customersNum++;
	}
	
	public Customer[] getAllCustomers() {
		Customer[] exist = new Customer[cnt];
		
		System.arraycopy(customers, 0, exist, 0, cnt);
		return exist;
	}
	
	public Customer getCustomer(String id) {
		Customer cust = null;
		
		for (int i = 0; i < cnt; i++) {
			if (customers[i].getId().equals(id)) {
				cust = customers[i];
			}
		}
		
		return cust;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersNum() {
		return customersNum;
	}

	public void setCustomersNum(int customersNum) {
		this.customersNum = customersNum;
	}
}
