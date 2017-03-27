package d0307;

public class AcctTest {

	public static void main(String[] args) {
		Acct a = new Acct("6000001245785140147", "张三", 1, 0.00);
		a.printInfo();

		a.deposit(3000);
		a.printInfo();

		a.draw(1000);
		a.printInfo();

		a.calcInterest(15.00);
		a.printInfo();

		Acct b = new Acct("6000001245788846897", "李四", 4, 0.00);

		b.printInfo();

		b.deposit(6000);
		b.printInfo();

		b.draw(2000);
		b.printInfo();

		b.calcInterest(35.00);
		b.printInfo();
	}
}
