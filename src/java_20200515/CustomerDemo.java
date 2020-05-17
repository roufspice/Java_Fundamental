package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		//클래스 객체 생성
		//Customer => 타입
		//c1 => 변수(레퍼런스, 참조변수)
		//new Customer() => 객체 생성 (*프로그램 메모리에 해당되는 object)
		
		Customer c1 = new Customer();
		//클래스명 참조변수 = new 클래스명();
		// "."을 이용하여 다른 멤버변수나 메소드에 접근이 가능해진다
		
		c1.name = "하대윤";
		c1.email = "daeyoun.ha27@gmail.com";
		c1.phone = "010-3545-2118";
		c1.balance = 1_000_000;
		c1.isReleased = false;
		
		
		
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.email = "hoho@soft.com";
		c2.phone = "010-4567-0000";
		c2.balance = 10_000_000_000d;
		c2.isReleased = false;
		
		
//		System.out.println(c1.name);
//		System.out.println(c1.email);
//		System.out.println(c1.phone);
//		System.out.println(c1.balance);
//		System.out.println(c1.isReleased);
//		
//		System.out.println(c2.name);
//		System.out.println(c2.email);
//		System.out.println(c2.phone);
//		System.out.println(c2.balance);
//		System.out.println(c2.isReleased);
		
		
		
		
		//Q
		Customer c3 = new Customer();
		c3.name = "이재용";
		c3.email = "iloveSamsumng@samsung.com";
		c3.phone = "010-0101-0101";
		c3.balance = 10_000_000;
		c3.isReleased = true;
		
		System.out.println(c2.isReleased);
		
		//Q 참조하는 기준이 달라진다.
		
//		c2 = c3; //c2의 객체는 c3를 참조하게된다.
		c3 = c2;   //c3의 객체는 c2를 참조하게된다.
		System.out.println(c2.isReleased);
		
//		Customer c4 = c3; // 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
}
