package finalex;

public class Constant {
	
	int num = 10;
	int nUM = 20;
	int nUm = 30;
	final int NUM = 100;    // ���
	
	public static void main(String[] args) {
		
		Constant constant = new Constant();
		constant.num = 50;
//		constant.NUM = 200;  // final�� ����� ����̱� ������ ���� �Ҵ� �� �� ����.
		
		System.out.println(constant.num);
		System.out.println(constant.nUM);
		System.out.println(constant.nUm);
		System.out.println(constant.NUM);
	}
}
