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
	// @Override  // 어노테이션 : 오버라이딩을 할 때 잘못된 부분을 알려줄 수 있는 기능. 만약 없애고 인자값을 넣어준다면 오류가 안뜨고 새로운 메소드로 만들어버리기 때문에 오류방지용으로 사용.
	public void draw(int a) {
		System.out.println("Circle");
	}
*/
	
	@Override
	public void draw() {  // Alt + Shift + s 누르고 오버라이딩 자동작성 가능.
		System.out.println("Circle");
	}
	
	public static void main(String[] args) {
		Shape2 b = new Circle();    // 업캐스팅
		b.paint();

	}


}
