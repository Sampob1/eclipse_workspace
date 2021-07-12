package template;

public abstract class Car {

	public abstract void drive();   // 추상 메서드, 서브 클래스에서 재정의 해서 사용,
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() {   // 템플릿 메서드 (반드시 하위처럼 구성을 해야한다.순서,규칙을 정의, 하위에서 재정의 불가능)
		startCar();             // 1. 시동을 켭니다. 
		drive();                // 2. 운행을 합니다,(자동, 수동)
		stop();                 // 3. 차가 멈춤(자동, 수동)
		turnOff();              // 2, 시동을 끕니다.
	}
}
