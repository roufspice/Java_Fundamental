package java_homework;

public class PrimeNumber {
	//1부터 100까지의 소수만들기!
	//1과 자기자신 빼고는 다 나누어 떨어지지 않음!
	public static void main(String[] args) {
		
		//PrimeNumber p1 new PrimeNumber();
		//p1.print(100);
		//1부터 100까지의 소수들의 합이 딱 나오는 그런 프로그램을 만들고 싶다!!
		
		
		int a = 100;
		int sum = 0;						//소수의 총합을 카운트하는 변수를 정함
		
		for (int i = 2; i <= a; i++) {		//1은소수에서 제외함
			int count = 0;					//반복문이 끝날 때 마다 count를 새로 리셋시킴
			for (int j = 2; j < i; j++) {
											
				if(i % j == 0) {
					count ++;				//나누어떨어지는 정수 j를 카운팅
				}
				
			}
			if(count == 0) {				
											// i를 출력하고 , 소수인 j의 합을 더함
				System.out.println(i);
				sum+=i;
			}
			
			
			
		}
		System.out.println("계산끝!");
		System.out.println();
		System.out.printf("1부터 %d까지의 소수들의 총합은: %d%n", a, sum);
		
		
	}
	

}
