package internetex;

import java.util.Scanner;

// �迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���. Ű���忡�� ������ �� ���� �׼��� �Է¹޾�,
// ���� ����, �� ����, õ ����, 500��¥�� ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ������ �� �� ���� ��ȯ�Ǵ��� ���ÿ� ���� ����϶�.
// �� �� �ݵ�� ���� �迭�� �̿��ϰ� �ݺ������� �ۼ��϶�.
// int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
// �ݾ��� �Է��Ͻÿ�.>>65123
// 50000�� ¥�� : 1��
// 10000�� ¥�� : 1��
// 1000�� ¥�� : 5��
// 100�� ¥�� : 1��
// 10�� ¥�� : 2��
// 1�� ¥�� : 3��

public class Ex06 {
	
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�.>>");
		int inputMoney = scanner.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			if(inputMoney / unit[i] == 0) {
				continue;
			}
			System.out.printf("%d �� ¥�� : %d��\n", unit[i], inputMoney / unit[i]);
			inputMoney -= unit[i] * (inputMoney / unit[i]);
		}
		scanner.close();
	}

}
