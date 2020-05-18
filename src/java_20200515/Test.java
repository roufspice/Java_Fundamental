package java_20200515;

public class Test {
	public static void main(String[] args) {
		System.out.println("메인메소드 실행!");
	}
	

}

//권장사항은 아니지만, 하나의 프로그램에 여러개의 클래스 생성이 가능함!
// public 한정자는 파일이름과 동일한 클래스에만 붙일 수 있음. 
// main 매서드는 파일이름과 클래스이름이 같은 곳에 위치해야 함!


class box {
	// main메소드가 실행이 안됨!
	public static void main(String[] args) {
		System.out.println("메인메소드 실행");
		
	}
	//pull잘된지 테스트 합니다.
}
