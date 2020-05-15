package java_20200514;

public class ArrayDemo {
	// int[] a = new int[size];
	// int[] b = {1, 2, 3, 4, 5};
	// 배열의 길이: a.length
	// 배열의 index: a[0], a[1]....

	// 배열선언: for(int i=0;i<a.length;i++){
	// System.out.print(a[i]);

	public static void main(String[] args) {
		// 1. 배열선언!
		int[] intArray = new int[4];

		for (int i : intArray) {
			System.out.print(i + " ");

		}

		// 2. 배열할당!

		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;

		System.out.println();

		for (int i : intArray) {

			System.out.print(i + " ");

		}

		// 3. 배열 출력!
		// for문, for-each문으로 ~!

		System.out.println();

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

		System.out.println();
		// 배열선언, 생성, 할당을 동시에 이루어짐!
		int[] b = { 100, 200, 300, 400, 500 };
		for (int i = 0; i < b.length; i++) {
			b[i] = 101 + i;

		}
		// 배열출력 => for loop
		// 모든배열의 인덱스를 다 출력안할 수 있다.
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");

		}
		System.out.println();

		// 배열 출력 => enhanced for loop
		// 처음부터 끝까지 다 출력하고 싶을 때 사용!
		for (int temp : b) {
			System.out.print(temp + " ");
		}

		int[] c = b;
		//reference data type에서 할당은 b와 c변수가 같은 data을 바라보게 할 수 있다.
		c[0] = 11;

		System.out.println();
		for (int temp : b) {
			System.out.print(temp + " ");
		}
		System.out.println();
		for (int temp : c) {
			System.out.print(temp + " ");
		}

	}

}
