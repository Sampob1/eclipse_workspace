package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("�����");  // ��ĳ���� ����
										 // ��ĳ���� ���� ��, p =(Person)s; �� �ڷ���(Person) �� �ڵ����� �־��ֱ� ������ ���� �����ϴ�.
		
		Student s;
		s = (Student)p;                  // �ٿ�ĳ���� ����
		                                 // *�ٿ�ĳ�����ϴ� s(�ڽ�Ŭ����)�� �ڷ����� �ݵ�� ����ؾ���*
		
		System.out.println(p.name);
		s.grade = "A";
		



	}

}
