package class12.jessie.day1;

public class NarcissusNumber {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = (i / 100) * (i / 100) * (i / 100);
			int b = ((i % 100) / 10) * ((i % 100) / 10) * ((i % 100) / 10);
			int c = ((i % 100) % 10) * ((i % 100) % 10) * ((i % 100) % 10);
			if (a + b + c == i) {
				System.out.println(i);
			}
		}
	}
}