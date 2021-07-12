package internetex;
// 4) do-while 문을 이용하여 동일하게 실행되는 DoWhileTest 클래스를 작성하라.

public class Ex01_2 {
	
	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		
		do {
			sum = sum + i;
			i +=2;
			
		}while(i < 100);
		System.out.println(sum);
	}

}
