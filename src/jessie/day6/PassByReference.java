package day6;

public class PassByReference {
	// ��δ�������ӡ�����Ľ����jessie����Ϊ�����ô��ݵģ����������person�����ֱ��ĳ���jessie��
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
