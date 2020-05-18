package java_homework;

public class Lottery01 {
	public static void main(String[] args) {
		// 배열에서 많이 쓰는 오름차순과 내림차순에 관한 알고리즘
		int[] luckyLotto = new int[6];
		for (int i = 0; i < luckyLotto.length; i++) {

			int random = (int) (Math.random() * 45) + 1;

			boolean isExisted = false;

			for (int j = 0; j < i; j++) {

				if (random == luckyLotto[j]) {

					isExisted = true;
					break;
				}
			}

			if (!isExisted) {
				luckyLotto[i] = random;
			} else {
				i--;
			}

		}
		// Bubble sorting 알고리즘(내림차순)
		for (int i = 0; i < luckyLotto.length; i++) {
			for (int j = 0; j < luckyLotto.length - (i + 1); j++) {
				if (luckyLotto[j] < luckyLotto[j + 1]) {
					int temp = luckyLotto[j + 1];
					luckyLotto[j + 1] = luckyLotto[j];
					luckyLotto[j] = temp;
				}
			}
		}

		for (int i : luckyLotto) {
			System.out.print(i + " ");

		}
		System.out.println();
		System.out.println("최대값은: " + luckyLotto[0]);
//		System.out.println(luckyLotto.length);
		System.out.println("최솟값은: " + luckyLotto[5]);
		System.out.println("중간값은: " + ((luckyLotto[3] + luckyLotto[4]) /2));

	}

}
