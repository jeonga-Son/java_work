package mission.video;

public class SpecialMember extends GeneralMember {
	private int bonusPoint;
	
	public SpecialMember() {}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	@Override
	public void rental(Video video) {
		super.rental(video);
		bonusPoint += 10;
	}

	@Override
	public void showMember() {
		super.showMember();
		System.out.println("회원의 보너스 포인트 적립 : " + bonusPoint);
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
