package ex;

	class Person{
		int age;
		String name;
		boolean isMarried;
		int child;

	public void getPersonInfo() {
		System.out.println("�� ����� ���̴� " + age + "�� �Դϴ�.");
		System.out.println("�� ����� �̸��� " + name + " �Դϴ�.");
		System.out.println("�� ����� ��ȥ���δ� " + isMarried + " �Դϴ�.");
		System.out.println("�� ����� �ڳ� ���� " + child + "�� �Դϴ�.");
		}
	}
public class Ex06 {
	public static void main(String[] args) {
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.child = 3;
		
		person.getPersonInfo();
	}

}
