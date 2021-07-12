package ex;

	class Person{
		int age;
		String name;
		boolean isMarried;
		int child;

	public void getPersonInfo() {
		System.out.println("이 사람의 나이는 " + age + "살 입니다.");
		System.out.println("이 사람의 이름은 " + name + " 입니다.");
		System.out.println("이 사람의 결혼여부는 " + isMarried + " 입니다.");
		System.out.println("이 사람의 자녀 수는 " + child + "명 입니다.");
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
