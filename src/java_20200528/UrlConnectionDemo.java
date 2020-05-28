package java_20200528;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionDemo {
	public static void main(String[] args) throws IOException {
		
		/**/URL url = new URL("https://www.naver.com/");	//<<url의 각각의 구성요소>>들을 호출할때 사용! (html, jpg 등등) (protocol, host, port, path, query, ref)
		/**/URLConnection urlcon = url.openConnection();	//UrlConnection 클래스는 url에 있는 <<원격 서버의 헤더 정보>>를 가져올 수 있다.
		
		String cacheControl = urlcon.getHeaderField("cache-control");
		String contentType = urlcon.getContentType();
		String date = urlcon.getHeaderField("date");
		
		System.out.println(cacheControl);
		System.out.println(contentType);
		System.out.println(date);
		
		InputStream in = urlcon.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		String readLine = null;
		while((readLine = br.readLine())!=null) {
			System.out.println(readLine);
			
		}
		in.close();
		isr.close();
		br.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
