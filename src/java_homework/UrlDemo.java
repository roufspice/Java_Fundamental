package java_homework;
//Url을 웹상에서 가져와서 자바 기준출력장치로 호출하기/ file만들어서 호출하기!!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlDemo {
	public static void main(String[] args) throws IOException {
		// url을 가져와서 기준출력장치에 출력해보자

		URL url = new URL("https://shop.kt.com/smart/supportAmtList.do");

		InputStream in = url.openStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		FileWriter fw = new FileWriter("c:\\dev\\ktshop.url.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		
		String readLine = null;
		while((readLine = br.readLine())!= null) {
			//문자열로 읽는데.
			System.out.println(readLine);
			//파일로 출력하기
			bw.write(readLine);
			bw.newLine();
			
			
			
		}
		bw.flush();
		
		
		System.out.println("파일출력 및 콘솔창 출력 완료!!!");
		in.close();
		isr.close();
		br.close();
		
		

	}

}
