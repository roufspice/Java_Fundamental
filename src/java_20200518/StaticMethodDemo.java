package java_20200518;

// ?!호출할 수 있는지 없는지 판단하는것이 중요하다
public class StaticMethodDemo {
	String name; //인스턴스변수
	static double interestRate; //static변수
	
	public void m1() { //인스턴스 메서드
		//instance 메서드에서는 instance, static 변수 모두 사용가능!
		//instance 메서드에서는 instance, static 메서드 모두 호출가능!
		this.name = "하대윤"; // this :자기자신 객체
		StaticMethodDemo.interestRate = 4.2; //static변수는 항상 클래스이름으로 접근함  //서로다른 클래스의 static변수로 접근하기위해서 필요함!
		this.m2();
		StaticMethodDemo.m4(); //static메소드는 항상 클래스이름으로 접근함(클래스이름이 앞에 생략되어있었음)
		
	}
	
	public void m2() { //인스턴스메서드 //반환형이 없음
		System.out.println("m2() 인스턴스 메서드 호출");
		
	}
	
	public static void m3() { //static 메서드
		//static 메서드에서는 static변수만 사용가능, instance변수는 사용불가
		//static 메서드에서는 static메서드만 호출가능, instance메서드 호출불가
		//static 메서드에서는 this.를사용할 수 없음.
		
		//this.name = "하하";
		StaticMethodDemo.interestRate = 4.3;
		//m2();
		StaticMethodDemo.m4();
		
		//static 메서드에서 instance 변수와 instance 메서드를 호출하려면 
		//**객체를 생성해서 사용해야 한다**
		
		StaticMethodDemo smd1 = new StaticMethodDemo();
		smd1.name = "하하";
		smd1.m2();
		
	}
	
	public static void m4() {
		System.out.println("m4() static 메서드 호출");
	}
	
	
	
	
	public static void main(String[] args) {
		StaticMethodDemo.m4(); //static 메서드  클래스이름으로 호출
		StaticMethodDemo.m3(); //static 메서드
		StaticMethodDemo.interestRate = 4.3; //static 변수  
		
		//static메서드인 main메서드에서 인스턴스 변수/인스턴스메서드를 호출하려면 ?
		//***객체선언을 해야한다***//
		StaticMethodDemo n1 = new StaticMethodDemo();
		
		n1.m1();
		n1.m2();
		n1.name = "손정의";
		
		
		
		
		
	}
	
	
	

}
