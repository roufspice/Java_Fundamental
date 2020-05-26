package codingTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Stream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		//BufferedInputStream bis = null;
		//BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		
		try {
			fis = new FileInputStream("C:\\dev\\picture.png");
			fos = new FileOutputStream("C:\\dev\\Stream\\picture_copy3.png");
			//bis = new BufferedInputStream(fis);
			//bos = new BufferedOutputStream(fos);
			ps = new PrintStream(fos, true);
			
			
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			
			while((readByteCount = fis.read(readBytes))!= -1) {
				ps.write(readBytes,0,readByteCount);
				
			}
//			bos.flush();
			
			
			
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
					if(ps != null) ps.close();
					//if(bis != null) bis.close();
					//if(bos != null) bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
		
	
}
}
