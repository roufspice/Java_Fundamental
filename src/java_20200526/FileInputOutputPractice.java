package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputPractice {
	public static void main(String[] args) {
		
		FileInputStream fis = null;  //연결하는 원리
		FileOutputStream fos = null;
		
		
		try {
			fis = new FileInputStream("c:\\dev\\screen.exe");  //소스(파일 입력)
			fos = new FileOutputStream("c:\\dev\\screen.png"); //(파일출력)	
			//1byte stream
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0 , readByteCount);
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(fis != null) fis.close();
					if(fos!= null) fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					System.out.println("복사끝!!");
				}
			
		}
		
		
		
		
	}
}
