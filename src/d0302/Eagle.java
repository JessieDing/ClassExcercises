package d0302;

import d0307.Bird;

public class Eagle extends Bird {
	protected int legNum = 2;

	public void eat() {
		System.out.println("老鹰吃肉");
	}

	public void fly() {
		System.out.println("老鹰飞的又高又快");
	}
}