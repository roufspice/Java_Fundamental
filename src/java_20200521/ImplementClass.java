package java_20200521;

public class ImplementClass implements InterA {
	
	/*
	 * 인터페이스 사이의 상속은 다중 상속이 가능
	 * 클래스 사이의 상속은 단일상속만 가능하다는 점과 차이!!
	 * 인터페이스에 정의된 메소드의 접근 한정자는 public;
	 * 인터페이스의 변수는 ONly 상수
	 * public static final 생략되어있다는거죠
	 * 인터페이스의 메소드는 추상메소드만 가능하며, 그냥 메소드를 선언해도 앞에 abstract가 생략되어있다
	 * 
	 * 인터페이스에 선언된 모든 메소드(추상)를 오버라이딩하여 선언해야 한다.!
	 * 오버라이딩시 모든 메서드 public 선언!!
	 */
	
	public void mA() {
		System.out.println("mA()");
	}
	
	public void mB() {
		System.out.println("mB()");
	}
	
	public void mC() {
		System.out.println("mC()");
	}

}
