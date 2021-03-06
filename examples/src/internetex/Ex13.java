package internetex;
// 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 실행 사례는 다음과 같다.
// 3 박수 짝
// 6 박수 짝
// 9 박수 짝

public class Ex13 {
	
	public static void main(String[] args) {
		for (int i = 3; i < 100; i++) {
            int unit = i % 10;
            int ten = i / 10;
            if (i < 10) {
                if (i % 3 == 0)
                    System.out.println(i + " 박수 짝");
            } else {
                if ((ten % 3 == 0) && (i % 10 == 0))            // 30, 60, 90
                    System.out.println(i + " 박수 짝");
                else if ((unit % 3 == 0) && (ten % 3 == 0))     // 일의자리, 십의자리 둘다 3의 배수
                    System.out.println(i + " 박수 짝짝");
                else if ((unit % 3 == 0) || (ten % 3 == 0))     // 3의 배수가 한 개
                    if (i % 10 != 0)        // 10의 자리 거르기
                        System.out.println(i + " 박수 짝");
            }
		}
	}
}
