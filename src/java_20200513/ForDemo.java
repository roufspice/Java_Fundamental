package java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		// 1부터 10까지의 짝수의 합을 구하시오.
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			} else {
				continue;
			}

		}
		System.out.printf("1부터 10까지의 짝수 합은 %d 입니다. %n", sum);

		// 1부터 100까지의 정수 중 7의 배수의 합을 구하시오.
		for (int i = 0; i < 101; i++) {
			if (i % 7 == 0) {
				sum += i;
			} else {
				continue;

			}

		}
		System.out.printf("1부터 100까지의 7의 배수의 합은 %d 입니다. %n", sum);

		// 구구단 만들기 printf(%d를 활용해서 만들기)
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d%n", i, j, i * j);
//
//		}
//
//		}
		// 구구단 거꾸로 만들기!!
		for (int i = 9; i > 1; i--) {
			System.out.printf("===%d단===%n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);

			}
			System.out.println();

		}
		System.out.println("구구단 끝!");

		/* 
		 *
		 **
		 ***
		 ****
		 *****
		 */

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			int m = i;
			int n = 5-i; //하나의 인덱스에 5개가 들어가니까, 5-i를지정해준다는 점!! m+n = 5
			
			for (int j = 0; j < m; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}

}
