package internetex;

import java.util.ArrayList;
import java.util.Scanner;

// ������ �� �� �������� Ű����κ��� ������ �Է¹޾�(100���� ���� ����) ���� �迭�� �����ϰ�, �̰��� 1���� 100���� ������ ������ �����ϰ� �����϶�. �迭���� ���� ���� ������ �ϰ� �迭�� ����϶�.
// ���� �? 24
// 48 33 74 94 17 39 55 8 59 81
// 72 31 63 90 75 2 85 19 84 24
// 98 32 86 58

public class Ex08 {

	public static void main(String[] args) {
		
	ArrayList<Integer> number = new ArrayList<Integer>();
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("���� �?");
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
