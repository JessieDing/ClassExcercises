package class12.jessie.d0302;

public class CompareTest {

	public static void main(String[] args) {
		Compare cp = new Compare();
		System.out.println(cp.max(56, 69));
		System.out.println(cp.max(3.1415, 3.1412));
	}
}

class Compare {
	public int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public double max(double a, double b) {
		if ((a - b) > 0.00001) {
			return a;
		} else {
			return b;
		}
	}
}
