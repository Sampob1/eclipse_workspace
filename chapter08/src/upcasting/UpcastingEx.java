package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("박장우");

		p = s;  // Upcasting(업캐스팅) - s(자식) 객체를 p(부모)에 대입함으로 부모클래스의 변수만 사용 가능한 객체(p)를 new선언 없이 만든다.
		        // s 는 부모클래스와 자식클래스 둘 다 접근 가능하지만 p 는 부모클래스만 접근 가능.
		
		// Person p = new Student("박장우");  // 업캐스팅을 이처럼 같단하게 만들 수도 있다. *단, p만 생성되기 때문에 s를 따로 선언하진 않는 이상 s는 생성되지 않은 상태이다.
		
		System.out.println(p.name);
		
		// p.grade = "A";           // 컴파일 오류 발생
		// p.department = "HR";     // 컴파일 오류 발생
		// p.name = "홍길동";
		// p.id = "ID";
		
		
		// s.grade = "A";
		// s.department = "HR";
		// s.id = "ID";
		// s.name = "김똘똘";
		
	}

}
