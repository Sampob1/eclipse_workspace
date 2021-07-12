package ex;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		int total = 0;
		double avg;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()*10+1); // 1~10 까지의 랜덤한 값을 반환
		}
		System.out.print("랜덤한 정수들 : ");
		
		for(int i = 0; i < 10; i++) {
			System.out.print(intArray[i] + " ");
			total += intArray[i];
		}
		System.out.println( );
		
		avg = (double)total / intArray.length;
		System.out.println("평균은 : " + avg);
	}

}
