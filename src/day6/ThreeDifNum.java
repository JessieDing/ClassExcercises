package day6;

public class ThreeDifNum {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					if (i != j && i != k && j != k) {
						count++;
						System.out.print(i);
						System.out.print(j);
						System.out.print(k);
						System.out.println();
					}
				}
			}
		}
		System.out.print(count);
	}

}
