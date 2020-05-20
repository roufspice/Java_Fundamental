package codingTest;

public class GreatestDifferenceFinder {
	
	private int getLowest(int[] intArray) {
		//bubble sorting /ascending = true;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					// 스위칭하는 코드
					// 두개 중 하나를 저장시킨 후 
					int temp = intArray[j + 1];
					intArray[j + 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		return intArray[0];
	}
	
	private int getHighest(int[] intArray) {
		//내림차순 정리
		//bubble sorting /ascending = false;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] < intArray[j + 1]) {
					// 스위칭하는 코드
					// 두개 중 하나를 저장시킨 후 
					int temp = intArray[j + 1];
					intArray[j + 1] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		return intArray[0];
		
	}
	
	public int greatestDifference(int[] intArray) {
		//두 원소의 차 중 최댓값은?
		//최댓값 - 최솟값 
		//배열의 값들 중 최댓값과 최소값을 구해야 한다!!
		if(intArray.length < 2) {
			return 0;
		} else {
			return getHighest(intArray) - getLowest(intArray);
			//오름차순으로 한번 정리하고
			//내림차순으로 한번 정리하면 어떨까.
			
			
			
		}
		
	}

}
