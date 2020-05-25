package java_20200525;

public class TryCatchDemo {
	public static double getAvg(int first, int second) {
		int sum = first + second;
		double avg = (double) sum / 2;
		return avg;
		
	}
	public static void main(String[] args) {

		try {
		int korean = Integer.parseInt(args[0]);
		int english = Integer.parseInt(args[1]);
		
		//파라미터에 음수를 넣을 수 있잖아...
		double average = getAvg(korean, english);
		System.out.printf("평균 : %f%n", average);
		//catch의 매개변수 타입은 Exception의 하위클래스로 지정
		
		} catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("예외메시지 : " + e.getMessage());
			System.err.println("2개를 넣어주세요");	//error메시지 출력은 System.err.pri~~~
			e.printStackTrace(); //
			/*
			 * 일반 출력: System.out
			 * 에러 출력: System.err
			 * 에러가나는 값과 경로등을 하나씩 출력: e.printStackTrace();
			 */
			
		} catch(NumberFormatException e) {
			//System.out.println("예외 메세지: " + e.getMessage());
			System.err.println("문자말고 숫자를 입력하세요");
			
		} finally {
			System.out.println("fianlly");
		}
		
		//catch 블럭이 여러 있을 경우 위에서 부터 하위 클래스 => 상위클래스 순으로 정한다.
	
	}
}