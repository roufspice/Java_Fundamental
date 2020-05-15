package java_20200513;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// continue 문을 이용하여 6을 제외하라
			if (i == 6) {
				continue;
			}
			sum += i;

		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.(단 6은 제외한다) %n", sum);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// i*5= 부분만 skip하고 결과를 리턴한다.
				if (j == 5) {
					continue;
				}
				System.out.printf("%d * %d = %d%n", i, j, i * j);

			}

		}

		outter: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// i*5= 부분만 skip하고 결과를 리턴한다.
				if (j == 5) {
					continue outter;
				}
				System.out.printf("%d * %d = %d%n", i, j, i * j);

			}

		}

	}

}
