package java_20200525;

public class ThrowDemo {

	public static double withdraw(String account, int amount)
			throws IncorrectAccountReception, InsufficientBalanceException { //Exception클래스에 존재하지 않는 예외, 개발자가 인위적으로 예외를 발생시킴
		// 해당메소드에서 발생할 수 있는 예외를 처리하지 않고 호출하는 메소드로 throws 해버렸음.

		double myBalance = 10000;
		String myAccount = "123-123-123";

		if (myAccount.equals(account)) { //String 클래스의 equals()메소드로 값의 논리연산 비교
			if (myBalance >= amount) {
				myBalance -= amount;

			} else {
				//예외를 임의로 발생: 특정한 경우가 있잖아요.
				throw new InsufficientBalanceException("잔고가 부족합니다."); //예외클래스 객체를 만드는 변수 InSufficientBalanceException을 생성
			}
		} else {
			// 예외를 개발자가 임의로 발생
			throw new IncorrectAccountReception("잘못된 계정입니다."); //예외클래스 객체를 만드는 변수생
		}
		return myBalance;
	}

	public static void main(String[] args) {
		double balance = 0;

		try {
			balance = withdraw("123-123-123", 1000000);
			System.out.printf("잔고: %f%n", balance);

		} catch (IncorrectAccountReception e) {
			System.out.println(e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}

//특정한 상황에서 리턴값을 주지 못할경우가 있다보니, 예외를 만들어서 진행한다.
//자바에서 예외가 발생할 수 있는 코드에, 
//try~ catch 블록으로 잡거나 | throws로 진행하는 메소드로 던지거나 
//예외가 발생이 되었을때, 임의로 예외를 만들
