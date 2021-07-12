package inheritance2;

public class Student extends Person {
	
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99; // private, setter를 통해서 변수에 값을 할당.
		setWeight(99);
	}

}
