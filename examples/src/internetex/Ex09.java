package internetex;
//4 x 4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ �����ϰ� �����Ͽ� ���� 16���� �迭�� �����ϰ�, 2���� �迭�� ȭ�鿡 ����϶�.
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
