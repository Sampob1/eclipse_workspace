package internetex;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		while(i < 100) {
			sum = sum +i;
			i +=2;
		}
		System.out.println(sum);
	}

}

// 1) ������ ����ϴ� �ڵ��̸� ���� ��� ��µǴ� ������?
// - i ��� ������ while ������ ���� 100�� �Ǳ� ������ 2�� ���ذ��� �� ���� sum�� ���Ѵ� => 0���� 100���� 2�� ����� ���� ���� ���ϴ� ��.

// 2) ���� �ڵ带 main() �޼ҵ�� ����� whileTest Ŭ������ �ϼ��϶�.
// 

// 3) for ���� �̿��Ͽ� �����ϰ� ����Ǵ� ForTest Ŭ������ �ۼ��϶�.
// - Ex01_1

// 4) do-while ���� �̿��Ͽ� �����ϰ� ����Ǵ� DoWhileTest Ŭ������ �ۼ��϶�.
// - Ex02_2