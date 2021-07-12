package internetex;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		int i = 0;
		String inputName;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("과목 이름을 입력해주세요.>>");
			 inputName = scanner.next();
			
			if(inputName.equals("그만"))
				break;
			for(i = 0; i < course.length; i++)
				if(course[i].equals(inputName)) {
				System.out.println(course[i] + "과목의 점수는 " + score[i] + "점 입니다.");
					break;
					}
						if(i == course.length) {
							System.out.println("없는 과목입니다. 다시 입력해주세요.");
						}
					}while(inputName != "그만"); {
						System.out.println("장비를 정지합니다.");
					}
		scanner.close();
				}
			}


	

