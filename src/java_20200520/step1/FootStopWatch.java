package java_20200520.step1;

public class FootStopWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1000;
	}
	public static void main(String[] args) {

		FootStopWatch f1 = new FootStopWatch();

		// 1970년 1월 1일 부터 지금까지 시간을 밀리 세컨드로 반환.
		f1.startTime = System.currentTimeMillis();

		for (long i = 0; i < 80_000_000_000l; i++) {

		}

		f1.endTime = System.currentTimeMillis();

		
		System.out.printf("경과시간: %.3f%n", f1.getElapsedTime());

	}

}
