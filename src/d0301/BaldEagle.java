package d0301;
package class12.jessie.d0302.

public class BaldEagle extends Eagle {

	// 若package class12.jessie.d0301中Eagle类中，
	// legNum修饰符为默认，则此处会报错。
	// 此时d0301包的Eagle类中legNum修饰符为protected
	// 因此，虽然子类与父类不在一个包，但子类仍然可以访问
	int leg = legNum;

	@Override
	public void fly() {
		super.fly();
	}
}
