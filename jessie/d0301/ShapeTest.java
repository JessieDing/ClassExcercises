package class12.jessie.d0301;

//定义一个类Shape（形状），包含draw（绘制）、findArea（计算面积）、findCrm（计算周长）方法
//
//定义一个圆形和矩形类，都从Shape类继承，实现自己的计算周长、计算面积的方法
public class ShapeTest {

	public static void main(String[] args) {
		Circ circ = new Circ();
		circ.setName("圆形");
		circ.draw();
		circ.setRadius(6.00);
		System.out.println("圆形面积为：" + circ.findArea());
		System.out.println("圆形周长为：" + circ.findCrm());
		Rect rect = new Rect();
		rect.setName("矩形");
		rect.draw();
		rect.setLens(12.00);
		rect.setWid(8.00);
		System.out.println("矩形面积为：" + rect.findArea());
		System.out.println("矩形周长为：" + rect.findCrm());

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
		System.out.println("绘制一个" + name);
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
