package day6;

public class RecursiveInvoca {
	// �ݹ���õĲ�β���̫�࣬�������׶�ջ���
	public static void main(String[] args) {
		// fun(10);
		// System.out.println();
		long n = 6;
		System.out.println(recursion(n));
	}

	// public static void fun(int i) {
	// if (i > 0) {
	// i--;
	// fun(i);
	// System.out.print(i);
	// }
	// System.out.print(" ok ");
	// }

	public static long recursion(long n) {
		long ret = 1;

		if (n == 0)// ���⴦��
			return 1;
		if (n > 1) {
			ret = n * recursion(n - 1);
		}
		return ret;
	}
}
