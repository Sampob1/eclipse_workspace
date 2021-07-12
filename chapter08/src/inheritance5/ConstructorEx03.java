package inheritance5;

class A{  // 아래와 같은 것을 "메소드 오버로딩" 이라고 한다.
	      // 1) 동일한 메소드 이름, 2) 각기 다른 기능의 메소드
	public A(){
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수 생성자 A");
	}
	public A(int x, int y) {
		System.out.println("매개변수 생성자 2개 A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		// super(); 가 기본적으로 생략되어 있다. 이것의 역할은 상속이 적용되어 있을 때 상위의 슈퍼클래스를 먼저 호출하는 예약어.
		super(10, 20);
		System.out.println("매개변수 생성자 B");
	}
}

public class ConstructorEx03 {

	public static void main(String[] args) {
		B b = new B(5);
	}
	
}
