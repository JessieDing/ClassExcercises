package class12.jessie.day3;

public class DyadicArray {

	public static void main(String[] args) {
		// int[][] a = new int[2][3];
		// a[0][0] = 0;
		// a[0][1] = 1;
		// a[0][2] = 2;
		// a[1][0] = 3;
		// a[1][1] = 4;
		// a[1][2] = 5;
		// System.out.println(Arrays.toString(a[0]));
		// System.out.println(Arrays.toString(a[1]));
		// System.out.println("length:" + a.length);

		int[][] b = new int[][] { { 0, 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		int[][] c = new int[3][];
		c[0] = new int[3];
		c[1] = new int[2];
		c[2] = new int[4];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
