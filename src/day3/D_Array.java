package day3;

//����
public class D_Array {

	public static void main(String[] args) {
		// ����һ����ά���飬����ÿ��Ԫ�ظ�ֵ���������Ԫ���ۼ�֮��
		int sum = 0;
		int n = 0;
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				n = a[i][j];
				sum += n;
			}
		}
		System.out.println(sum);
	}

}
