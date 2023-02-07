package mission.order;

public class Order {
	
	private int orderNo;
	private Member member;
	private Item item;
	private int amount;
	private int total;
	
	public Order() {}

	public Order(int orderNo, Member member, Item item, int amount) {
		super();
		this.orderNo = orderNo;
		this.member = member;
		this.item = item;
		this.amount = amount;
		this.total = item.getPrice() * amount;
	}
	
	public void showOrder() {
		System.out.println("주문 번호 : " + orderNo);
		System.out.println("회원 이름 : " + member.getName());
		System.out.println("회원 주소 : " + member.getAddress());
		System.out.println("주문한 상품 모델명 : " + item.getModel());
		System.out.println("주문한 상품 가격 : " + item.getPrice());
		System.out.println("총 주문금액 : " + total);
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
