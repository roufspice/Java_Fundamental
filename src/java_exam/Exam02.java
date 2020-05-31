package java_exam;

public class Exam02 {
	private String name;
	private String id;
	
	public Exam02(String name, String id) {
		this.name = name;
		this.id = id;
		
		
	
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
	
	public Exam02() {		//클래스내에 생성자가 없다면 원래는 complier가 자동적으로 생성자를 만들지만, 생성자를 만들면 자동적으로 생성해주지 않음.
							//객체를 생성하고 싶다면, 멤버변수를 초기화하는 생성자를 별도로 하나더 생성해야 함.!!!
		
		
	}

}
