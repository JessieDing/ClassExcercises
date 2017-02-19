package class12.jessie.day3;

public class Three {

	public static void main(String[] args) {
		boolean[] nub = new boolean[6];

		for (int i = 0; i < nub.length; i++) {
			nub[i] = true;
		}
		int index = 0;
		int count = 0;
		int leftLen = nub.length;

		while (leftLen > 1) {

			if (nub[index] == true) {
				count++;
				if (count == 3) {
					nub[index] = false;
					count = 0;
					leftLen--;
				}
			}
			index++;
			if (index == leftLen) {
				index = 0;
			}
		}

		for (int i = 0; i < nub.length; i++) {
			if (nub[i] == true) {
				System.out.println("Ê£ÏÂ£º" + (i + 1));
			}
		}

	}
}