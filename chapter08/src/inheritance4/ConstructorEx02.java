package inheritance4;

class A {

	public A() {
		
		System.out.println("생성자 A");
	}
	
}
	class B extends A {

	public B() {
		
		System.out.println("생성자 B");
		
	}
	
}
	class C extends B {
		
	public C() {
		super();  // super : 슈퍼클래스(부모클래스)의 생성자를 호출	
		System.out.println("생성자 C");
		
	}

}

public class ConstructorEx02 {

	public static void main(String[] args) {
		C c = new C();
		
	}
	
}
