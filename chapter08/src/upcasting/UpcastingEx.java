package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("�����");

		p = s;  // Upcasting(��ĳ����) - s(�ڽ�) ��ü�� p(�θ�)�� ���������� �θ�Ŭ������ ������ ��� ������ ��ü(p)�� new���� ���� �����.
		        // s �� �θ�Ŭ������ �ڽ�Ŭ���� �� �� ���� ���������� p �� �θ�Ŭ������ ���� ����.
		
		// Person p = new Student("�����");  // ��ĳ������ ��ó�� �����ϰ� ���� ���� �ִ�. *��, p�� �����Ǳ� ������ s�� ���� �������� �ʴ� �̻� s�� �������� ���� �����̴�.
		
		System.out.println(p.name);
		
		// p.grade = "A";           // ������ ���� �߻�
		// p.department = "HR";     // ������ ���� �߻�
		// p.name = "ȫ�浿";
		// p.id = "ID";
		
		
		// s.grade = "A";
		// s.department = "HR";
		// s.id = "ID";
		// s.name = "��ʶ�";
		
	}

}
