package java_20200512;

// ctrl + Shift + F => 자동으로 들여쓰기 줄 맞추는 단축키!!
public class Operator {
	public static void main(String[] args) {
		long t = 100_100_100_100l;
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = b / a;
		System.out.println(d);

		c = a * b;
		System.out.println(c);

		d = (double) b / a;
		System.out.println(d);

		// 나머지 연산자
		c = b % a;
		System.out.println(c);

		a += b; // a = a+b
		System.out.println(a);

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);

		a = 10;
		b = 20;

		a++; // a = a + 1
		++b; // b = b + 1

		// 앞이나 뒤에다가 ++를 붙일 수 있다 (--도 마찬가지)

		System.out.println(a); // a == 11
		System.out.println(b); // b == 21

		c = a++; // 대입후 -> 증가 , c=> 11
		System.out.println(c);

		c = ++b; // 증가후 -> 대입, c=> 22
		System.out.println(c);

		a = 10;
		b = 20;
		d = 10.0;

		boolean isSuccess = false;
		
		
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == d;
		System.out.println(isSuccess);
		// false가 나올것 같은데, 답은 true
		// primitive data type의 == 연산자는 자료형에 상관없이 값만 같으면 true를 반환한다.

		isSuccess = a != b;
		System.out.println(isSuccess);
		
		// && 논리 곱 연산자 => 앞이 False이면 뒤의 논리와 상관없이 리턴값이 False; 
		// || 논리 합 연산자 => 앞이 True이면 뒤의 논리와 상관없이 리턴값이 True;
		// ! 논리 부정 연산자 
		
		//*코딩 참고사항: 비트연산자 ; 2byte로 2진법 연산을 하는 것! //
		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);
		
		a = 10;
		b = 20;
		
		// a && b => a가 false이면 b를 연산하지 않음(short circuit)
		// a || b => a가 true이면 b를 연산하지 않음(short circuit)
		
		isSuccess = (a==b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		isSuccess = (a==b) || (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a);
		System.out.println(b);
		
		// + => 연결연산자(두 개 중 1개 이상이 문자열인경우)
		//, 산술연산자(두 개 모두 숫자일 경우)
		
		//산술연산자와 연결연산자의 우선순위를 잘파악하는 방법!
		System.out.println(1+2+3+"456"); 
		System.out.println("123"+4+5+6);
		System.out.println("123"+4+(5+6));
		
		
		
		
		
		

	}

}
