package internetex;

import java.util.Scanner;

// Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է¹ް� ������ ���� ����ϴ� ���α׷��� �ۼ��϶�. ������ e�� �Է¹޾��� ����̴�.
// �ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>e
// abcde
// abcd
// abc
// ab
// a

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s;
		char alphabet;
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�.>>");
		s = scanner.next();
		alphabet = s.charAt(0);
		
		for(int i = 0; i < alphabet - 'a'; i++) {
			for(char j = 'a'; j <= alphabet - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
		
	}
}
