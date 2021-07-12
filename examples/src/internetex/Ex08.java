package internetex;

import java.util.ArrayList;
import java.util.Scanner;

// 정수를 몇 개 저장할지 키보드로부터 개수를 입력받아(100보다 작은 개수) 정수 배열을 생성하고, 이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라. 배열에는 같은 수가 없도록 하고 배열을 출력하라.
// 정수 몇개? 24
// 48 33 74 94 17 39 55 8 59 81
// 72 31 63 90 75 2 85 19 84 24
// 98 32 86 58

public class Ex08 {

	public static void main(String[] args) {
		
	ArrayList<Integer> number = new ArrayList<Integer>();
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("정수 몇개?");
	int inputNum = scanner.nextInt();
	
	for(int i = 0; i < inputNum; i++) {
		int randomNum = (int)(Math.random()*100 + 1);
		for(int j = 0; j < number.size(); j++) {
			i--;
		
		}
	}
	System.out.println(number);
	}
	
}
