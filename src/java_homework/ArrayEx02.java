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
	}

}
