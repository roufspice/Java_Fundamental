package java_20200511;

public class LitteralDemo {
	public static void main(String[] args) {
		//byte 범위(-128~ 127)를 넘어가면 overflow 발생 => compile error.
		//byte b1 = 128;
		int a1 = 128;		//10진수 표기법
		int a2 = 076;		//8진수 표기법
		int a3 = 0x123;		//16진수 표기법
		int a4 = 0b1010;	//2진수 표기법
							//int의 value range인 -21억 ~ 21억 이 넘어가면 'long'을 선택해야 한다.
		// *byte // short // int // long 
		
		// *변수에 적용되는 적절한 자료형을 선택할 수 있어야 한다. 그러려면 그 자료형들의 범위를 알고 있어야 한다. //
		// long 리터럴은 숫자뒤에 l 또는 L로 표기합니다.
		long l1 = 12l;
		
		// float 리터럴은 숫자뒤에 f 또는 F로 표기합니다.
		float f1 = 123.4f;
		
		// double 리터럴은 숫자뒤에 d 또는 D로 표기합니다. 또는 생략
		double d1 = 123.487;
		
		// boolean 리터럴은 true 또는  false;
		boolean isExisted = false;
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2;			// + -  연산을 도입하면 자동으로 자료형이 int로 변경이 되면서 산술연산에서 오류가 발생!
		byte b4 = (byte)(b1 + b2);
		// 정수를 선언할 때는 int, 범위가 21억을 넘어가면 long 선언
		// 실수를 선언할 때는 double로 선언! 
		
		
		// 3가지 리터럴 // 
		char test = 'a';			//문자 표현법 예시 // 유니코드로 표현하는 방법 / 아스키코드로 표현하는 방법/
		char characterA = 65;		//**아스키코드로 65번이 A, **97번이 a이다. 
		char charactera = 97;		// 문자로 선언했으나 숫자로 리터럴을 입력한다. 
		
		
		

		
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(characterA);
		System.out.println(charactera);
	}

}
