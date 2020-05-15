package java_homework;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
			
			
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		// Shuffle
		
		
		//**Array copy
		String[] fruit = new String[] {"딸기", "당근", "수박", "참외", "메론"};
		String[] a = new String[5];
		
		
		
		System.arraycopy(fruit, 2, a, 0, 3);
		for (String string : a) {
			System.out.println(string);
			
		}//**Array copy는 같은 데이터타입의에서만 가능하다!! 
		// 그리고 빈값은 default 값이 나온다
		int[] intArray = new int[4];
		System.arraycopy(fruit, 0, intArray, 2, 2);
		for (int i : intArray) {
			System.out.print(i+ " ");
			
		}
		
		
		
		
		
		
		
		
	}

}
