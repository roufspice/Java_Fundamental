package java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또복권
		// 1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		// 2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.
		// 3. 오름차순 정리를 한다.
		// Math.random(); => 0보다 크거나 같고 1보다 작은 양수를 double 값으로 반환한다.

		// 1부터 45까지의 임의의 랜덤 값!
		// int random = (int)(Math.random() * 45) + 1;

		int[] luckyLotto = new int[6]; // 기존에는 0 0 0 0 0 0 으로 되어있음!
		for (int i = 0; i < luckyLotto.length; i++) {

			// 랜덤뽑기: 아닐경우 재 추첨!
			int random = (int) (Math.random() * 45) + 1;

			// 중복되는 값이 있는지 체크하는 변수;
			// *중복되는게 없다고 우선 선정한다!
			boolean isExisted = false;

			for (int j = 0; j < i; j++) {

				if (random == luckyLotto[j]) {
					// 중복된게 있네! true 선언!
					isExisted = true;
					break;
				}
			}
			// !isExisted = !false = true
			if (!isExisted) {
				luckyLotto[i] = random;
			} else {
				// lottoArray[i]가 다시 그자리에 머문다는 조건을 만들어야 한다
				i--;
			}
		}
		
		
		// Bubble sorting 알고리즘
		for (int i = 0; i < luckyLotto.length; i++) {
			for (int j = 0; j < luckyLotto.length - i - 1; j++) {
				if (luckyLotto[j] > luckyLotto[j + 1]) {
					// 스위칭하는 코드
					// 두개 중 하나를 저장시킨 후 
					int temp = luckyLotto[j + 1];
					luckyLotto[j + 1] = luckyLotto[j];
					luckyLotto[j] = temp;
					
				}
				
			}
			
		}
		// 내림차순으로 정리하기 (비교하는 숫자간의 부등호만 바꿔주면 된다)
		// Bubble Sorting 알고리즘 
//		for (int i = 0; i < luckyLotto.length; i++) {
//			for (int j = 0; j < luckyLotto.length - i -1; j++) {
//				if (luckyLotto[j] < luckyLotto[j+1]) {
//					int temp = luckyLotto[j+1];
//					luckyLotto[j+1] = luckyLotto[j];
//					luckyLotto[j] = temp;
//					
//				}
//				
//			}
//			
//		}
//		
		
		
		for (int value : luckyLotto) {
			System.out.print(value + "\t");

		}
		// 이제 오름차순한데..;;
		// 오름차순인 알고리즘 버블소트를 자바에서 구현한다!!


	}

}
