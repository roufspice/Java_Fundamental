package java_class;

public class BankAccount {
	private long balance;
	private Person owner;

	public void setBalance(long pSetBalance) {

		balance = pSetBalance;

	}

	public long getSetBalance() {
		return balance;
	}

	public void setOwner(Person pOwner) {
		owner = pOwner;

	}

	public Person getOwner() {
		return owner;

	}

	// parameter: deposit(data type; long)
	// return (data type; long)
	boolean deposit(long amount) {
		if (amount < 0 || amount > owner.getCashAmount()) {
			System.out.printf("입금실패입니다. 현재잔액: %d, 현금: %d%n", balance, owner.getCashAmount());
			return false;

		} else {
			
			
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			System.out.printf("%d 원 입금완료! 현재잔액: %d, 현금: %d%n", amount, balance, owner.getCashAmount());
			return true;
		}

	}

	boolean withdraw(long amount) {
		if (amount < 0 || amount > balance) {
			System.out.printf("출금실패입니다. 잔액이 모자랍니다. 현재잔액: %d, 현금: %d%n", balance, owner.getCashAmount());
			return false;

		} else {
			owner.cashAmount += amount;
			balance -= amount;
			System.out.printf("%d 원 출금완료! 현재잔액: %d, 현금: %d%n", amount, balance, owner.getCashAmount());
			return true;
		}

	}

}
