package template;

public abstract class Car {

	public abstract void drive();   // �߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���,
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() {   // ���ø� �޼��� (�ݵ�� ����ó�� ������ �ؾ��Ѵ�.����,��Ģ�� ����, �������� ������ �Ұ���)
		startCar();             // 1. �õ��� �մϴ�. 
		drive();                // 2. ������ �մϴ�,(�ڵ�, ����)
		stop();                 // 3. ���� ����(�ڵ�, ����)
		turnOff();              // 2, �õ��� ���ϴ�.
	}
}
