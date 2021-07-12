package override;

class Shape{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {                  // <다형성>draw 메소드 재정의(메소드 오버라이딩) 1) 매개변수가 있으면 새로운 메소드가 되는거여서 안된다.(매개변수가 없어야 함)
		System.out.println("Line");
	}
}
class Rect extends Shape{                 // 메소드 오버라이딩 2) 리턴값없는 void로 해야 한다.
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{               // 메소드 오버라이딩 3) 
	public void draw() {
		System.out.println("Circle");
	}
}

public class OverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();       // 
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
