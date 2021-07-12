package internetex;
// 가위바위보 게임 만들기
// 예시)
// 컴퓨터와 가위 바위 보 게임을 합니다.
// 가위 바위 보! >> 바위
// 사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.
// 가위 바위 보! >> 가위
// 사용자 = 가위. 컴퓨터 = 가위, 비겼습니다.
// 가위 바위 보! >> 그만
// 게임을 종료합니다...

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String str[] = {"가위", "바위", "보"};
		
		
		do {
			System.out.print("가위 바위 보! >> ");
			
			String input = scanner.next();
			if(input.equals("그만"))break;
			int n = (int)(Math.random()*3);
			String com = str[n];
			if(str[n].equals(input)) {
				System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + str[n] + ", 비겼습니다.");
				continue;
			}
			if(input.equals("가위")) {
				if(str[n].equals("바위")) {
					System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + com + ", 사용자가 졌습니다.....");
					continue;
				}
				if(str[n].equals("보")) {
					System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + com + ", 이기셨습니다! 축하합니다!.");
					continue;
				}
			}
			if(input.equals("바위")) {
				if(str[n].equals("보")) {
					System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + com + ", 사용자가 졌습니다.....");
					continue;
				}
				if(str[n].equals("가위")) {
					System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + com + ", 이기셨습니다! 축하합니다!.");
					continue;
				}
			}
			if(input.equals("보")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + com + ", 사용자가 졌습니다.....");
					continue;
				}
				if(str[n].equals("바위")) {
					System.out.println("사용자 = " + input + ", " + "컴퓨터 = " + com + ", 이기셨습니다! 축하합니다!.");
					continue;
				}
			}			
		}while(true);{
			System.out.println("게임을 종료합니다...");
		}
		scanner.close();
	}
	
}

