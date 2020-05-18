package java_20200515;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		
		//배열 copy;
		String [] fruits = {"apple", "banana", "watermelon", "blueberry" };
		
		String [] temp = new String[6];
		// fruits => 원본배열
		// 0 => 원본배열의 위치 
		// temp => 복사할 배열
		// 2 => 복사할배열의 위치
		// 4 => 원본배열의 4개 요소를 복사
		
		//메소드를 사용해서 배열을 카피할 수 있다.
		System.arraycopy(fruits, 0, temp, 2, 2);
		
		temp[0] = "peach";
		temp[1] = "pear";
		
		
		for (String string : temp) {
			System.out.print(string + " ");
		}
		System.out.println();
		
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
			
		}
		
	}

}
