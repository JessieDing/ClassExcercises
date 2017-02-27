package class12.jessie.d0227;

public class HmwkRev_D_Array {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 1, 2 }, { 2, 3, 4 }, { 4, 5, 6, 7 } };
		System.out.println("各个元素累加之和为：" + getSum(arr));
	}

	public static int getSum(int[][] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				n = n + arr[i][j];
			}
		}
		return n;
	}
}
