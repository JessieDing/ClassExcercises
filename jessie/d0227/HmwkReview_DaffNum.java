package class12.jessie.d0227;

public class HmwkReview_DaffNum {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			if (isDaffodil(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isDaffodil(int i) {
		int a = 0;
		int b = 0;
		int c = 0;
		int sum = 0;
		a = i / 100;
		b = (i % 100) / 10;
		c = i % 10;
		sum = (a * a * a) + (b * b * b) + (c * c * c);
		if (sum == i) {
			return true;
		} else {
			return false;
		}

		// for (int i = 100; i < 1000; i++) {
		// int a = (i / 100) * (i / 100) * (i / 100);
		// int b = ((i % 100) / 10) * ((i % 100) / 10) * ((i % 100) / 10);
		// int c = (i % 10) * (i % 10) * (i % 10);
		// // int c = ((i % 100) % 10) * ((i % 100) % 10) * ((i % 100) %
		// // 10);//直接对10求余 ，i%10
		// if (i == a + b + c) {
		// System.out.println(i);
		// }
	}
}
