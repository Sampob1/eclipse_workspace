package abstractex;

public abstract class Computer {     // 추상 메소드를 포함한 추상 클래스. 실행부 없이, 선언부만 선언 해놓고 구현은 하위의 자식클래스에서 하는 메소드. 
	                                 // 템플릿, 프레임워크구현, 인터페이스 구현 할 때 씀.
	                                 // 추상 클래스를 슈퍼 클래스로 보통 만들어 놓고 자식클래스에서 쓰는 형태이다.
	
	public abstract void display();  // 추상 메소드 : 선언부"()" 만 존재하고, 실행부"{}"가 없는 메소드
	abstract public void typing();   // 추상 메소드
	
	// public void add(int a, int b){}  // 일반 메소드
	
	public void turnOn() {
		System.out.println("전원을 켭니다. ");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다. ");
	}
}
