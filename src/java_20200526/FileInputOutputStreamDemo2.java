package java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo2 {
	public static void main(String[] args) {

		FileInputStream fis = null; // tip! 레퍼런스의 default 값은 null이다.
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe"); //소스(입력대상)
			fos = new FileOutputStream("c:\\dev\\jdk2.exe"); // 출력대상

			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8]; // 8KB를 생성한다.
			// fis.read(readBytes) : FileInputStream에 8192 바이트를 읽어서 readBytes에 저장하고 읽은 바이트
			// 수를 반환한다.

			while ((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes, 0, readByteCount);

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
			if(fos != null) fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				
		}

	}

}
