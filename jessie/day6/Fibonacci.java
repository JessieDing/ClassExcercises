package class12.jessie.day6;

//丁洁
public class Fibonacci {
	// 斐波拉契数列指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
	// 这个数列从第3项开始，每一项都等于前两项之和。
	// 在数学上，斐波纳契数列以如下被以递归的方法定义：F(0)=1，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
	public static void main(String[] args) {
		int n = 6;
		System.out.println("第" + n + "个斐波拉契数为：");
		System.out.println(getFib(n));
	}

	public static int getFib(int n) {
		if (n < 1) {
			System.out.println("参数必须大于1");
		}
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return getFib(n - 1) + getFib(n - 2);
		}
	}
}
