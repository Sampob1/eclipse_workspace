package internetex2;
import java.util.Scanner;

	class Grade{

		private int math;
		private int science;
		private int english;
		public Grade(int math, int science, int english) {
			this.math = math;
			this.science = science;
			this.english = english;
		}
		
		public int average() {
			return (math + science + english) / 3;
		}
	}


// Grade Ŭ������ �ۼ��غ���. 3������ ������ �Է¹޾� Grade ��ü�� �����ϰ� ���� ����� ����ϴ� main()�� ���� ���ô� ������ ����.
public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());  // average()�� ����� ����Ͽ� ����
		
		scanner.close();
	}

}
// ��¿���)
// ����, ����, ���� ������ 3���� ���� �Է�>> 90 88 96
// ����� 91