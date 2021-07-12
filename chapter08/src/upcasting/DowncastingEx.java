package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("박장우");  // 업캐스팅 생성
										 // 업캐스팅 생성 시, p =(Person)s; 의 자료형(Person) 을 자동으로 넣어주기 때문에 생략 가능하다.
		
		Student s;
		s = (Student)p;                  // 다운캐스팅 생성
		                                 // *다운캐스팅하는 s(자식클래스)의 자료형을 반드시 명시해야함*
		
		System.out.println(p.name);
		s.grade = "A";
		



	}

}
