package internetex;
// 4 x 4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ 10���� �����ϰ� �����Ͽ� ������ ��ġ�� �����϶�. ������ ������ �־ �������.
// ������ 6���� ���ڴ� ��� 0�̴�. ������� 2���� �迭�� ȭ�鿡 ����϶�.
// 5  0  8  6
// 0  7  9  5
// 2  4  0  8
// 0  0  0  8

public class Ex10 {

  public static void main(String[] args) {
	      
	      int arr[][] = new int[4][4];
	      int x, y, result=0;                          // result�� ���� ���� ����

	      while(result < 10) {
	         x = (int)(Math.random()*4);               // x�� 0~3������ ���� �� �ֱ�
	         y = (int)(Math.random()*4);               // y�� 0~3������ ���� �� �ֱ�
	         if(arr[y][x] == 0) {                        // arr[x][y]�� ���� ������ ���� �� �ֱ�
	            arr[y][x] = (int)(Math.random()*10+1);
	            result++;
	         }
	      }
	      
	      for(int i=0; i<arr.length; i++) {
	         for(int j=0; j<arr[i].length; j++) {
	            System.out.print(arr[i][j]+" ");
	         }
	         System.out.println();
	      }
	   }

	}