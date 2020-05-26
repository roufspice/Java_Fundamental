package java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {

	public FileInputOutputStreamDemo() {

	}

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe"); //읽을대상
			fos = new FileOutputStream("c:\\dev\\jdk.exe"); //출력대상
			
			//fis.read() : 1byte 읽어서 반환한다. 더이상 읽을 byte가 없으면 -1을 반환한다.
			int readByte = 0;
			while ((readByte = fis.read()) != -1) {	//더이상 읽을 byte가 없을 때까지 무한반복;
													//.read():읽어올  byte가 없으면 -1이 나옴
				//fos.write(~) : 1 byte 쓰기
				fos.write(readByte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)fis.close();	//fis객체가 빈값이 아니라면(객체가 뭐라도 있다면) 닫아주고, 파일닫기
				if (fos != null)fos.close();	//fos객체가 빈값이 아니라면(객체에 뭐라도 있다면) 닫아주고, 파일닫기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
