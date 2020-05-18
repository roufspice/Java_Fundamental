package java_class;

public class BankDrive {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("김신의");
		p1.setAge(28);
//		p1.setCashAmount(-100);
		p1.setCashAmount(100000);
		//System.out.println(p1.getCashAmount());
		//System.out.println(p1.getName());
	
		
		
		BankAccount a1 = new BankAccount();
		a1.setBalance(500000);
		
		
		//p1.account = a1;
		p1.setAccount(a1);
		a1.setOwner(p1);
		
		
		a1.deposit(30000);
		a1.withdraw(170000);
		a1.deposit(300000);
		a1.withdraw(400000);
		
		
		
		
		
		
	}

}
