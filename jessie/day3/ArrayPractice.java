package class12.jessie.day3;

public class ArrayPractice {

	public static void main(String[] args) {
		//����int������
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//����char������
		char[] arrChar = new char[]{'a','b','c','d','e'};
		for(int i = 0;i<arrChar.length;i++){
			System.out.print(arrChar[i] + " ");
		}

//		//�����������������Ԫ�ض���0�ľ��󣨶�ά���������
//		int[][] a = new int[3][4];
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println(); //��ӡһ�к���
//		}

		// // һά�������
		// int[] arrWeek = { 1, 2, 3, 4, 5, 6, 7 };
		// for (int i = 0; i < arrWeek.length; i++) {
		// System.out.print(arrWeek[i] + " ");
		// }
		// System.out.println(" ");
		// System.out.println("���������");
		// // �������һά����
		// for (int j = arrWeek.length - 1; j >= 0; j--) {
		// System.out.print(arrWeek[j] + " ");
		// }
	}
}
