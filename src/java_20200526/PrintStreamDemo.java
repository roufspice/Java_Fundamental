package java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	

	public static void main(String[] args) {
		
		PrintStream monitor = System.out; //출력장치와 연결된 PrintStream!!
		monitor.println("Hello World");
		
		
		
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		
		try {
			fis = new FileInputStream("c:\\dev\\Git-2.26.2-64-bit.exe");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("c:\\dev\\Git_copy4.exe");
			bos = new BufferedOutputStream(fos);
			//파일과 연결되어 있는 PrintStream!!
			ps = new PrintStream(bos, true); //true => autoFlush
			
			int readByte = 0;
			while((readByte = bis.read())!= -1) {
				ps.write(readByte); //buffer기능을 갖고 있음.
			}
			//flush 자동으로 => flush()메소드를 실행 안해도 된다.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fis != null) fis.close();
					if(fos != null) fos.close();
					if(bis != null) bis.close();
					if(bos != null) bos.close();
					if(ps != null) ps.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
		}
		
		
	}

}
