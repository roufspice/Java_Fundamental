package java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamDemo {
	public static void main(String[] args) {
		//System.out.println("입력하세요>");
		InputStream in = System.in;//표준입력장치와 연결 == 키보드 
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		isr = new InputStreamReader(in);	//1byte를 2byte stream으로 바꿔주는 클래스
		br = new BufferedReader(isr);
		
		String readLine = null;
		System.out.println("입력하세요>");
		
		try {
			while((readLine = br.readLine()) != null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
		
		
		
		
		
		
		
		

