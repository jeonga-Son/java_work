package mission.order;

public class Main {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동", "서울");
		Member member2 = new Member("박길동", "부산");
		
		Item item1 = new Item("갤럭시23", 100);
		Item item2 = new Item("맥북", 500);
		
		Order order1 = new Order(1, member1, item1, 10);
		Order order2 = new Order(2, member2, item2, 10);
		
		order1.showOrder();
		System.out.println();
		order2.showOrder();
	}
}
