package internetex;
// ���������� ���� �����
// ����)
// ��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.
// ���� ���� ��! >> ����
// ����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.
// ���� ���� ��! >> ����
// ����� = ����. ��ǻ�� = ����, �����ϴ�.
// ���� ���� ��! >> �׸�
// ������ �����մϴ�...

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String str[] = {"����", "����", "��"};
		
		
		do {
			System.out.print("���� ���� ��! >> ");
			
			String input = scanner.next();
			if(input.equals("�׸�"))break;
			int n = (int)(Math.random()*3);
			String com = str[n];
			if(str[n].equals(input)) {
				System.out.println("����� = " + input + ", " + "��ǻ�� = " + str[n] + ", �����ϴ�.");
				continue;
			}
			if(input.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = " + input + ", " + "��ǻ�� = " + com + ", ����ڰ� �����ϴ�.....");
					continue;
				}
				if(str[n].equals("��")) {
					System.out.println("����� = " + input + ", " + "��ǻ�� = " + com + ", �̱�̽��ϴ�! �����մϴ�!.");
					continue;
				}
			}
			if(input.equals("����")) {
				if(str[n].equals("��")) {
					System.out.println("����� = " + input + ", " + "��ǻ�� = " + com + ", ����ڰ� �����ϴ�.....");
					continue;
				}
				if(str[n].equals("����")) {
					System.out.println("����� = " + input + ", " + "��ǻ�� = " + com + ", �̱�̽��ϴ�! �����մϴ�!.");
					continue;
				}
			}
			if(input.equals("��")) {
				if(str[n].equals("����")) {
					System.out.println("����� = " + input + ", " + "��ǻ�� = " + com + ", ����ڰ� �����ϴ�.....");
					continue;
				}
				if(str[n].equals("����")) {
					System.out.println("����� = " + input + ", " + "��ǻ�� = " + com + ", �̱�̽��ϴ�! �����մϴ�!.");
					continue;
				}
			}			
		}while(true);{
			System.out.println("������ �����մϴ�...");
		}
		scanner.close();
	}
	
}

