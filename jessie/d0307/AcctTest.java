package class12.jessie.d0307;

public class AcctTest {

	public static void main(String[] args) {
		Acct a = new Acct("600000124578514", "уехЩ", 1, 0.00);
		a.printInfo();

		a.deposit(3000);
		a.printInfo();

		a.draw(1000);
		a.printInfo();

		a.calcInterest(15.00);
		a.printInfo();

	}

}
