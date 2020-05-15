package java_20200513;

public class Test01 {
	public static void main(String[] args) {
		// 1부터 10까지의 소수의 합을 구하시오.
		// 1부터 10까지의 소수를 어떻게 구할까?
		// 1부터 5까지의 소수먼저 구해보자!
		int sum = 0;
		int a = 100;

		for (int i = 2; i <= a; i++) {
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.printf("1부터 %d까지의 소수의 총합은: %d%n", a, sum);

	}

}
