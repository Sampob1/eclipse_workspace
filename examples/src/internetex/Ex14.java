package internetex;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int i = 0;
		String inputName;
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("���� �̸��� �Է����ּ���.>>");
			 inputName = scanner.next();
			
			if(inputName.equals("�׸�"))
				break;
			for(i = 0; i < course.length; i++)
				if(course[i].equals(inputName)) {
				System.out.println(course[i] + "������ ������ " + score[i] + "�� �Դϴ�.");
					break;
					}
						if(i == course.length) {
							System.out.println("���� �����Դϴ�. �ٽ� �Է����ּ���.");
						}
					}while(inputName != "�׸�"); {
						System.out.println("��� �����մϴ�.");
					}
		scanner.close();
				}
			}


	

