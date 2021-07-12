package ex;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		String userSelect, comSelect;
		int n;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		do {
			System.out.print("가위 바위 보! : ");
			userSelect = scanner.next();
			
			if(userSelect.equals("그만"))break;
			
			n = (int)(Math.random()*3);
			comSelect = str[n];
			
			if(userSelect.equals("가위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 비겼습니다.");
					continue;
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 사용자가 졌습니다.");
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 사용자가 이겼습니다.");
					continue;
				}
			}
			else if(userSelect.equals("바위")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 사용자가 이겼습니다.");
					continue;
				}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 비겼습니다.");
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 사용자가 졌습니다.");
					continue;
				}
			}
			else if(userSelect.equals("보")) {
				if(str[n].equals("가위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 사용자가 졌습니다.");
					continue;
					}
				else if(str[n].equals("바위")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 사용자가 이겼습니다.");
					continue;
				}
				else if(str[n].equals("보")) {
					System.out.println("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " 비겼습니다.");
					continue;
				}
			}
			System.out.print("사용자 = " + userSelect + ", 컴퓨터 = " + comSelect + " ");
		}while(true);
		System.out.println("게임을 종료합니다...");
		scanner.close();
	   }
	}


