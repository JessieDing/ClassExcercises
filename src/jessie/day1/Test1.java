package day1;

public class Test1 {

	public static void main(String[] args) {
//		int a = 5;
//		int b = 4;
//		int max;
//		max = (a>b)?a:b;
//		System.out.println(max);
		double bB=1000.00;//����Ϊ1000.00
		double bLL=0.02;
		double bLN=bLL*bB;//һ�����Ϣ=����*������
		double bT=bLL/360;//����������
		double bLT=20*bT*bB;//20����Ϣ=����*������*20
		double LL=bLN+bLT;//����һ��20�����Ϣ
		
		System.out.println(LL);
	}
}
