package test;

public class Sonata extends Car{

	@Override
	public void start() {
		System.out.println("Sonota �õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println("Sonota �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("Sonota ����ϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonota �õ��� ���ϴ�.");
	}


}
