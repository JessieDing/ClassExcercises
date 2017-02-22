package class12.jessie.day6;

public class RecursiveInvoca {

	public static void main(String[] args) {
		fun(10);
	}

	public static void fun(int i) {
		if (i > 0) {
			i--;
			fun(i);
			System.out.print(i);
		}
		System.out.print(" ok ");
	}
}
