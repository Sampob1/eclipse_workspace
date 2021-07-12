package override3;

class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {  // ����Ŭ�������� �����ǰ� �Ǿ��� ������ ����Ŭ������ draw(){} �޼ҵ尡 ����Ŭ������ draw(){} �޼ҵ�� ����ȴ�.
		System.out.println(name);
	}
}

public class Circle extends Shape {
	protected String name;	
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";   // ������ �ȿ��� super ������ ù ���ο� �;������� ����� �޼ҵ� ���� �ֱ� ������ ù ���ο� �ȿ͵� �ȴ�.
		super.draw(); // 1�� ��� Shape
		System.out.println(name);  // 2�� ��� Circle
	}

	public static void main(String[] args) {
		Shape b = new Circle();   // ��ĳ����. ����Ŭ�������� �θ�Ŭ������ ������ ���
		b.paint();

	}

}
