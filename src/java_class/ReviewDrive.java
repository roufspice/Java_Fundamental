package java_class;

public class ReviewDrive {
	public static void main(String[] args) {
		
		Review r1 = new Review("roufspice", "1234", "adf@.com");
		// 생성자를 만들고, 매개변수에 값들을 대입하여 멤버변수를 초기화했다.
		
		Review r2 = new Review("roufspice", "4567");
		//생성자 overloading으로 만든 매개변수 두개를 초기화하는 객체를 불러온다.
		
	}

}
