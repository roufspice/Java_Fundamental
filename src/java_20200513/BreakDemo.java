package java_20200513;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i > 5) {
				break;

			}
			sum += i;

		}
		System.out.printf("1부터 5까지 합은 %d 입니다. %n", sum);

		// 5*5 =25 이후에는 출력하지말기.
		// break __ 

		outter: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d&n", i, j, i * j);
				if (i == 5 && j == 5) {
					break outter;
					
				}
			}

		}

	}

	// Break는 while문에서 많이 사용한다.
	// 무한반복루프에서 조건에 따라서 빠져나가는 조건으로 많이 사용한다.
	//

}
