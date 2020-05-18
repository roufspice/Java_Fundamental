package java_homework;

public class ArrayEx01 {
	public static void main(String[] args) {

		// 1부터 100까지의 숫자중에 무작위로 5개의 숫자를 뽑는다.
		// 중복 불가!!
		// 뽑은 5개의 숫자중에 최대값과 최소값을 구한다!
		// 뽑은 5개의 숫자의 합을 구한다!

		int[] array = new int[5];
		int sum =0;
		

		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * 100) + 1;

			boolean isExisted = false;

			for (int j = 0; j < i; j++) {
				if (array[j] == random) {
					isExisted = true;
					break;
				}

			}
			if (!isExisted) {
				array[i] = random;
			} else {
				i--;
			}

		}
		// 최대값과 최소값구하기!!
		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}
		
		
		// 뽑은 숫자들의 총합
		for (int i = 0; i < array.length; i++) {
			sum+= array[i];
		}
		
		System.out.printf("최대값은: %d, 최솟값은: %d, 총합은: %d%n", max, min, sum);

		for (int i : array) {
			System.out.println(i);
		}

	}

}
