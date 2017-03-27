package d0302;
//作业，存在几处问题：
//一、无意义的继承。
// 张三的账户即是Acct账户类的实例，直接用带参的构造函数new出即可。
// 注意理解和应用面向对象的思想。
//二、存取款、结息之前，先判断账户状态，再进行相应操作。

public class AcctTest {

	public static void main(String[] args) {
		ZSAcct zhangsan = new ZSAcct("6222020000000000001", "张三", 1, 0.00);
		System.out.println("张三存了2000元：");
		zhangsan.deposit(2000.00);
		zhangsan.printInfo();
		System.out.println("张三取了1000元：");
		zhangsan.draw(1000.00);
		zhangsan.printInfo();
		double intereAmt = zhangsan.calcInterest(zhangsan.getBalance());
		System.out.println("张三结息：" + intereAmt);
		System.out.println("张三销户：");
		zhangsan.setStatus(2);
		zhangsan.acctStatus();
	}

}

class ZSAcct extends Acct {
	// 无意义的继承。
	// 张三的账户即是Acct账户类的实例，直接用带参的构造函数new出即可。
	// 注意理解和应用面向对象的思想。
	ZSAcct(String acct_no, String acct_name, int status, double balance) {
		setAcct_no(acct_no);
		setAcct_name(acct_name);
		setStatus(status);
		setBalance(balance);
	}
}

class Acct {

	private String acct_no;
	private String acct_name;
	private int status;
	private double balance;

	public String getAcct_no() {
		return acct_no;
	}

	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}

	public String getAcct_name() {
		return acct_name;
	}

	public void setAcct_name(String acct_name) {
		this.acct_name = acct_name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 存款
	public double deposit(double amt) {
		balance = balance + amt;
		return balance;
	}

	// 取款
	public double draw(double amt) {
		balance = balance - amt;
		return balance;
	}

	// 结息
	public double calcInterest(double amt) {
		double interest = balance * 0.02;
		return interest;
	}

	// 显示账户状态
	public void acctStatus() {
		switch (getStatus()) {
		case 1:
			System.out.println(acct_name + "," + acct_no + "," + "账户状态：正常");
			break;
		case 2:
			System.out.println(acct_name + "," + acct_no + "," + "账户状态：销户");
			break;
		case 3:
			System.out.println(acct_name + "," + acct_no + "," + "账户状态：冻结");
			break;
		case 4:
			System.out.println(acct_name + "," + acct_no + "," + "账户状态：挂失");
			break;
		}
	}

	// 打印账户信息
	public void printInfo() {
		System.out.println(acct_name + "," + acct_no + "," + "账户余额：" + balance);
	}

}