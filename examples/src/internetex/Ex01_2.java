package internetex;
// 4) do-while ���� �̿��Ͽ� �����ϰ� ����Ǵ� DoWhileTest Ŭ������ �ۼ��϶�.

public class Ex01_2 {
	
	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		
		do {
			sum = sum + i;
			i +=2;
			
		}while(i < 100);
		System.out.println(sum);
	}

}
