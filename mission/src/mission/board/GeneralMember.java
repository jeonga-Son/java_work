package mission.board;

public class GeneralMember {
	private String id;
	private String name;
	private String birth;
	private String phoneNo;
	private String address;
	
	public GeneralMember() {}

	public GeneralMember(String id, String name, String birth, String phoneNo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	public void showMember() {
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("생일 : " + birth);
		System.out.println("휴대폰 번호 : " + phoneNo);
		System.out.println("주소 : " + address);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
