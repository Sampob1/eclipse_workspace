package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p = new Point();   // Point Ŭ������ ��ü ����
		
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();   // ColorPoint ��ü
		cp.set(3, 4);                       // cp.set �� ���� Ŭ������ Point Ŭ������ �޼ҵ�
		cp.setColor("red");
		cp.showColorPoint();
		
	}
}