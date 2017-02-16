package class12.jessie.day3;

import java.util.Arrays;

public class DyadicArray {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		a[0][0] = 0;
		a[0][1] = 1;
		a[0][2] = 2;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;
		System.out.println(Arrays.toString(a[0]));
		System.out.println(Arrays.toString(a[1]));
		System.out.println("length:" + a.length);
	}
}
