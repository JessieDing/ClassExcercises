package class12.jessie.d0302;

public class BirdTest {

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		Ostrich ostrich = new Ostrich();
		eagle.setName("��ӥ");
		eagle.printInfo();
		// System.out.println("����һֻ" + eagle.getName());
		eagle.eat();
		eagle.fly();
		ostrich.setName("����");
		ostrich.printInfo();
		ostrich.eat();
		ostrich.fly();
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
		return;
	}

	public void fly() {
		return;
	}

	public void printInfo() {
		System.out.println("����һֻ" + name);
	}
}

class Eagle extends Bird {
	public void eat() {
		System.out.println("��ӥ����");
	}

	public void fly() {
		System.out.println("��ӥ���");
	}
}

class Ostrich extends Bird {
	public void eat() {
		System.out.println("�������ʳ");
	}

	public void fly() {
		System.out.println("���񲻻��");
	}
}