package class12.jessie.d0227;

public class HmwkRev_SubSet {
	// 数组中*连续*的一个或多个整数组成一个子数组?
	public static void main(String[] args) {
		char[] a = new char[] { 'a', 'b', 'c', 'd', 'e' };
		char[] b = new char[] { 'b', 'c', 'd' };
		System.out.println("b是a的子数组吗？");
		isSubset(a, b);
	}

	public static void isSubset(char[] a, char[] b) {
		int count = 0;
		boolean flag = true;
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] != b[j]) {
					flag = false;
					break;
				} else {
					count++;
				}
			}
		}
		if (count == b.length || flag == true) {
			System.out.println("是");
		} else {
			System.out.println("不是");
		}
	}
}
