package class12.jessie.d0307;

//修改3月2 银行账户作业
public class Acct {
	private String acct_no;// 账号
	private String acct_name;// 户名
	private int status;// 状态（1.正常 ，2.销户，3.冻结，4.挂失）
	private double balance;

	Acct() {
		acct_no = "";
		acct_name = "";
		status = 0;
		balance = 0.00;
	}

	Acct(String acct_no, String acct_name, int status, double balance) {
		this.acct_no = acct_no;
		this.acct_name = acct_name;
		this.status = status;
		this.balance = balance;
	}

	public int deposit(double amt) {// 存款
		if (status == 1 || status == 3) {
			balance += amt;// 将存款金额加到账户余额上
			return 0; // 成功
		} else {
			System.out.println("账户状态非法");
			return -1; // 失败
		}
	}

	public int draw(double amt) {// 取款
		if (status != 1 && status != 3) {
			System.out.println("账户状态非法");
			return -1;
		}
		if (balance - amt > 0.00001) { // 判断账户余额是否充足
			balance -= amt;
			return 0;
		} else {
			return -1;
		}
	}

	public int calcInterest(double amt) {
		if (status == 2) {
			System.out.println("账户状态异常");
			return -1;
		}
		if (amt - 0.01 > 0.00001) {
			balance += amt;
		}
		return 0;
	}

	public void printInfo() {
		System.out.println("----------------------");
		System.out.println("账号：" + acct_no);
		System.out.println("户名：" + acct_name);
		System.out.println("状态：" + status);
		System.out.println("余额：" + balance);
	}
}
