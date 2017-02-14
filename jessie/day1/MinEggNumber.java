package class12.jessie.day1;
import java.util.ArrayList;
public class MinEggNumber {
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		for (int n = 1; n <= 10000; n++) {
			if (n % 2 == 1 && 
					n % 3 == 0 && 
					n % 4 == 1 && 
					n % 5 == 4 && 
					n % 6 == 3 && 
					n % 7 == 0 && 
					n % 8 == 1 && 
					n % 9 == 0) {
				System.out.println(n);
				arr.add(n);
			}
		}

	}
}
