package internetex;
// ������ 10�� �����ϴ� �迭�� ����� 1�������� 10���� ������ ������ �����ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
// ������ ������ : 10 5 2 9 1 4 1 5 1 5
// ����� 4.3
// 1���� 10������ ������ ������ �����ϰ� ������ ���� ���� �ڵ带 �̿��϶�.
// int i = (int)(Math.random()*10 + 1);

public class Ex07 {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		int sum = 0;
		double average = 0;
		
		System.out.print("������ ������ : ");
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10 + 1);
			System.out.print(num[i] + " ");
		}
		System.out.println( );
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		average = sum / (double)num.length;
		System.out.print("����� " + average);
		
		
		
	}
}
