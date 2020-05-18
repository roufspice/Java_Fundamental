package java_20200514;

public class BankAccount {
	long balance;
	Person owner;

	// parameter: deposit(long)
	// return: t/f (boolean)

	boolean deposit(long amount) {
		if (amount < 0 || amount > owner.cashAmount) {
			System.out.printf("입금 실패입니다. 잔액: %d원, 현금: %d원%n", balance, owner.cashAmount);

			return false;
		} else {
			balance += amount;
			owner.cashAmount -= amount;
			System.out.printf("입금 성공입니다. 잔액 잔액: %d원, 현금: %d원%n", balance, owner.cashAmount);
			return true;
		}
	}

	// parameter: long amount
	// return: t/f (boolean)

	boolean withdraw(long amount) {
		if (amount < 0 || amount > balance) {
			System.out.printf("출금 실패입니다. 잔액: %d원, 현금: %d원%n", balance, owner.cashAmount);
			return false;

		} else {
			balance -= amount;
			owner.cashAmount += amount;
			System.out.printf("출금 성공입니다. 잔액 잔액: %d원, 현금: %d원%n", balance, owner.cashAmount);
			return true;
		}

	}
	
	
}
