package java_20200514;

public class BankDriver {
	public static void main(String[] args) {
		// 사람선언!!
		Person p1 = new Person();
		p1.name = "하대윤";
		p1.age = 26;
		p1.cashAmount = 10000;
		
		
		// 계좌생성!!
		BankAccount a1 = new BankAccount();
		a1.balance = 1_000_000;
		
		//두 객체 연결해주기!!
		p1.account = a1;
		a1.owner = p1;
		
		// 제어문으로 0원일때까지 잔액 돌리기
		while(a1.balance != 0) {
			if (a1.balance < 1000) {
				break;
			}
			a1.withdraw(10);
			a1.deposit(5);
			
		}
		
			
		}
			
		
		
		
	
		
	}

