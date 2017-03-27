package d0307;

public abstract class Bird {
	private String name;

	public void setName(String str) {
		name = str;
	}

	public String getName() {
		return name;
	}

	public abstract void fly();
}