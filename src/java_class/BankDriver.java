package java_class;

public class BankDriver {
	public static void main(String [] args) {
		// 인간선언!!
		Person p1 = new Person();
		p1.name = "하대윤";
		p1.age = 26;
		p1.cashAmount = 50000;
		
		//계좌개설
		BankAccount b1 = new BankAccount();
		b1.balance = 1000000;
		
		
		// 
		p1.account = b1;
		b1.owner = p1;
		
		b1.withdraw(10000);
		b1.withdraw(10000);
		b1.withdraw(10000);
		b1.withdraw(10000);
		b1.withdraw(10000);
		b1.withdraw(10000);
		b1.deposit(5000);
		b1.deposit(5000);
		b1.deposit(5000);
		b1.deposit(5000);
		b1.deposit(5000);
		b1.deposit(5000);
		
		
		
		
		
	}

}
