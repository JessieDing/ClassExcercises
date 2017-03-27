package day6;

public class PassByReference {
	// 这段代码最后打印出来的结果是jessie，因为是引用传递的，所以外面的person的名字被改成了jessie。
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Woody";
		changeName(person);
		System.out.print(person.name);
	}

	public static void changeName(Person person) {
		person.name = "Jessie";
	}
}

class Person {
	String name;
}
