package d0307;

public class StaticTestExp {
	static final double PI = 3.1415926;

	public static void main(String[] args) {
		StaticTest t1 = new StaticTest();
		System.out.println(StaticTest.obj_num);
		StaticTest t2 = new StaticTest();
		// System.out.println(StaticTest.obj_num);
		// StaticTest t3 = new StaticTest();
		// System.out.println(StaticTest.obj_num);
		// StaticTest t4 = new StaticTest();
		// StaticTest t5 = new StaticTest();
		// StaticTest t6 = new StaticTest();
		// System.out.println("类的实例个数：" + StaticTest.obj_num);
		System.out.println(t1.a + "," + StaticTest.b);
		t1.add();
		System.out.println(t1.a + "," + StaticTest.b);
		System.out.println(t2.a + "," + StaticTest.b);
	}
}

class StaticTest {
	static int b;// 静态。类全局，在对象之间共享
	static int obj_num;// 类的实例个数
	int a;// 非静态，对象所独有

	StaticTest() {
		obj_num++;
	}

	static public void add2() {
		b++;
		// a++;
	}

	public void add3() {
		add2();
	}

	public void add() {
		b++;
		a++;
	}
}
