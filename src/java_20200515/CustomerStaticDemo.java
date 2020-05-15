package java_20200515;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		//static 변수
		//1.모든 객체가 공통으로 사용할 수 있는 변수
		//2.레퍼런스(c1, c2)로 접근하지 않고 클래스 이름으로 접근한다.
		
		
		Customer c1 = new Customer();
		c1.name = "홍길동";
//		c1.interestRate = 30.45;
		//static변수는 레퍼런스로 접근하는 것보다 클래스 이름으로 접근한다.
		Customer.interestRate = 30.45;
//		System.out.println(c1.interestRate);
		
		Customer c2 = new Customer();
		c2.name = "아무개";
//		c2.interestRate = 12.25;
		//static변수는 레퍼런스로 접근하는 것보다 클래스 이름으로 접근한다.
		Customer.interestRate = 12.25;
//		System.out.println(c1.interestRate);
		// 0이나온다.  > 내생각이었는데, 아니었다!
		
		
		
		
	}

}
