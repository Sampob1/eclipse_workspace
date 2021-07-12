package override2;

class Shape2{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Shape2");
	}
}

public class Circle extends Shape2 {
	/*
	// @Override  // ������̼� : �������̵��� �� �� �߸��� �κ��� �˷��� �� �ִ� ���. ���� ���ְ� ���ڰ��� �־��شٸ� ������ �ȶ߰� ���ο� �޼ҵ�� ���������� ������ �������������� ���.
	public void draw(int a) {
		System.out.println("Circle");
	}
*/
	
	@Override
	public void draw() {  // Alt + Shift + s ������ �������̵� �ڵ��ۼ� ����.
		System.out.println("Circle");
	}
	
	public static void main(String[] args) {
		Shape2 b = new Circle();    // ��ĳ����
		b.paint();

	}


}
