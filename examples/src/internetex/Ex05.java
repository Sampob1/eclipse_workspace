package internetex;

import java.util.Scanner;

// ���� ������ 10�� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����ϴ� ���α׷��� �ۼ��϶�.
// ���� ���� 10���� �Է��Ͻÿ�.>> 1 5 99 22 345 154 2346 55 32 85
// 3�� ����� 99 345 2346

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�.>>");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		scanner.close();
		
	}

}
