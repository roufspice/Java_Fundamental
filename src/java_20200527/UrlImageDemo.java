package java_20200527;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlImageDemo {

	public static void main(String[] args) throws IOException {
		
		URL url = new URL("http://gdimg.gmarket.co.kr/651036497/still/300");    //URL(String protocol, String host, int port, String file)
		InputStream in = url.openStream();  									//URL을 열고 inputStream으로 반환값을 준다 => IO collection을 사용할 수 있음
		//in을  String으로 바꿔주는건 어떻게 하지??
		
		
		FileInputStream fis = null;
		
		//BufferedInputStream은 생성자 선언시 매개변수를 inputStream으로 한다!!! 
		//inputStream인 url.openStream()!!!
		BufferedInputStream bis = null;
		bis = new BufferedInputStream(in);
		
		
		
		
		FileOutputStream fos = null;
		fos = new FileOutputStream("c:\\dev\\image.png");
		
		int readByteCount = 0;
		byte[] readBytes = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		
		while((readByteCount = bis.read(readBytes))!= -1) {
			fos.write(readBytes,0,readByteCount);	
		}
		long end = System.currentTimeMillis();
		fos.flush();
		
		System.out.println(end-start);
		
	
	}

}
