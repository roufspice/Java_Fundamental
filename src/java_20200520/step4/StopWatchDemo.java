package java_20200520.step4;

public class StopWatchDemo {
	// run이라는 메서드에서 실행할 수 있게
	public static void run(StopMilliWatch s1) {
		s1.execute();
	}

	public static void run(StopNanoWatch s1) {
		s1.excute();
	}

	public static void main(String[] args) {
		//main메서드에서는 선언하고 메서드에 입력하는 방법으로만 구성해보자!
		//여기서는 서로다른 객체를 만들어야 하지만, 새로운 클래스를 하나 더 만들었을 때는 run메서드를 하나 더 추가해야한다
		
		StopMilliWatch s1 = new StopMilliWatch();
		//StopNanoWatch s1 = new StopNanoWatch();

		run(s1);


	}

}
