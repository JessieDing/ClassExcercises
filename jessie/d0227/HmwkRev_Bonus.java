package class12.jessie.d0227;

import java.util.Scanner;

//��ҵ���ŵĽ������������ɡ�
//����(I)���ڻ����10��Ԫʱ���������10%��
// �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣������7.5%��
// 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
// 40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
// 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%��
//����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
// �Ӽ������뵱������I����Ӧ���Ž���������
public class HmwkRev_Bonus {
	public static void main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����뵱������");
		double i = scan.nextDouble();
		System.out.println("Ӧ����������Ϊ��" + calcBonus(i));
		scan.close();
	}

	public static double calcBonus(double margin) {
		double temp = 0;
		double bonus = 0;
		if (margin > 1000000) {
			temp = margin - 1000000.00;// 1�������ϲ�����㲿��
			bonus += (temp * 0.10);
			margin -= temp;// �����Ѿ�����Ĳ���
		}
		if (margin > 600000) {
			temp = margin - 600000.00;// ��ʮ����1���������㲿��
			bonus += (temp * 0.015);
			margin -= temp;
		}
		if (margin > 400000) {
			temp = margin - 400000.00;
			bonus += (temp * 0.03);
			margin -= temp;
		}
		if (margin > 200000) {
			temp = margin - 200000.00;
			bonus += (temp * 0.05);
			margin -= temp;
		}
		if (margin > 100000) {
			temp = margin - 100000.00;
			bonus += (temp * 0.075);
			margin -= temp;
		}
		bonus += (margin * 0.10);
		return bonus;
	}

}
