package class12.jessie.day4;

public class Three {

	public static void main(String[] args) {
		boolean[] arr = new boolean[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}

		int index = 0; // ���
		int count = 0; // ������
		int leftNo = arr.length; // ʣ���������ʼΪ����

		while (leftNo > 2) {
			if (arr[index] == true) {
				count++;
				if (count == 3) { // ����3ʱ
					arr[index] = false;
					count = 0; // ������1��ʼ����
					leftNo--; // ����3���޳�
				}
			}
			index++; // ��һ����������
			if (index == arr.length) { // ���һ��
				index = 0;
			}
		}
		System.out.println("ʣ��������");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				System.out.print((i + 1) + " ");
			}
		}

	}
}