package override3;

class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {  // 서브클래스에서 재정의가 되었기 때문에 슈퍼클래스의 draw(){} 메소드가 서브클래스의 draw(){} 메소드로 실행된다.
		System.out.println(name);
	}
}

public class Circle extends Shape {
	protected String name;	
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";   // 생성자 안에서 super 쓸때는 첫 라인에 와야하지만 현재는 메소드 내에 있기 때문에 첫 라인에 안와도 된다.
		super.draw(); // 1번 출력 Shape
		System.out.println(name);  // 2번 출력 Circle
	}

	public static void main(String[] args) {
		Shape b = new Circle();   // 업캐스팅. 서브클래스에서 부모클래스의 영역만 사용
		b.paint();

	}

}
