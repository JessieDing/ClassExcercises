package class12.jessie.day6;

//����
public class Prime {
	// 1~1000֮�������
	// ����ֻ�ܱ�1��������������1����������
	public static void main(String[] args) {
		System.out.println("1~1000�ڵ�������");
		int count = 0;
		for (int i = 2; i <= 1000; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {// ������
					count++;
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("1~1000�ڹ���" + (999 - count) + "������");// 1��������
	}
}
