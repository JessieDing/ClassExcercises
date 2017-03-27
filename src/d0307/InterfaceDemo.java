package d0307;

import java.util.Date;

public class InterfaceDemo {

	public static void main(String[] args) {
		// ����������
		for (int i = 0; i < 3; i++) {
			BankTrans bankTrans = bankTransFactory(i);
			if (bankTrans.doTrans() == 0) { // ���׳ɹ�����ӡƾ��
				bankTrans.doPrint();
			}
		}
	}

	public static BankTrans bankTransFactory(int type) { // ���󹤳�ģʽ
		if (type == 1) {
			return new Deposit();
		} else if (type == 2) {
			return new Payment();
		} else {
			return new Payment();
		}
	}
}

class Msg {
	String trans_code;
	String trans_name;
	Date trans_date;
	String trans_sn;
	double amt;
	double balance;
	double chgAmt;

	Msg(String strCode, String strName, Date dtTransDate, String strSn, double dAmt, double dBal, double dChgAmt) {
		trans_code = strCode;
		trans_name = strName;
		trans_date = dtTransDate;
		trans_sn = strSn;
		amt = dAmt;
		balance = dBal;
		chgAmt = dChgAmt;
	}
}

interface BankTrans {
	public int doTrans(); // ������

	public int doPrint(); // ��ӡ����ƾ��
}

class Deposit implements BankTrans {
	private Msg m;

	Deposit() {
		m = new Msg("0001", "���", new Date(), "SN0001", 1000.00, 2000.00, 0.00);
	}

	@Override
	public int doTrans() {
		System.out.println("BankTrans:Deposit");
		return 0;
	}

	@Override
	public int doPrint() {
		System.out.println("                  " + m.trans_name + "ƾ����" + m.trans_code + "��");
		System.out.println("��������: " + m.trans_date.toString());
		System.out.println("������ˮ: " + m.trans_sn);
		System.out.println("�����: " + m.amt);
		System.out.println("�˻����: " + m.balance);
		System.out.println("");
		return 0;
	}
}

class Payment implements BankTrans {
	private Msg m;

	Payment() {
		m = new Msg("0002", "���", new Date(), "SN0002", 2000.00, 3000.00, 5.00);
	}

	@Override
	public int doTrans() {
		System.out.println("BankTrans:Payment");
		return 0;
	}

	@Override
	public int doPrint() {
		System.out.println("                  " + m.trans_name + "ƾ����" + m.trans_code + "��");
		System.out.println("��������: " + m.trans_date.toString());
		System.out.println("������ˮ: " + m.trans_sn);
		System.out.println("��ҽ��: " + m.amt);
		System.out.println("������: " + m.chgAmt);
		// System.out.println("�������ۿ�: 80%" );
		System.out.println("");
		return 0;
	}
}
