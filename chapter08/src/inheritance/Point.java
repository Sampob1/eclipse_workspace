package inheritance;

public class Point {

	private int x, y;   // ��ǥ�� ��Ÿ���� ����
	                      // protected : default ���� �����ڿ� ���������� default�� �ٸ� ��Ű�������� ������ �Ұ����ϴ�.
	
	public void set(int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	public void showPoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
}