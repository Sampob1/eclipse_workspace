package abstractex;

public abstract class Computer {     // �߻� �޼ҵ带 ������ �߻� Ŭ����. ����� ����, ����θ� ���� �س��� ������ ������ �ڽ�Ŭ�������� �ϴ� �޼ҵ�. 
	                                 // ���ø�, �����ӿ�ũ����, �������̽� ���� �� �� ��.
	                                 // �߻� Ŭ������ ���� Ŭ������ ���� ����� ���� �ڽ�Ŭ�������� ���� �����̴�.
	
	public abstract void display();  // �߻� �޼ҵ� : �����"()" �� �����ϰ�, �����"{}"�� ���� �޼ҵ�
	abstract public void typing();   // �߻� �޼ҵ�
	
	// public void add(int a, int b){}  // �Ϲ� �޼ҵ�
	
	public void turnOn() {
		System.out.println("������ �մϴ�. ");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�. ");
	}
}
