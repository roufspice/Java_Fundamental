package java_class;

public class PrimeNumber {
	//두수를 입력하면 그 사이에 있는 소수들의 합을 구해서 출력한다.
	//두수는 각각 <=10,000이다.
	private int firstNumber;
	private int lastNumber;
	
	//setter getter
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	
	public void setLastNumber(int lastNumber) {
		this.lastNumber = lastNumber;
	}
	public int getLastNumber() {
		return lastNumber;
	}
	
	//입력값 두수 사이의 소수들을 구하는 메서드;
	private int primeNumber() {					
		int sum =0;
		if (firstNumber !=1) {
		for (int i = firstNumber; i <= lastNumber; i++) {		//**1은소수에서 제외함
			int count = 0;					//반복문이 끝날 때 마다 count를 새로 리셋시킴
			for (int j = 2; j < i; j++) {							
				if(i % j == 0) {
					count ++;				//나누어떨어지는 정수 j를 카운팅
				}
			}
			if(count == 0) {	
				sum += i;
											
			}
		}
		return sum;
		} else {
			for (int i = 2; i<=lastNumber; i++) {
				int count = 0;
				for (int j =2; j<i; j++) {
					if(i % j ==0) {
						count ++;
					}
				}
			}
			return sum;
		}
		
		
	}
	
	public void printPrimeNumber() {
		System.out.printf("%d부터 %d사이의 소수들의 총합은: %d%n",firstNumber,lastNumber,primeNumber());
	}
	
	
	
	
	

}
