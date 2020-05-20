package java_20200520;

public class SubDemo2 {
	
	public static void change(Super sup) { //Super sup = s1;
		sup.age = 20;
		sup.work(); //Sub work() 호출 - 이유:오버라이딩 되어있기 때문에 sub메서드가 호출됨!
		
		
		
	}
	

	
	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);
		s1.work();
		//?sub work(): 오버라이딩  된 메서드이기 때문에 자식의 메서드를 먼저 받는다.
		System.out.println("==========");
		
		change(s1); //**change메서드에 매개변수로 들어오는 s1은 참조타입이 Super로 변경되면서 참조하는 방향이 sub에서 super를 향하고 Super.age는 20으로 바뀐다.
		System.out.println(s1.age); //super 클래스를 참조하도록 변경되었기 때문에(change메서드에 들어갔다 나옴) 
		//?s1.work():객체의 형변환이 발생했지만, work 메서드가 overriding 되어있기 때문에 
		// 오버라이딩: 상위클래스의 메서드가 하위 클래스에 의해 가려진다. / 상위클래스의 멤버변수, 메서드는 접근이 가능하다. s1.age = 50이 나오는 이유 / 
		// 서브의 멤버변수, 메서드는 접근이 불가하지만, 서브 메서드중에 오버라이딩 된 메서드가 있다면, 접근 가능함.  
		
		System.out.println("==========");
		
		
		
		
		
		

		
	}

}
