package java_20200511;

public class identifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "hello";
		
		//첫글자는 숫자를 사용할 수 없습니다. 
		//String 1father = "John";
		
		// 공백(띄어쓰기)를 사용할 수 없음.
		//String mother Name = "Michell";
		
		// identifier에서 예약어를 사용할 수 없음.
		//String void = "empty"; 
		
		// 특수문자를 사용할 수 없음(단, $, _는 예외)
		//int @money = 1000;
		
		// java에서 문자는 유니코드를 지원하기 때문에 세계 모든 문자를 사용할 수 있음.
		String 이름 = "가나다";
		System.out.println(이름);		// '이름'이라는 '변수'를 출력해라 // 
		System.out.println(age);	// 'age'라는 변수를 출력해라 
		
		//byte age = 200; 			// byte, short, int 범위를 알고 있어야한다
		float weight = 70.3f;
		
		
		// 정수형은 int와 long을 주로 쓰고 실수형은 double을 많이 쓴다 .
		// boolean(불리언)은 True False를 사용한다. 
		
		// byte, short, int는 사용범위내의 정수를 써주면 되지만, long literal은 숫자뒤에 소문자ㅣ, 대문자 L를 사용해서 작성해야 한다.
		// byte, short, int 리터럴은  10진수, 8진수, 16진수 표기법이 가능하다
		// float 리터럴은 f, F를 사용해서 작성해야 함 
		// double 리터럴은 d, D를 사용해서 작성해야함 
		
		
		
		
		
	}

}
