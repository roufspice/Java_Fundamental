//1
package java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		
		Admin a = new Admin();
		
		
		Admin a1 = new Admin("roufspice", "1234", "qawsed@gmail.com",1);
		
		//a1.setId("roufspice");
		//a1.setPwd("1234");
		//a1.setEmail("qawsed@gmail.com");
		//a1.setLevel(1);
		System.out.println(a1.getId());
		System.out.println(a1.getPwd());
		System.out.println(a1.getEmail());
		System.out.println(a1.getLevel());	
		
		//인스턴스변수중에 몇개만 초기화하고 싶다면?? 어떻게 해??
		//생성자에도 오버로딩이 가능하다!! 
		//생성자도 매개변수(파라미터)를 다양하게 조정할 수 있는 오버로딩이 가능하다!
		
		Admin a2 = new Admin("roufspice", "1234", "qawsed@gmail.com");
		
		System.out.println(a2.getId());
		System.out.println(a2.getPwd());
		System.out.println(a2.getEmail());
		System.out.println(a2.getLevel());
		
		
		
		
	}

}
