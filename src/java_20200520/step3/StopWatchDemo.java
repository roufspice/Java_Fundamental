package java_20200520.step3;

public class StopWatchDemo {
	
	// 수행할 메서드를 바깥으로 빼서 만들어보자! 
	public static void main(String[] args) {
		StopNanoWatch s1 = new StopNanoWatch();
		//StopMilliWatch s1 = new StopMilliWatch();
		
		//수행할 메서드를 다른곳에서 사용하는게 보다 편리하지 않을까?
		s1.start();

		for (long i = 0; i < 20000_000_000l; i++) {

		}
		s1.stop();
		
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간: %.9f%n", elapsedTime);
		

	}

}
