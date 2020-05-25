package java_20200525;

public class ExceptionSampleDemo {
	public static void main(String[] args) {
		String msg = null;
		//1.NullPointerException 예외발생 
		//int msgLength = msg.length();
		//System.out.println(msgLength);
		
		//2.ArrayIndexOutOfBoundsException 예외발생
		//int[] array = {1,2,3};
		//int temp = array[3];
		
		//3.ArithmeticException 예외발생 
		//int result = 3/0;
		//System.out.println(result);
		
		//4.NumberFormatException 예외발생
		int first = Integer.parseInt("a");
		System.out.println(first);
		
		//보통 사용자로부터 받는 입력값에서 오류가 발생
		//적절한 예외메시지를 알려주면서 프로그램이 중단되지 않도록 진행!!
		
		
		
		//Error클래스의 하위클래스는 하드웨어가 관리해준다.
		//Exception클래스의 하위클래스를 개발자가 관리해줘야 한다.
		
		//RuntimeException의 하위클래스에서는 : 예외처리를 해도 되고 안해도 되고...
		//RunTimeExcpetion 그밖의 예외는 클래스는 반드시! 예외처리를 해야합니다.   
		//안했을경우는 프로그램이 중단되는 경우가 발생하기 때문에... 
		//예외처리가 발생해도 계속적으로 프로그램을 진행하도록 하기 위해서는 어떻게 해야하느냐?
		//사용자로부터 입력을 받는 경우는 충분히 에러가 발생할 수 있다.
		//exception - RuntimeExcpetion / 그밖의 예외클래스
		
		
		
		
		
		
	}
	
	

}
