package ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		String name = "";
		int i = 0;
		
		while(true) {
			System.out.println("과목이름을 입력 하세요 : ");
			name = scanner.next();
			if(name.equals("그만")) {break;}
			for(i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				}
				if(i == course.length -1) {  
					// 5-1은 4이고 0~4까지는 5가지의 인덱스로써 course의 모든 배열된 인덱스인데,
					// course[i]가 4까지 진행했음에도 일치하는 name을 찾지 못했다면, 없는 과목이라는 뜻이다.
					// course.length 를 구하면 5이지만 0부터 시작하는 배열구조상 -1을 해줘야 "1~5"에서 "0~4"로 맞출 수 있다.
					System.out.println("없는 과목 입니다. ");
				}
			}
		}
		scanner.close();
	}
	
}
