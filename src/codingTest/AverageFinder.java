package codingTest;

//파라미터로 정수 배열 intArray를 받고 배열의 모든 값의 평균을 리턴해주는 메소드 computeAverage를 쓰세요. 리턴값의 자료형은 double입니다


public class AverageFinder {
	
	public double computeAverage(int[] intArray) {
		//모든 배열의 합을 구함
		int sum = 0;
		for (int i : intArray) {
			sum += i;
			
		}
		int result = sum;
		double average = (double)result/intArray.length;
		
		return average;
			
	}

}
