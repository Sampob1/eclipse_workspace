package internetex;
// 정수를 10개 저장하는 배열을 만들고 1에서에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
// 랜덤한 정수들 : 10 5 2 9 1 4 1 5 1 5
// 평균은 4.3
// 1에서 10까지의 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
// int i = (int)(Math.random()*10 + 1);

public class Ex07 {

	public static void main(String[] args) {
		
		int num[] = new int[10];
		int sum = 0;
		double average = 0;
		
		System.out.print("랜덤한 정수들 : ");
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10 + 1);
			System.out.print(num[i] + " ");
		}
		System.out.println( );
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		average = sum / (double)num.length;
		System.out.print("평균은 " + average);
		
		
		
	}
}
