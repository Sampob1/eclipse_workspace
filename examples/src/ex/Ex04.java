package ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		
		String name = "";
		int i = 0;
		
		while(true) {
			System.out.println("�����̸��� �Է� �ϼ��� : ");
			name = scanner.next();
			if(name.equals("�׸�")) {break;}
			for(i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}
				if(i == course.length -1) {  
					// 5-1�� 4�̰� 0~4������ 5������ �ε����ν� course�� ��� �迭�� �ε����ε�,
					// course[i]�� 4���� ������������ ��ġ�ϴ� name�� ã�� ���ߴٸ�, ���� �����̶�� ���̴�.
					// course.length �� ���ϸ� 5������ 0���� �����ϴ� �迭������ -1�� ����� "1~5"���� "0~4"�� ���� �� �ִ�.
					System.out.println("���� ���� �Դϴ�. ");
				}
			}
		}
		scanner.close();
	}
	
}
