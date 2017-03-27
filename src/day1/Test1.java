package day1;

public class Test1 {

	public static void main(String[] args) {
//		int a = 5;
//		int b = 4;
//		int max;
//		max = (a>b)?a:b;
//		System.out.println(max);
		double bB=1000.00;//本金为1000.00
		double bLL=0.02;
		double bLN=bLL*bB;//一年的利息=本金*年利率
		double bT=bLL/360;//计算天利率
		double bLT=20*bT*bB;//20的利息=本金*天利率*20
		double LL=bLN+bLT;//计算一年20天的利息
		
		System.out.println(LL);
	}
}
