package java_20200520.step4;

public class StopMilliWatch {
	// 밀리세컨드를 관리하기 위한 변수
	private long startTime;
	private long endTime;

	// 밀리세컨드의 경과시간
	private double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}

	// 밀리세컨드의 시작시간
	private void start() {
		startTime = System.currentTimeMillis();
	}

	// 밀리세컨드의 종료시간
	private void stop() {
		endTime = System.currentTimeMillis();
	}
	
	//계산해주는 코드도 있어야 한다!!
	public void execute() {
		start();
		for (long i = 0; i < 20000_000_000l; i++) {
		}
		stop();

		double elapsedTime =getElapsedTime();
		System.out.printf("경과시간: %.3f%n", elapsedTime);
	}

}
