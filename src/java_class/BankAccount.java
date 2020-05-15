package java_class;

public class BankAccount {
	long balance;
	Person owner;
	
	// parameter: deposit(data type; long)
	// return (data type; long)
	boolean deposit(long amount) {
		if (amount < 0 || amount > owner.cashAmount) {
			System.out.printf("입금실패입니다. 현재잔액: %d, 현금: %d%n", balance, owner.cashAmount);
			return false;
			
		}else {
			owner.cashAmount -= amount;
			balance += amount;
			System.out.printf("%d 원 입금완료! 현재잔액: %d, 현금: %d%n", amount, balance, owner.cashAmount);
			return true;
		}
		
	}
	
	boolean withdraw(long amount) {
		if (amount < 0 || amount > balance) {
			System.out.printf("출금실패입니다. 잔액이 모자랍니다. 현재잔액: %d, 현금: %d%n", balance, owner.cashAmount);
			return false;
			
		}else {
			owner.cashAmount += amount;
			balance -= amount;
			System.out.printf("%d 원 출금완료! 현재잔액: %d, 현금: %d%n", amount, balance, owner.cashAmount);
			return true;
		}
		
	}
	

}
