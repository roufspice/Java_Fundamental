package java_class;

public class BankAccount {
	private long balance;
	//계좌의 주인은 어떻게 표현할 수 있을까요?
	private Person owner;
	// Person class를 자료형으로 가진 맴버변수 owner 사용하면된다.
	//Person 인스턴스를 참조하기 위한 변수 owner를 선언!
	
	public long getBalance() {
		return balance;
	}
	
	public void setBalance(long pBalance) {
		if(pBalance >= 0) {
			balance = pBalance;
		}
	}
	
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person pOwner) {
		owner = pOwner;
	}
	
	//입금기능과 출금, 이체기능이 있어야 한다.
	//파라미터: 입금할 액수
	//리턴값으로: 성공여부(boolean)
	
	boolean deposit(long amount) {
	//리턴타입 메소드이름(파라미터값)
		if(amount >= 0 && amount <= owner.getCashAmount()) {  //owner.cashAmount = Person owner = Person(); 
			//owner.cashAmount -= amount; //은행계좌 주인의 현금보유액은 입금한 금액만큼 감소한다는 의미!
			owner.setCashAmount(owner.getCashAmount() - amount);
			balance += amount;
			System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원%n", amount, balance, owner.getCashAmount());
			System.out.println("true");
			
			return true;
			
		} else {
			System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원%n", balance, owner.getCashAmount());
			System.out.println("false");
			return false;
		}
		
	}
	
	//파라미터: 출금할 액수
	//리턴값: 성공여부(boolean)
	
	boolean withdraw(long amount) {
		if(amount >= 0 && amount <= balance) {
//			owner.cashAmount += amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			balance -= amount;
			System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원%n", amount, balance, owner.getCashAmount());
			System.out.println("true");
			return true;
		} else {
			System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원%n", balance, owner.getCashAmount());
			System.out.println("false");
			return false;
		}

		
	}

	
	//파라미터: 받는사람(person), 이체할금액(long)
	//리턴값: 성공여부(boolean)
//	
//	boolean transfer(Person to, long amount) {
//		
//		
//	}
}
