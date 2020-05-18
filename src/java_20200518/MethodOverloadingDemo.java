package java_20200518;

public class MethodOverloadingDemo {
	//MethodOverloadingDemo 클래스에는 print 메서드를 4가지로 오버로딩
	//오버로딩 작성규칙
	//1. 같은 클래스내에서
	//2. 메서드 이름은 같아야 한다
	//3. 매개변수(인수값,파라미터)갯수가 같으면 자료형이 달라야 한다.
	//4. 매개변수 갯수가 달라야 한다.
	//5. 반환형과 접근 한정자는 같아도 되고 달라도 된다.
	
	public void print(String str) {
		System.out.print(str);
	}
	
	public void print(long i) {
		System.out.print(i);
	}
	
	public void print(double d) {
		System.out.print(d);
	}
	
	public void print(boolean b) {
		System.out.print(b);
	}
	
//	public void test(int... a) {		//variable arguments: 메서드의 매개변수(파라미터)를 좀더 유연하게 받도록 하기위한 기능!
//		for(int temp : a) {
//			System.out.print(temp +  " ");
//		}
//		System.out.println();
//		
//	}
	
	
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.print("hello");
		m.print(100);
		m.print(10.34);
		m.print(true);
		m.print(10_000_000_000L);
//		m.test(1);
//		m.test(1,2);
//		m.test(1,3,5);
		
		
		
		
	}
	//메소드 이름을 정할때는 동사를 정하고, 목적어를 매개변수(파라미터)로 생각하면됩니다.
	//메소드 이름은 영어문법식기준을 따르는것이 좋다.

}
