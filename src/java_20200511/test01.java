package java_20200511;

public class test01 {
	public static void main(String[] args) {
		
		// 자료형을 배운다 //
		// 1) numeric 자료형 
		byte b1 = 123;
		
		short s1 = 15486;
		int i1 = 456789;
		long l1 = 7897878974564l;
		
		float f1 = 486.145f;
		double d1 = 125.48d;		//double 자료형은 생략이 가능하다
		
		char c1 = 'a'; 				//문자자료형은 문자열'String'과 별도로 생각하여야 함.
		boolean iscollected = false;
		
		//문자를 쓰는 방법은 ''도 있지만, 아스키코드와 유니코드로 해당 문자를 입력할 수 있다!!
		//Escape Character//
		
		System.out.println("배고프다"+ "\t");
		System.out.println("이거는 띄어" + "\t" + "쓰기");
		System.out.println("이거는 Enter" + "\n" + "그 다음 문장");
		System.out.println("\r");
		
		
		//Q1) '오늘의 메뉴는 "불고기 덮밥","탕수육"입니다\'
		
		System.out.println("\'오늘의 메뉴는 \"불고기 덮밥\",\"탕수육\"입니다\\\'");
		
		String apple = "사과는 맛있어";
		System.out.println(apple);
		
		double a = (int)123.456d;
		
		System.out.println(a);
		
		
		/* 데카르트는 "나는 생각한다. 고로 존재한다."라고 말했다.*/
		System.out.println("데카르트는 \"나는 생각한다. 고로 존재한다.\" 라고 말했다.");
		
		/* 형변환이 가능한 경우에 타입캐스팅을 통해서 변형이 가능함 */
		
		
		
		
		
		
		
		
		
		
	}


}
