package polymorphism;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}
class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}	
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human()); // Animal animal = new Human(); ��ĳ����
		aTest.moveAnimal(new Tiger()); // Animal animal = new Tiger(); ��ĳ����
		aTest.moveAnimal(new Eagle()); // Animal animal = new Eagle(); ��ĳ����
	}
	public void moveAnimal(Animal animal) {  // ��ĳ���� 
		animal.move(); // �޼ҵ带 ���������� ������ ��ü�������� ���� ��� �޸�, Ÿ�̰�, �̱� 3���� ��ü������ ���ε��� ����� �ϱ� �����̴�.
	} 
}
//student�� �������� �̷��� �ѹ� ������.
