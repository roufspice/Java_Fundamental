package java_20200518;

public class MethodDemo {
	// 발표를하면서 정리하는게 중요하다//
	// 메소드를 정리
	// boolean 메소드의 반환값
	// instance 메소드
	// ()매개변수,파라미터,인수값,인자

	public boolean isLeafYear(int year) {
		// 메서드 반환값이 boolean이기 때문에 return value의 value도 boolean이어야 한다.
		boolean isLeaf = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		return isLeaf;
	}

	public long plus(int first, int second) {
		return (long) first + (long) second;
		// integer의 범위를 넘어갈 경우를 고려!

	}

	public double divide(int first, int second) {
		return (double) first / (double) second;
		// 소수점 이하값도 고려!
	}

	public void println(String message) {
		System.out.println(message);
	}

	/// 오름차순 메소드 만들어보기!
	public int[] ascending(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// 스위칭하는 코드
					// 두개 중 하나를 저장시킨 후
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;

	}

	
	
	
	public static void main(String[] args) {
		// 객체를 선언, instance멤버변수를 선언해주어야한다.
		MethodDemo m = new MethodDemo();

		boolean test = m.isLeafYear(2000); // argument(메서드를 호출할때 대입하는 값)
		if (test) {
			m.println("윤년입니다.");
		} else {
			m.println("윤년이 아닙니다.");
		}

		long result = m.plus(100000, 123123456);
		System.out.println(result);

		double result2 = m.divide(12, 5);
		// m.println(result2);
		System.out.println(result2);
		
		
		//ascending 메소드를 활용해서 오름차순된 배열 출력하기
		int [] temp = new int[]{1, 34, 9, 2, 40 ,5 ,45};
		
		System.out.println("<정렬전>");
		
		for (int value : temp) {
			System.out.print(value + "\t");
		}
		
		System.out.println();
		
		System.out.println("<정렬후>");
		
		// 정렬한 array result3
		//int[] result3 = m.ascending(temp);
		
		m.ascending(temp);
		
		for (int value : temp) {
			System.out.print(value + "\t");
			
			
		}

	}

}
