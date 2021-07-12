package internetex; 
// 3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성하라.

public class Ex01_1 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 100;  ) {
			sum += i;
			i = i + 2;
		}
		System.out.println(sum);
	}

}
