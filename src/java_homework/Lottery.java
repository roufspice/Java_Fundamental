package java_homework;

public class Lottery {
	public static void main(String[] args) {
		// 로또복권은 로또복권 추첨기가 중요한게 아니라, 중복값을 해당 배열에 지정하지 않는 알고리즘을 이해!

		int[] lottoArray = new int[6];

		for (int k = 0; k < 1000; k++) {
			System.out.println();
			System.out.printf("==로또추첨  %d번째==%n", k + 1);

			for (int i = 0; i < lottoArray.length; i++) {
				int randomNumber = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					while (randomNumber == lottoArray[j]) {
						// 같은 숫자가 나온다면 다시 정수 랜덤출력하고
						// 다른 숫자가 나올때까지 무한히 반복하기
						randomNumber = (int) (Math.random() * 45) + 1;

					}

				}
				lottoArray[i] = randomNumber;

			}
//		System.out.println("프로그램 끝!");

			for (int i : lottoArray) {
				System.out.print(i + " ");

			}
			System.out.println();

		}
		//질문? 각 숫자가 나온 횟수를 카운트해서 로또추첨기를 1,000번 돌렸을 때, 가장 많이 나온 숫자 6개를 선별하려면 어떻게 해야 할까?

	}

}
