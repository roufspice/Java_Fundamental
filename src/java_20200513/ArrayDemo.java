package java_20200513;

public class ArrayDemo {
	// 다중배열
	public static void main(String[] args) {

		// 다중배열
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i : intArray) {
//			System.out.println(i);
		}

		// 2차원 구조는 배열로 어떻게 나타낼 수 있을까요?
		// 다중배열 선언!!
		int[][] multiArray = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 0, 11, 12 } 
				};
		
		
		
		int[][] multiArray1 = new int[3][4]; // 앞에나오는 3은 index, 뒤에 나오는 4는 column을 대변한다고 보면 됨
		// 첫번째 대괄호에는 index, 두번째 대괄호에는 column을 넣어준다.
		
		for (int i = 0; i < multiArray1[0].length; i++) {
			multiArray1[0][i] = 1 + i;
			
		}
		for (int i = 0; i < multiArray1[1].length; i++) {
			multiArray1[1][i] = 5 + i;
			
		}
		for (int i = 0; i < multiArray1[2].length; i++) {
			multiArray1[2][i] = 9 + i;
			
		}
		
			
		//중첩반복문을 활용하여 index와 column을 이용해보자!
		
		int[][] multiArray2 = new int [3][4];
		for (int i = 0; i < multiArray2.length; i++) {
			// 첫번째 for문에서 index의 수:3이므로, 세로로 3줄이 나온다는 의미.
			for (int j = 0; j < multiArray2[i].length; j++) {
				multiArray2[i][j] = (i * 4 + 1) + j;
				
				
			}
			
		}
		
		//배열 출력하기, 배열은 안에 있는 내용을 바로 출력할 수 없고,
		//배열안의 원소에 직접 접근하여 출력해야 합니다. 
		
		for (int i = 0; i < multiArray2.length; i++) {
			for (int j = 0; j < multiArray2[i].length; j++) {
//				System.out.print(multiArray2[i][j] + " ");
				
			}
//			System.out.println();
			
		}
		
		for (int i = 0; i < multiArray1.length; i++) {
			for (int j = 0; j < multiArray1[i].length; j++) {
				System.out.print(multiArray1[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		
		
		
			
		}

	}


