package internetex;
// Scanner�� �̿��Ͽ� ������ �Է¹ް� ������ ���� *�� ����ϴ� ���α׷��� �ۼ��϶�. ������ 5�� �Է¹޾��� ����̴�.
// ������ �Է��Ͻÿ�>>5
// *****
// ****
// **
// *

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("������ �Է��Ͻÿ�>>");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	    
	    scanner.close();
	}		
}

