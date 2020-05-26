package java_20200526;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream f2 = new FileOutputStream("C:\\dev\\daum_scan.txt");
		OutputStreamWriter osw = new OutputStreamWriter(f2);
		//BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter ps = new PrintWriter(osw, true);
		
		
		
		String readLine = null;
		double start = (double)System.currentTimeMillis()/1000;
		while((readLine = br.readLine()) != null){
			ps.println(readLine);
			//bw.write(readLine);
			//bw.newLine();
			
			
			//System.out.println(readLine);
			
		}
		//bw.flush();
		double end = (double)System.currentTimeMillis()/1000;
		System.out.printf("작동시간: %,.3f 초 ",end-start);
		
		
		
		
	}

}
