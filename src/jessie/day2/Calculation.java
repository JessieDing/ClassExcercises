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
			System.out.println("����������������ʽ��ע��Ҫ�ո�");
			a = scan.nextInt();
			oper = scan.next();
			b = scan.nextInt();

			if (a == 0 && b == 0 && oper.equals("0"))// �����������������
				break;

			if (b == 0 && oper.equals("/")) {
				System.out.println("��������Ϊ�㣡");
			} else {
				switch (oper) {
				case "+":
					result = a + b;
					System.out.println("������Ϊ��" + result);
					break;
				case "-":
					result = a - b;
					System.out.println("������Ϊ��" + result);
					break;
				case "*":
					result = a * b;
					System.out.println("������Ϊ��" + result);
					break;
				case "/":
					result = a / b;
					System.out.println("������Ϊ��" + result);
					break;
				default:
					System.out.println("����");
				}
			}
		}
		scan.close();
	}
}
