package day1;

public class Test3 {

	public static void main(String[] args) {
		int i = 0;
		 while (i <= 100) {
		 if (i % 2 == 0 && i % 3 == 0) {
		 System.out.println(i);
		 }
		 i++;
		 }
//		while ((i <= 100) && (i % 2 == 0)) {//判断为false，不进入循环
//			System.out.println(i);
//			i++;
//		}

		// for (int n = 0; n <= 100; n++) {
		// if (n % 2 == 0 && n % 3 == 0) {
		// System.out.println(n);
		// }
		// }
		System.out.println("执行完毕");
	}
}
