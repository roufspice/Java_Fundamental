package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream in = System.in;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		
		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		
		String readLine = null;
		System.out.println("입력하세요>");
		
		try {
			while((readLine = br.readLine())!= null) { //표준출력장치로 입력하는것!
				System.out.println(readLine); 		//표준출력장치로 출력하는것!
				System.out.println("입력하세요>");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
