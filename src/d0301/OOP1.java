package d0301;

public class OOP1 {

	public static void main(String[] args) {
		// MobilePhone myPhone = new MobilePhone();// ʵ����һ������
		// myPhone.sendMsg("���");// ���ö���ķ����ŷ���
		// myPhone.call();// ���ô�绰����
		// myPhone.internet();// ������������

		Circle myCircle = new Circle();
		myCircle.setRadius(12.00);
		double area = myCircle.findArea();
		double circum = myCircle.findCircum();
		System.out.println("Բ�����Ϊ��" + area);
		System.out.println("Բ���ܳ�Ϊ��" + circum);
	}
}

class Circle {
	double radius;
	double area;
	double circumference;

	public void setRadius(double r) {
		radius = r;
	}

	public double findArea() { // ��������������Ϊ�Ľӿ�
		area = 3.14 * radius * radius;
		return area;
	}

	public double findCircum() {
		circumference = 2.00 * 3.14 * radius;
		return circumference;
	}
}

class MobilePhone {
	// ����
	String id; // ID��
	double screenSize; // ��Ļ�ߴ�
	String cpuType; // CPU�ߴ�
	int memeorySize; // �ڴ��С

	public void call() { // ��绰����
		System.out.println("���绰");
		System.out.println("ͨ��");
		System.out.println("�ҵ绰");
	}

	public void sendMsg(String strMsg) { // ������
		System.out.println("������...");
		System.out.println("��Ҫ���͵Ķ����ǣ�" + strMsg);
		System.out.println("���ͳɹ�");
	}

	public void internet() { // ����
		System.out.println("����Internet�ɹ�");
		System.out.println("��������");
	}
}
