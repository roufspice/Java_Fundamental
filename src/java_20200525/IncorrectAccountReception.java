package java_20200525;
//사용자 정의 예외 클래스
//자바에서 제공하는 예외 클래스가 없기 때문에, 새로 만들어서 사용해야 함!
public class IncorrectAccountReception extends Exception {
	
	public IncorrectAccountReception(String msg) {
		super(msg);
	}
	

}
