package class12.jessie.day3;

//����
public class MultiplicationTable {

	public static void main(String[] args) {
		int[][] a = new int[9][];
		for (int i = 1; i <= a.length; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (j * i) + " ");
			}
			System.out.println();
		}

	}

}
