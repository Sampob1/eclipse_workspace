package internetex; 
// 3) for ���� �̿��Ͽ� �����ϰ� ����Ǵ� ForTest Ŭ������ �ۼ��϶�.

public class Ex01_1 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 100;  ) {
			sum += i;
			i = i + 2;
		}
		System.out.println(sum);
	}

}
