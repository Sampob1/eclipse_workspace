package polymorphism3;

import java.util.ArrayList;

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
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		animalList.add(new Human());    // ArrayList�� �߰��Ǹ鼭 Animal������ �ڵ� �� ��ȯ
		animalList.add(new Tiger());    // Animal animal = new Tiger(); AnimalŸ������ ��ĳ����
		animalList.add(new Eagle());
		
		for(Animal animal : animalList) {   // �迭�� ��ҵ��� Animal������ ������ move ȣ���ϸ�,
			animal.move();                  // �������̵��� �Լ��� ȣ���.
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < animalList.size(); i++) {  // ��� �迭 �׸���� �ϳ��� ���鼭
			Animal animal = animalList.get(i);        // �ϴ� Animal Ÿ������ ��������
			if(animal instanceof Human) {             // Human �̸�
				Human human = (Human)animal;          // Human ������ �ٿ� ĳ����
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("�����Ǵ� �ʴ� ���Դϴ�.");
			}
		}
	}
}
