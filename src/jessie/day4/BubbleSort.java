package day4;

//ð�����򣬴���ں���
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 43, 2, 45, 67, 20, 11, 35, 78, 9, 52, 4 };
		System.out.println("����֮ǰ����Ϊ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// ��ʼð������
		for (int i = 0; i < arr.length - 1; i++) { // n���������ѭ����Ҫ����n-1��
			for (int j = 0; j < arr.length - 1 - i; j++) { // �ڲ�ѭ���������Ƚ�n-i�Σ�j+1<=length-1��j+1<length
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("��" + (i + 1) + "�ˣ���ѭ������������");
			for (int n = 0; n < arr.length; n++) {
				System.out.print(arr[n] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("ð�����ս����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}