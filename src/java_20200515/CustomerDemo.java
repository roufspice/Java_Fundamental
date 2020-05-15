package java_20200515;

public class CustomerDemo {
	public static void main(String[] args) {
		//클래스 객체 생성
		//Customer => 타입
		//c1 => 변수(레퍼런스)
		//new Customer() => 객체 생성 (*프로그램 메모리에 해당되는 object)
		
		Customer c1 = new Customer();
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
		
		
		System.out.println(c1.name);
		System.out.println(c1.email);
		System.out.println(c1.phone);
		System.out.println(c1.balance);
		System.out.println(c1.isReleased);
		
		System.out.println(c2.name);
		System.out.println(c2.email);
		System.out.println(c2.phone);
		System.out.println(c2.balance);
		System.out.println(c2.isReleased);
		
		Customer c3 = c2;
		// 레퍼런스 타입은 참조를 할 수 있다 여러번!
		c3.name = "손마사요시";
		System.out.println(c2.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	
}
