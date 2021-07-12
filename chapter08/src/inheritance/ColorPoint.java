package inheritance;

public class ColorPoint extends Point{

	private String color;   // 점의 색
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();   // 상속받은 메소드, Point 클래스의 메소드 호출
	}
	
	//public static void main(String[] args) {
		
	//	Point p = new Point();
		
		//p.x = 1;
		//p.y = 2;
//	}
	
	
}
