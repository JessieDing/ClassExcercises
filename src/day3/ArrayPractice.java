package day3;

public class ArrayPractice {

	public static void main(String[] args) {
		// ����int������
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// ����һ�����飬��ֵ��Ȼ��ÿ��ֵ�Ŵ�ʮ��
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			a[i] = a[i] * 10;// �ȼ���a[i]*=10
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// �������
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		 //��ӡ��char�������е�����
		char[] arrChar = new char[] { 'a', 'b', 'c', '2', '4', '+', 'z' };
		 System.out.println("��ӡ���ַ������е����֣�");
		 int count = 0;
		 for (int i = 0; i < arrChar.length; i++) {
		 if (Character.isDigit(arrChar[i])) { // if(arr[i]>='0'&&arr[i]<='9')		                                    
		 // ��������ASCII�룺if(arr[i]>= && arr[i]<=)
		 System.out.print(arrChar[i] + " ");
		 count++;
		 }
		 }
		 System.out.println();
		 System.out.println("�ַ������е����ָ�����");
		 System.out.println(count);
	

		// //�����������������Ԫ�ض���0�ľ��󣨶�ά���������
		// int[][] a = new int[3][4];
		// for (int i = 0; i < a.length; i++) {
		// for (int j = 0; j < a[i].length; j++) {
		// System.out.print(a[i][j] + " ");
		// }
		// System.out.println(); //��ӡһ�к���
		// }

		// // һά�������
		// int[] arrWeek = { 1, 2, 3, 4, 5, 6, 7 };
		// for (int i = 0; i < arrWeek.length; i++) {
		// System.out.print(arrWeek[i] + " ");
		// }
		// System.out.println();
		// System.out.println("���������");
		// // �������һά����
		// for (int j = arrWeek.length - 1; j >= 0; j--) {
		// System.out.print(arrWeek[j] + " ");
		// }
	}
}
