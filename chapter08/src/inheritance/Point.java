package inheritance;

public class Point {

	private int x, y;   // 좌표를 나타내는 변수
	                      // protected : default 접근 제한자와 동일하지만 default는 다른 패키지에서는 접근이 불가능하다.
	
	public void set(int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
