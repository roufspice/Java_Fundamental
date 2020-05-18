package java_homework;

import java_20200513.ForDemo;

public class Practice {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7-(i+1); j++) {
				System.out.print(" ");
				
				
			}
			for (int j = 0; j < i+1 ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			
		}
		
		
		
	}

	
	

}
