package java_20200518;

public class MemberVariableDemo {
	String name;
	int age;
	double weight;
	boolean isReleased;
	char charA;
	
	public void methodA(String id) {
		//지역변수에는 접근 한정자를 붙일 수 없다.
		//public int test;
		//지역변수는 초기화를 하지 않아도 상관없지만, 다른곳에서 연산하면 에러발생(지역변수는 기본값이 없기때문이다)
		
		//int a;    //에러발생
		//int b = a+10;
		
		int a = 0; //지역변수는 초기화를 해야한다(초기화를 하지 않고 선언해도 상관없지만, 기본값은 없다)
		int b = a+10;
		
		//id, a, b의 유효범위는 methodA에서만 사용가능(지역변수,매개변수(파라미터,인수값))
		
	}
	
	public static void main(String[] args) {
		MemberVariableDemo m = new MemberVariableDemo();
		//멤버변수는 객체를 생성하면 기본값을 갖는다.
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.charA);    //char 기본값은 공백이다
		System.out.println(m.isReleased);
		
		
	}
}
