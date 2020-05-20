package java_20200520;
//형변환  //추상클래스
public abstract class Super {
	// 추상메서드가 클래스 안에 존재한다면 해당 클래스는 반드시 추상클래스로 만들어야 함
	//**추상클래스는 객체를 생성할 수 없다.(구현부분body가 없다)  
	public abstract void test();  
	
	int age = 50;
	public void work() {
		System.out.println("Super work()");
	}
	public void playBadook() {
		System.out.println("Super playBadook()");
	}

}
