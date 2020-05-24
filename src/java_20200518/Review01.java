package java_20200518;

public class Review01 {
	String name;
	String height;
	public static int number;
	
	public void m1() {
		System.out.println("메소드 m1을 실행합니다");
		name = "하대윤";
		height = "178cm";
		
		// 인스턴스 메소드에서는 인스턴스 변수를 그냥 선언 할 수 있다!!
		
			
	}
	
	public static void m2() {
		System.out.println("메소드 m2을 실행합니다.");
		
		number = 5;
		Review01 r1 = new Review01();
		r1.name = "스타벅스";
		r1.height = "170cm";
		
		//static 메소드에서는 static 변수와 static 메소드만 호출이 가능하다.
		//다만, 인스턴스변수,메소드를 호출하고 싶다면, 객체를 선언해야 한다.
		
		
		
	}
	
	
	
	
	

}
