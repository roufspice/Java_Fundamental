package java_20200520.step5;

import java.io.BufferedReader;
import java.io.FileReader;
// Java: 5-18
public class StopWatchDemo {

	public static void run(StopWatch s1) {
		s1.execute();
	}

	public static void main(String[] args) throws Exception {

		// StopMilliWatch s1 = new StopMilliWatch();
		// StopMicroWatch s1 = new StopMicroWatch();
		// StopNanoWatch s1 = new StopNanoWatch();

		// run(s1);

		// Java IO 21-
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\dev\\eclipse-workspace\\Java_fundamental\\src\\java_20200520\\step5\\class.txt"));

		String readLine = br.readLine();

		Class clazz = Class.forName(readLine);

		StopWatch s = (StopWatch) clazz.newInstance();
		run(s);

	}
}
