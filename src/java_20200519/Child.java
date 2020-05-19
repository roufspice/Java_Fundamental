package java_20200519;

public class Child extends Parent {
	
	String chicken;
	public void goSchool() {
		System.out.println("Child.goSchool()");
	}

	// Parent의 play메서드를 오버라이딩 함~
	public void play(String lol) {
		// super.play("starcraft");
		System.out.println("Child.play()");
	}

	public void setParentMoney(int money) {
		// Child의 인스턴스변수가 아닌, Parent의 인스턴스 변수를 호출한다.
		super.money = money;
	}

	public int getParentMoney() {
		return super.money;
	}

}
