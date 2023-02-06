package mission.video;

import java.util.Scanner;

public class GeneralMember {
	private String id;
	private String name;
	private String address;
	private Video rentalVideo; // 다른 객체와의 연관관계를 갖기 위한 또다른 객체를 생성한 것.
	
	public GeneralMember() {}

	// 회원가입을 위한 생성자. 이게 없으면 => 비디오를 빌리지 않으면 회원가입이 안된다.
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void rental(Video video) {
		rentalVideo = video;
	}
	
	public void showMember() {
		System.out.println("회원의 아이디 : " + id);
		System.out.println("회원의 이름 : " + name);
		System.out.println("회원의 주소 : " + address);
		rentalVideo.showVideoInfo();
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}
}
