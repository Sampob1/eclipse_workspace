package internetex;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		while(i < 100) {
			sum = sum +i;
			i +=2;
		}
		System.out.println(sum);
	}

}

// 1) 무엇을 계산하는 코드이며 실행 결과 출력되는 내용은?
// - i 라는 변수가 while 변수를 통해 100이 되기 전까지 2씩 더해가며 그 값을 sum에 더한다 => 0부터 100까지 2의 배수를 더한 값을 구하는 식.

// 2) 위의 코드를 main() 메소드로 만들고 whileTest 클래스로 완성하라.
// 

// 3) for 문을 이용하여 동일하게 실행되는 ForTest 클래스를 작성하라.
// - Ex01_1

// 4) do-while 문을 이용하여 동일하게 실행되는 DoWhileTest 클래스를 작성하라.
// - Ex02_2