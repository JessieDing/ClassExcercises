package day6;

//丁洁
//写一个算法，判断一个数组是否是另一个数组的子数组
//如：数组1{'a','b','c','d'},数组2为{'b','c','d'}
//则2为1的子数组
public class SubSet {

	public static void main(String[] args) {
		char[] a = new char[] { 'a', 'b', 'c', 'd' };
		char[] b = new char[] { 'b', 'c', 'd' };
		System.out.println("b是a的子数组吗？");
		isSubset(a, b);
	}

	public static void isSubset(char[] a, char[] b) {
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] == b[i]) {
					count++;
				}
			}
		}
		if (count >= b.length) {
			System.out.println("是");
		} else {
			System.out.println("不是");
		}
	}
}
