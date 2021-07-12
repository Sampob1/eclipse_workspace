package internetex;
//4 x 4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성하여 정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력하라.
// 6  10  1  8
// 1   3  7  2 
// 5   4  5  1
// 1   8  4  4

public class Ex09 {

	public static void main(String[] args) {
		
		int square[][] = new int[4][4];
		
		for(int i = 0; i < square.length; i++) {
			for(int j = 0; j < square[i].length; j++) {
				square[i][j] = (int)(Math.random()*10 +1);
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
