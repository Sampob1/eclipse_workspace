package polymorphism;

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
}
class Tiger extends Animal{
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}
class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}	
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human()); // Animal animal = new Human(); 업캐스팅
		aTest.moveAnimal(new Tiger()); // Animal animal = new Tiger(); 업캐스팅
		aTest.moveAnimal(new Eagle()); // Animal animal = new Eagle(); 업캐스팅
	}
	public void moveAnimal(Animal animal) {  // 업캐스팅 
		animal.move(); // 메소드를 만들어버리는 이유는 객체생성으로 했을 경우 휴먼, 타이거, 이글 3개의 객체생성을 따로따로 해줘야 하기 때문이다.
	} 
}
//student나 고객관리도 이렇게 한번 만들어보자.
