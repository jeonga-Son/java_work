package mission.book;

public class BookMain {
	public static void main(String[] args) {
		int totalPrice = 0;
		
		BookInfo[] arr = {
				new BookInfo("Java", 30000),
				new BookInfo("JSP", 15000),
				new BookInfo("Oracle", 20000)
		};
		
		for (BookInfo b : arr) {
			b.discount();
			b.show();
			totalPrice += b.getDc_price();
		}
		
		System.out.println("총합 : " + totalPrice + "원");
	}
}
