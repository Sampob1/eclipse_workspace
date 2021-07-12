package polymorphism3;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}
	
	public void addAnimal() {
		animalList.add(new Human());    // ArrayList에 추가되면서 Animal형으로 자동 형 변환
		animalList.add(new Tiger());    // Animal animal = new Tiger(); Animal타입으로 업캐스팅
		animalList.add(new Eagle());
		
		for(Animal animal : animalList) {   // 배열의 요소들을 Animal형으로 꺼내서 move 호출하면,
			animal.move();                  // 오버라이딩된 함수가 호출됨.
		}
	}
	
	public void testCasting() {
		for(int i = 0; i < animalList.size(); i++) {  // 모든 배열 항목들을 하나씩 돌면서
			Animal animal = animalList.get(i);        // 일단 Animal 타입으로 가져오고
			if(animal instanceof Human) {             // Human 이면
				Human human = (Human)animal;          // Human 형으로 다운 캐스팅
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
				System.out.println("지원되는 않는 형입니다.");
			}
		}
	}
}
