package class12.jessie.day1;

public class EggNumber {

	public static void main(String[] args) {

		for (int n = 1; n <= 10000; n++) {
			// if (n % 2 == 1 &&
			// n % 3 == 0 &&
			// n % 4 == 1 &&
			// n % 5 == 4 &&
			// n % 6 == 3 &&
			// n % 7 == 0 &&
			// n % 8 == 1 &&
			// n % 9 == 0) {
			// System.out.println(n);
			// }
//			if (n >= 9500) {
//				break;// ��������forѭ��������ʵforѭ���ɲ���Ҫ��һ�䡣
//			}
			if (n % 2 != 1)
				continue;// ��ֹ����forѭ����������һ��ѭ��
			if (n % 3 != 0)
				continue;
			if (n % 4 != 1)
				continue;
			if (n % 5 != 4)
				continue;
			if (n % 6 != 3)
				continue;
			if (n % 7 != 0)
				continue;
			if (n % 8 != 1)
				continue;
			if (n % 9 != 0)
				continue;
			System.out.println(n);
		}

	}

}
// 1��1���ã��������ꡣ
// 2��2���ã���ʣ1����
// 3��3���ã��������ꡣ
// 4��4���ã���ʣ1����
// 5��5���ã�����1����
// 6��6���ã���ʣ3����
// 7��7���ã��������ꡣ
// 8��8���ã���ʣ1����
// 9��9���ã��������ꡣ
// �ʿ��������ж��ټ�����