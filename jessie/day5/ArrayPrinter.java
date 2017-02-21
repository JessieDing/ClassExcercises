package class12.jessie.day5;

public class ArrayPrinter {

	public static void printArr(int[] a, char b) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(b);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 85, 78, 23, 7, 5, 60 };
		printArr(arr, '¡¢');

		// char a = '1';
		// char b = '2';
		// System.out.println(a + b);
	}

}
