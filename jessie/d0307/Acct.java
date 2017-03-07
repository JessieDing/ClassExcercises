package class12.jessie.d0307;

//�޸�3��2 �����˻���ҵ
public class Acct {
	private String acct_no;// �˺�
	private String acct_name;// ����
	private int status;// ״̬��1.���� ��2.������3.���ᣬ4.��ʧ��
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

	public int deposit(double amt) {// ���
		if (status == 1 || status == 3) {
			balance += amt;// �������ӵ��˻������
			return 0; // �ɹ�
		} else {
			System.out.println("�˻�״̬�Ƿ�");
			return -1; // ʧ��
		}
	}

	public int draw(double amt) {// ȡ��
		if (status != 1 && status != 3) {
			System.out.println("�˻�״̬�Ƿ�");
			return -1;
		}
		if (balance - amt > 0.00001) { // �ж��˻�����Ƿ����
			balance -= amt;
			return 0;
		} else {
			return -1;
		}
	}

	public int calcInterest(double amt) {
		if (status == 2) {
			System.out.println("�˻�״̬�쳣");
			return -1;
		}
		if (amt - 0.01 > 0.00001) {
			balance += amt;
		}
		return 0;
	}

	public void printInfo() {
		System.out.println("----------------------");
		System.out.println("�˺ţ�" + acct_no);
		System.out.println("������" + acct_name);
		System.out.println("״̬��" + status);
		System.out.println("��" + balance);
	}
}
