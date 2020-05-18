package java_20200513;

public class WhileDemo {
	public static void main(String[] args) {
		// 1부터 10까지 합을 while문으로 만들어라
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;

		}
		System.out.println(sum);

		// 구구단을 while 문으로 작성해보자!!!
		i = 2;

		
		while (i <= 9) {
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
				j++;

			}
			i++;

		}

	}

}
