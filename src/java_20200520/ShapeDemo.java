package java_20200520;

public class ShapeDemo {
	// 추상 클래스의 다형성**
	public static void run(Shape s) {
		s.draw(); //overridng 되어있는 draw메서드니까
	}
	
	/*
	public static void run(Triangle t) {
		t.draw();
	}
	
	public static void run(Circle c) {
		c.draw();
	}
	
	
	public static void run(Rectangle r) {
		r.draw();
		
	}
	*/
	
	public static void main(String[] args) {
		//추상클래스는 객체를 생성할 수 없습니다.
		Shape s1 = new Shape();
		
		//Shape s1 = new Triangle();
		Shape s1 = new Circle();
		//Shape s1 = new Rectangle();
		s1.draw();
		
		
		
		
		
		
		
		
		
	}

}
