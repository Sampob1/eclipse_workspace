package override;

class Shape{
	public Shape next;
	public Shape() {next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {                  // <������>draw �޼ҵ� ������(�޼ҵ� �������̵�) 1) �Ű������� ������ ���ο� �޼ҵ尡 �Ǵ°ſ��� �ȵȴ�.(�Ű������� ����� ��)
		System.out.println("Line");
	}
}
class Rect extends Shape{                 // �޼ҵ� �������̵� 2) ���ϰ����� void�� �ؾ� �Ѵ�.
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{               // �޼ҵ� �������̵� 3) 
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
