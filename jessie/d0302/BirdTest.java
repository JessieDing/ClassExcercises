package class12.jessie.d0302;

public class BirdTest {

	public static void main(String[] args) {
		// Eagle eagle = new Eagle();
		// Ostrich ostrich = new Ostrich();
		// eagle.setName("老鹰");
		// eagle.printInfo();
		// System.out.println("我是一只" + eagle.getName());
		// eagle.eat();
		// eagle.fly();
		// ostrich.setName("鸵鸟");
		// ostrich.printInfo();
		// ostrich.eat();
		// ostrich.fly();
	}
}

class Bird {
	String name;

	public void setName(String str) {
		name = str;
	}

	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println("我能吃");
	}

	public void fly() {
		System.out.println("我能飞");
	}

	public void printInfo() {
		System.out.println("我是一只" + name);
	}
}
