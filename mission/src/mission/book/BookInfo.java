package mission.book;

public class BookInfo {
	// 1. 누구를 객체로?
	// 2. 객체의 데이터 타입
	// 3. 필드와 메서드 만들어 나가기.
	
	// 상태 : 책이름, 정가, 할인된 가격
	// 기능 : 할인된 가격, 책 정보 출력
	
	private String bookName;
	private int price;
	private int dc_price;
	
	public BookInfo() {}

	public BookInfo(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
	
	public void discount() {
		if (price >= 30000) {
			dc_price = (int)(price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int)(price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int)(price * 0.85);
		}
	}
	
	public void show() {
		System.out.println(bookName + " 교재는 정가는 " + price + "원, 할인된 가격은 " + dc_price + "원 입니다.");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}
	
}
