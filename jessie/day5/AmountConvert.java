package class12.jessie.day5;

import java.util.Scanner;

public class AmountConvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������Сд����������");
		int amount = scan.nextInt();
		System.out.print("ת��Ϊ��д��");
		convert(amount);
		scan.close();
	}

	public static void convert(int lowerAmount) {
		int unit = 10000;

		while (lowerAmount > 0) {
			int temp = 0;
			temp = lowerAmount / unit;
			switch (temp) {
			case 0:
				System.out.print("��");
				break;
			case 1:
				System.out.print("Ҽ");
				break;
			case 2:
				System.out.print("��");

				break;
			case 3:
				System.out.print("��");
				break;

			case 4:
				System.out.print("��");
				break;

			case 5:
				System.out.print("��");
				break;

			case 6:
				System.out.print("½");
				break;

			case 7:
				System.out.print("��");
				break;

			case 8:
				System.out.print("��");
				break;

			case 9:
				System.out.print("��");
				break;

			}
			if (temp != 0) {
				switch (unit) {
				case 10000:
					System.out.print("��");
					break;

				case 1000:
					System.out.print("Ǫ");
					break;

				case 100:
					System.out.print("��");
					break;

				case 10:
					System.out.print("ʰ");
					break;

				}
			}
			lowerAmount = lowerAmount % unit;
			unit = unit / 10;
		}
	}
}
