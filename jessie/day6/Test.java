package class12.jessie.day6;

public class Test {

	public static void main(String[] args) {
		// 例,浮点数相乘导致的精度误差
		double f1 = 4.55;
		double f2 = 5.55;
		System.out.println(f1 * f2);
		// 浮点数直接比较产生的错误
		double b = 0.05 + 0.01;
		System.out.println(b == 0.06);
		System.out.println(0.05 + 0.01);
		// 正确的浮点数比较方式
		boolean equ = false;
		if (Math.abs(0.06 - b) < 0.0000001) {// 差的绝对值小于某个很小的数，表示相等
			equ = true;
		} else {
			equ = false;
		}
		System.out.println(equ);
		Float a;// 与基本数据类型float不同
		a = Float.parseFloat("3.14159");
		System.out.println(a);

		// 类型转换示例
		// byte nAge = 50;
		// int iAge = (int) nAge;// 安全的强制类型转换
		// float fAmt = (float) 1000.00;// 强制转换并赋值，注意越界
		// double dAmt = fAmt;

		// fAmt = dAmt;// 大转小，报错

		// char cTmp = 53;// 可以把整型值直接赋给char型
		// cTmp = (char) nAge;// 等长类型转换

		// boolean bTmp = (boolean) 1;// 布尔类型禁止转换

		// 位运算符示例
		Integer i = new Integer(128);
		Integer n = new Integer(129);
		System.out.println(i + ":" + Integer.toBinaryString(i));
		System.out.println(n + ":" + Integer.toBinaryString(n));

		System.out.println("i|n:" + Integer.toBinaryString(i | n));
		System.out.println("i&n:" + Integer.toBinaryString(i & n));
		System.out.println("~i:" + Integer.toBinaryString(~i));
		System.out.println("1^0:" + Integer.toBinaryString(1 ^ 0));
		System.out.println("1^1:" + Integer.toBinaryString(1 ^ 1));

	}

}
