package d0302;
//��ҵ�����ڼ������⣺
//һ��������ļ̳С�
// �������˻�����Acct�˻����ʵ����ֱ���ô��εĹ��캯��new�����ɡ�
// ע������Ӧ����������˼�롣
//������ȡ���Ϣ֮ǰ�����ж��˻�״̬���ٽ�����Ӧ������

public class AcctTest {

	public static void main(String[] args) {
		ZSAcct zhangsan = new ZSAcct("6222020000000000001", "����", 1, 0.00);
		System.out.println("��������2000Ԫ��");
		zhangsan.deposit(2000.00);
		zhangsan.printInfo();
		System.out.println("����ȡ��1000Ԫ��");
		zhangsan.draw(1000.00);
		zhangsan.printInfo();
		double intereAmt = zhangsan.calcInterest(zhangsan.getBalance());
		System.out.println("������Ϣ��" + intereAmt);
		System.out.println("����������");
		zhangsan.setStatus(2);
		zhangsan.acctStatus();
	}

}

class ZSAcct extends Acct {
	// ������ļ̳С�
	// �������˻�����Acct�˻����ʵ����ֱ���ô��εĹ��캯��new�����ɡ�
	// ע������Ӧ����������˼�롣
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

	// ���
	public double deposit(double amt) {
		balance = balance + amt;
		return balance;
	}

	// ȡ��
	public double draw(double amt) {
		balance = balance - amt;
		return balance;
	}

	// ��Ϣ
	public double calcInterest(double amt) {
		double interest = balance * 0.02;
		return interest;
	}

	// ��ʾ�˻�״̬
	public void acctStatus() {
		switch (getStatus()) {
		case 1:
			System.out.println(acct_name + "," + acct_no + "," + "�˻�״̬������");
			break;
		case 2:
			System.out.println(acct_name + "," + acct_no + "," + "�˻�״̬������");
			break;
		case 3:
			System.out.println(acct_name + "," + acct_no + "," + "�˻�״̬������");
			break;
		case 4:
			System.out.println(acct_name + "," + acct_no + "," + "�˻�״̬����ʧ");
			break;
		}
	}

	// ��ӡ�˻���Ϣ
	public void printInfo() {
		System.out.println(acct_name + "," + acct_no + "," + "�˻���" + balance);
	}

}