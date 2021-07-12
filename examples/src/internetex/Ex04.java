package internetex;

import java.util.Scanner;

// Scanner를 이용하여 소문자 알파벳을 하나 입력받고 다음과 같이 출력하는 프로그램을 작성하라. 다음은 e를 입력받았을 경우이다.
// 소문자 알파벳 하나를 입력하시오>>e
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
		
		System.out.print("소문자 알파벳 하나를 입력하시오.>>");
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
