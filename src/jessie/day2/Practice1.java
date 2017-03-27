package day2;

public class Practice1 {

	public static void main(String[] args) {
		// for (int i = 0; i < 100; i++) {
		// if ((i % 2 == 0) && (i % 4 != 0)) {
		// System.out.println(i);
		// }
		// }
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
