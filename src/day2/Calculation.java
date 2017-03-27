package day2;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		String oper = "";
		int result = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("请输入四则运算算式，注意要空格：");
			a = scan.nextInt();
			oper = scan.next();
			b = scan.nextInt();

			if (a == 0 && b == 0 && oper.equals("0"))// 输入三个零结束程序
				break;

			if (b == 0 && oper.equals("/")) {
				System.out.println("除数不得为零！");
			} else {
				switch (oper) {
				case "+":
					result = a + b;
					System.out.println("计算结果为：" + result);
					break;
				case "-":
					result = a - b;
					System.out.println("计算结果为：" + result);
					break;
				case "*":
					result = a * b;
					System.out.println("计算结果为：" + result);
					break;
				case "/":
					result = a / b;
					System.out.println("计算结果为：" + result);
					break;
				default:
					System.out.println("结束");
				}
			}
		}
		scan.close();
	}
}
