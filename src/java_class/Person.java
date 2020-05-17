package java_class;

public class Person {
	private String name;
	private int age;
	private long cashAmount;
	//소유계좌는 일단 보류
	//BankAccount클래스 타입의 참조변수 account를 선언한다. 메모리에 참조변수 account를 위한 공간이 마련된다. 
	private BankAccount account;
	
	//class밖에서도 접근가능한 메소드를 만들어서 해결해볼게요!
	//새로운값을 지정하는 메소드 / 읽어오는 메소드를 지정해볼게요
	
	//값을 지정하는 메소드
	//모든class에서 접근가능한 public 메소드,
	public void setAge(int pAge) {
		if(pAge >= 0) {
			age = pAge; 
		}
	}
	// 값을 출력하는 메소드를 만듭니다.
	public int getAge() {
		return age;
	}
	
	public void setName(String pName) {
		name = pName ;
		
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setCashAmount(long pCashAmount) {
		if(pCashAmount >= 0) {
			cashAmount = pCashAmount;
		}
	}
	public long getCashAmount() {
		return cashAmount;
		
	}
	public void setAccount(BankAccount pAccount) {
		account = pAccount;
	}
	
	public BankAccount getBankAccount() {
		return account;
	}
	

}
