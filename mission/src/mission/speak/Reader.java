package mission.speak;

public class Reader extends Man implements Speakable {
	public Reader(String name) {
		super(name);
	}

	@Override
	public String speak() {
		return getName() + " : 열심히 해야한다.";
	}
}
