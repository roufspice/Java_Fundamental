package java_20200515;

//Customer class
public class Customer {
	//클래스의 멤버변수 - instance 변수, static 변수, final 변수
	//인스턴스 변수(name, email, phone, balance, isReleased)
	//객체가 생성될 때만 만들어지는 변수가 : 인스턴스변수!
	
	
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate;
	//하나의 클래스에서 모든 객체들이 공유하는 변수!
	public static final String BANKNAME = "신한은행";
	//상수인 final 변수는 대문자로 쓰는 것이 관례! 
	//상수는 한번 정해지면 값을 변경할 수 없음으로 일반적으로 static final로 사용한다.
	
	
	
	
	

}
