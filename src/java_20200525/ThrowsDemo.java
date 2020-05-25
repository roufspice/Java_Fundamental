package java_20200525;

public class ThrowsDemo {
	//argument실행값: Run Configuration - 인자값 입력
	public static int getDivide(int first, int second) throws ArithmeticException{
		//RuntimeException의 sub가 아니면 반드시 예외처리를 해야 한다.
		
		int result = (int) first / second;	//예외가 발생할 수 있는 코드(두개의 값을 입력안할수도 있고, 정수타입을 입력 안 할 수도 있다)
		//getDivide 메소드에서 예외처리를 하지않고, getDivide 메소드를 호출하는 메소드(main)에서 예외처리를 하겠다.
		return result;
		
	}
	
	public static void main(String[] args) {
		
		try {
			//argument를 2개 입력을 안할 수 있는 예외가 발생하는 구간이다.
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		int result = getDivide(first, second);
		System.out.printf("결과 : %.2d%n", result);
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("인자를 2개 입력하셔야 합니다.");
	}catch(NumberFormatException e) {
		System.out.println("인자에는 숫자를 입력하셔야 합니다.");
	}catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다.");
	}finally {
		System.out.println("finally");
	}
	System.out.println("끝");

}
}