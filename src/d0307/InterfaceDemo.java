package d0307;

import java.util.Date;

public class InterfaceDemo {

	public static void main(String[] args) {
		// 交易主流程
		for (int i = 0; i < 3; i++) {
			BankTrans bankTrans = bankTransFactory(i);
			if (bankTrans.doTrans() == 0) { // 交易成功，打印凭条
				bankTrans.doPrint();
			}
		}
	}

	public static BankTrans bankTransFactory(int type) { // 对象工厂模式
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
	public int doTrans(); // 做交易

	public int doPrint(); // 打印交易凭条
}

class Deposit implements BankTrans {
	private Msg m;

	Deposit() {
		m = new Msg("0001", "存款", new Date(), "SN0001", 1000.00, 2000.00, 0.00);
	}

	@Override
	public int doTrans() {
		System.out.println("BankTrans:Deposit");
		return 0;
	}

	@Override
	public int doPrint() {
		System.out.println("                  " + m.trans_name + "凭条【" + m.trans_code + "】");
		System.out.println("交易日期: " + m.trans_date.toString());
		System.out.println("交易流水: " + m.trans_sn);
		System.out.println("存款金额: " + m.amt);
		System.out.println("账户余额: " + m.balance);
		System.out.println("");
		return 0;
	}
}

class Payment implements BankTrans {
	private Msg m;

	Payment() {
		m = new Msg("0002", "汇兑", new Date(), "SN0002", 2000.00, 3000.00, 5.00);
	}

	@Override
	public int doTrans() {
		System.out.println("BankTrans:Payment");
		return 0;
	}

	@Override
	public int doPrint() {
		System.out.println("                  " + m.trans_name + "凭条【" + m.trans_code + "】");
		System.out.println("交易日期: " + m.trans_date.toString());
		System.out.println("交易流水: " + m.trans_sn);
		System.out.println("汇兑金额: " + m.amt);
		System.out.println("手续费: " + m.chgAmt);
		// System.out.println("手续费折扣: 80%" );
		System.out.println("");
		return 0;
	}
}
