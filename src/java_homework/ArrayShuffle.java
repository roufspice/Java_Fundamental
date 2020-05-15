package java_homework;

public class ArrayShuffle {
	public static void main(String[] args) {
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0~9중의 한 값을 임의로 얻는다.
			int tmp = array[0];
			array[0] = array[n];
			array[n] = tmp;

		}
		for (int i : array) {
			System.out.print(i + " ");

		}

		for (int i = 0; i < array.length; i++) {
			int n = (int) (Math.random() * 10);  // 0부터 ~ 9까지의 무작위 수 n 
			int tmp = array[i];
			array[i] = array[n];
			array[n] = tmp;
		}
		System.out.println();
		
		for (int i : array) {
			System.out.print(i + " ");
		}

	}
}
