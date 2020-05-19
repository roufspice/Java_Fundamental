//1
package java_20200519;

public class Admin {
	private String id;
	private String pwd;
	private String email;
	private int level;
	//디폴트생성자(default constructor): 파라미터(매개변수)가 없는 생성자
	//**Alt + Shift + s => c
	//디폴트생성자를 만들고 시작하면, 객체사용에 오류발생을 막을 수 있으니, 꼭!! 디폴트생성자를 만들고 시작하자!!
	public Admin() {
		super();
		//모든 생성자에는 super()가 숨어있음
		//super() -부모클래스의 default 생성자를 호출해준다dfdf
	}
	
	//생성자(Constructor)
	//?setter/getter 메서드를 일일이 만들어야 하나? 한번에 매개변수를 설정해서 할 수는 없을까?
	//객체가 생성될 때 객체의 초기화 과정
	//생성자는 반환값이 없고, 이름은 **클래스 이름**과 **동일**하다
	//생성자의 역할은 '**인스턴스 변수 초기화**'
	//**Alt + Shift + s => o
	public Admin(String id, String pwd, String email, int level) {
		//super(); //모든생성자에는 첫줄에 super()가 숨어있음! //**상속에 관련한 overriding
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	//생성자의 오버로딩(overloading)	
	//?생성자도 메서드와 같이 오버로딩이 가능하다(생성자도 크게 보면 메서드의 일종이니까)
	public Admin(String id, String pwd, String email) {
		//super();
		//this.id = id;
		//this.pwd = pwd;
		//this.email =email;
		
		this(id, pwd, email, 0);  //=>다른생성자를 호출, 반드시 생성자에서만 호출가능!!
		
		//**this 용법 2가지
		//1. 자기자신 객체 => this.
		//2. 다른 생성자를 호출 => this()
		//3. 생성자를 오버로딩할 때, this()를 사용해서 다른 생성자를 호출하는 식으로 작성하자!
	}
	
	
	public Admin(String id, String pwd) {
		this(id, pwd, null, 0);
	}

	/**
	 * @param pwd
	 * @param email
	 * @param level
	 */
	public Admin(String pwd, String email, int level) {
		this(null, pwd, email, level);
		
	}

	//id에 대한 setter 메서드;
	public void setId(String id) {
		this.id = id;
	}
	//id에 대한 getter 메서드;
	public String getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	
	

}
