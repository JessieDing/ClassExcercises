package class12.jessie.d0301;

//����һ����Shape����״��������draw�����ƣ���findArea�������������findCrm�������ܳ�������
//
//����һ��Բ�κ;����࣬����Shape��̳У�ʵ���Լ��ļ����ܳ�����������ķ���
public class ShapeTest {

	public static void main(String[] args) {
		Circ circ = new Circ();
		circ.setName("Բ��");
		circ.draw();
		circ.setRadius(6.00);
		System.out.println("Բ�����Ϊ��" + circ.findArea());
		System.out.println("Բ���ܳ�Ϊ��" + circ.findCrm());
		Rect rect = new Rect();
		rect.setName("����");
		rect.draw();
		rect.setLens(12.00);
		rect.setWid(8.00);
		System.out.println("�������Ϊ��" + rect.findArea());
		System.out.println("�����ܳ�Ϊ��" + rect.findCrm());

	}

}

class Shape {
	String name;
	double area;
	double crm;

	public void setName(String str) {
		name = str;
	}

	public String getName() {
		return name;
	}

	public void draw() {
		System.out.println("����һ��" + name);
	}

	public double findArea() {
		return area;
	}

	public double findCrm() {
		return crm;
	}
}

class Circ extends Shape {
	double radius;

	public void setRadius(double r) {
		radius = r;
	}

	public double findArea() {
		area = 3.14 * radius * radius;
		return area;
	}

	public double findCrm() {
		crm = 2.00 * 3.14 * radius;
		return crm;
	}

}

class Rect extends Shape {
	double length;
	double width;

	public void setLens(double l) {
		length = l;
	}

	public void setWid(double w) {
		width = w;
	}

	public double findArea() {
		area = length * width;
		return area;
	}

	public double findCrm() {
		crm = 2.00 * (length + width);
		return crm;
	}
}
