package java_class;

public class Review {
	//생성자(constructor) : 객체의 초기화 과정을 기술하는 메소드!! 
	private String id;
	private String pwd;
	private String email;
	private int level;
	// 생성자는 멤버변수(instance)변수들의 값을 초기화하는 과정인데,
	// 앞에서 공부했던  setter, getter를 생각해보자
	
	//디폴트 생성자를 만들어야 함!, 아래에 생성자를 하나 별도로 추가했기 때문에! 만들지않으면 사라짐..
	public Review() {
		super();  //상위클래스
		
	}
	
	public Review(String id, String pwd, String email) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		
	}
	
	public Review(String id, String pwd) {
		this(id, pwd, null);
		
		
	}
	//생성자도 오버로딩이 가능하다

}


