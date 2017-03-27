package day5;

public class Method {
	public void print(String message) {
		System.out.println(message);
	}

	public static int max(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		// print("打印方法");报错 //静态方法调用非静态方法需通过对象来调用
		Method method = new Method();
		method.print("打印方法");
		int x = 123;
		int y = 78;
		int z = 34;
		method.print(Integer.toString(max(x, y, z)));
	}
}
